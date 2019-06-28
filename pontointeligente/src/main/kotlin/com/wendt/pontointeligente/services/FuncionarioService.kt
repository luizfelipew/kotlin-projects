package com.wendt.pontointeligente.services

import com.wendt.pontointeligente.documents.Funcionario
import org.springframework.stereotype.Service

interface FuncionarioService {

    fun persistir(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf: String): Funcionario?

    fun buscarPorEmail(email: String): Funcionario?

    fun buscarPorId(id: String): Funcionario?


}