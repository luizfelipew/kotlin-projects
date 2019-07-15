package com.wendt.pontointeligente.services

import com.wendt.pontointeligente.documents.Funcionario
import com.wendt.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface LancamentoService {

    fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento>

    fun buscarPorId(id: String): Lancamento?

    fun persistir(lancamento: Lancamento): Lancamento

    fun remover(id: String)


}