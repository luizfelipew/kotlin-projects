package com.wendt.pontointeligente.utils

import org.junit.Assert.assertTrue
import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtilsTest {

    private val SENHA = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashSenha() {
        val hash = SenhaUtils().gerarBcrypt(SENHA)
        assertTrue(bCryptEncoder.matches(SENHA, hash))
    }
}