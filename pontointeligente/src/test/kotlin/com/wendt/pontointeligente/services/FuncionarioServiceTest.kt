package com.wendt.pontointeligente.services

import com.wendt.pontointeligente.documents.Funcionario
import com.wendt.pontointeligente.enums.PerfilENum
import com.wendt.pontointeligente.repositories.FuncionarioRepository
import com.wendt.pontointeligente.utils.SenhaUtils
import org.junit.Assert
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class FuncionarioServiceTest {

    @MockBean
    private val funcionarioRepository: FuncionarioRepository? = null

    @Autowired
    private val funcionarioService: FuncionarioService? = null


    private val email: String = "email@email.com"
    private val cpf: String = "34234855948"
    private val id: String = "1"


    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(funcionarioRepository?.save(Mockito.any(Funcionario::class.java))).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findOne(id)).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findByEmail(email)).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findByCpf(cpf)).willReturn(funcionario())
    }


    @Test
    fun testPersistirFuncionario() {
        val funcionario: Funcionario? = this.funcionarioService?.persistir(funcionario())
        assertNotNull(funcionario)

    }

    @Test
    fun testBuscarFuncionarioPorId() {
        val funcionario: Funcionario? = this.funcionarioService?.buscarPorId(id)
        assertNotNull(funcionario)

    }

    @Test
    fun testBuscarFuncionarioPorEmail(){
        val funcionario: Funcionario? = this.funcionarioService?.buscarPorEmail(email)
        assertNotNull(funcionario)
    }

    @Test
    fun testBuscarFuncionarioPorCpf(){
        val funcionario: Funcionario? = this.funcionarioService?.buscarPorCpf(cpf)
        assertNotNull(funcionario)
    }


    private fun funcionario(): Funcionario =
            Funcionario("Home", email, SenhaUtils().gerarBcrypt("123456"), cpf, PerfilENum.ROLE_USUARIO, id)

}