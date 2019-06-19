package com.wendt.pontointeligente.services

import com.wendt.pontointeligente.documents.Empresa
import com.wendt.pontointeligente.repositories.EmpresaRepository
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class EmpresaServiceTest {

    @Autowired
    val empresaService: EmpresaService? = null

    @MockBean
    private val empresaRepository: EmpresaRepository? = null

    private val CNPJ = "51463645000100"

    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
    }

    @Test
    fun testBuscarEmpresaCnpj(){
        val empresa: Empresa? = empresaService?.buscarPorCnpj(CNPJ)
        assertNotNull(empresa)
    }


    @Test
    fun testPersistirEmpresa(){
        val empresa: Empresa? = empresaService?.persistir(empresa())
        assertNotNull(empresa)

    }

    private fun empresa(): Empresa = Empresa("Razão social", CNPJ, "1")

}