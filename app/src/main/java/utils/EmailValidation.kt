package utils

import java.util.regex.Pattern

class EmailValidation {
    companion object {
        fun validateEmail(email: String): Boolean {
            val pattern = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+\$"
            return Pattern.matches(pattern, email)
        }
    }
}