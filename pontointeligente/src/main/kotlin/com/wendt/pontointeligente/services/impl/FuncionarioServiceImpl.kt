package com.wendt.pontointeligente.services.impl

import com.wendt.pontointeligente.documents.Funcionario
import com.wendt.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl : FuncionarioService {


    override fun persistir(funcionario: Funcionario): Funcionario {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buscarPorCpf(cpf: String): Funcionario? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buscarPorEmail(email: String): Funcionario? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buscarPorId(id: String): Funcionario? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}