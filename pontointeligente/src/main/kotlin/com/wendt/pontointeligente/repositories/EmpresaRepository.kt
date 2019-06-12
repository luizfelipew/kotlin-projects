package com.wendt.pontointeligente.repositories

import com.wendt.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cnpn: String): Empresa
}