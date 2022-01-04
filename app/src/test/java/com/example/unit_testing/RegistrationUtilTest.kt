package com.example.unit_testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Philip",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Lahm",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    //empty password
    // password repeated incorreclty
    // password has lt 2 digits

    @Test
    fun `empty passwords return false `(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Rahim",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Rahim",
            "1234",
            "1233"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password has less than 2 digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Rahim",
            "Roman1",
            "Roman1"
        )

        assertThat(result).isFalse()
    }


}