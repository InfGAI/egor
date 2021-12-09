package com.example.testingapplication.unit


import com.example.testingapplication.MainActivity
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import utils.EmailValidation


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ValidateEmailTest {

    @Test
    fun validateTrueEmail() {
        val email = "testTest@gmail.com"
        assertTrue(MainActivity.validateEmail(email))
    }

    @Test
    fun validateEmptyEmail() {
        val email = ""
        assertFalse(EmailValidation.validateEmail(email))
    }
}

