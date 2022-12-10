package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {
     public Validator name = (name) -> {
         Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
         boolean isValid = pattern.matcher(name).matches();
         if (isValid) {
             return true;
         } else {
             throw new UserRegistrationException("Invalid Name => " + name);
         }
    };
// A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods
    public Validator validEmailId = (email) -> {
       Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$");
        boolean isValid = pattern.matcher(email).matches();
        if (isValid) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid email");
        }
    };
// validation lambda 
    public Validator validPhoneNumber = (phoneNumber) -> {
        Pattern pattern = Pattern.compile("^[9][1][ ][6-9][0-9]{9}$");
        boolean isValid = pattern.matcher(phoneNumber).matches();
        if (isValid) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid phone number");
        }
    };
//valid password 
    public Validator validPassword = (password) -> {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$");
        boolean isValid = pattern.matcher(password).matches();
        if(isValid){
            return true;
        }
        else{
            throw new UserRegistrationException("Invalid password ");
        }
    };
}
