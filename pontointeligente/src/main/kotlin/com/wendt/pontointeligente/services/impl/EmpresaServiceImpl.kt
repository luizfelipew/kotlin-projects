package com.wendt.pontointeligente.services.impl

import com.wendt.pontointeligente.documents.Empresa
import com.wendt.pontointeligente.repositories.EmpresaRepository
import com.wendt.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}