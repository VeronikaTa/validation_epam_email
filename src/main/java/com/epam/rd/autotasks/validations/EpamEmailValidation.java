package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if(email == null){
            return false;
        }
        Pattern epamEmailPattern = Pattern.compile("[a-z]+_[a-z]+\\d*@epam\\.com");
        Matcher matcher = epamEmailPattern.matcher(email);
        return matcher.matches();
    }
}





