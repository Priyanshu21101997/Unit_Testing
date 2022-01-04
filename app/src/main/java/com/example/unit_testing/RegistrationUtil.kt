package com.example.unit_testing

object RegistrationUtil {

    val existingUsers = listOf<String>("Carl","Lahm")

    fun validateRegistrationInput(
        username:String,
        password:String,
        confirmPassword:String
    ):Boolean{

        if(username.isEmpty() || password.isEmpty()){
            return false
        }

        if(username in existingUsers){
            return false
        }

        if(password != confirmPassword){
            return false
        }

        if(password.count { it.isDigit() } <2){
            return false
        }

        return true;
    }
}