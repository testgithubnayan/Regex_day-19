package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validFirstName(String name) {
// firstName or lastName starts with Cap and has minimum 3 characters



    public void validFirstName() {


        Pattern fName = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        boolean isValid = fName.matcher(name).matches();

        if (isValid) {
            System.out.println( name+ " is Valid ");
        } else {
            System.out.println(name+ " is Invalid ");
        }
        return isValid;
    }

    public boolean validLastName(String name){
        // Validation for firstName or lastName is same
        boolean isValid = validFirstName(name);

        return isValid;
    }

    public boolean validEmailId(String email) {
        /*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
        */

        Pattern pattern=Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$");
        boolean isValid = pattern.matcher(email).matches();
        if (isValid) {
            System.out.println("Email is valid " +email);
        } else {
            System.out.println("Email is invalid " +email);
        }
        return isValid;
    }

    public boolean validPhoneNumber(String number) {
        Pattern pattern = Pattern.compile("^[9][1][ ][6-9][0-9]{9}$");
        boolean isValid = pattern.matcher(number).matches();

        if (isValid) {
            System.out.println(" number is valid " +number);
        } else {
            System.out.println("number is inValid "+number);
        }
        return isValid;
    }

    public boolean validPassword(String password){
   // password all rules 1 to 4
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$");
        boolean isValid = pattern.matcher(password).matches();
        if(isValid){
            System.out.println("password is valid "+password);
        }
        else{
            System.out.println("password is invalid " +password);
        }
        return isValid;
    }

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}[0-9]*$", lastName);

        if (fName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }

    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }


    }

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}[0-9]*$", lastName);

        if (fName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }
    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void validPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ ][6-9][0-9]{9}$", phoneNumber);

        if (number) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }

    public void validPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$",password);
        if(validatePassword){
            System.out.println("password is valid");
        }
        else{
            System.out.println("password is invalid");
        }
    }

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}[0-9]*$", lastName);

        if (fName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }
    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void validPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ ][6-9][0-9]{9}$", phoneNumber);

        if (number) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }

    public void validPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=]).{8,}$",password);
        if(validatePassword){
            System.out.println("password is valid");
        }
        else{
            System.out.println("password is invalid");
        }
    }

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}[0-9]*$", lastName);

        if (fName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }
    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void validPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ ][6-9][0-9]{9}$", phoneNumber);

        if (number) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }

    public void validPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=]).{8,}$",password);
        if(validatePassword){
            System.out.println("password is valid");
        }
        else{
            System.out.println("password is invalid");
        }
    }

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}[0-9]*$", lastName);

        if (fName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }
    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void validPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ ][6-9][0-9]{9}$", phoneNumber);

        if (number) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }

    public void validPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=]).{8,}$",password);
        if(validatePassword){
            System.out.println("password is valid");
        }
        else{
            System.out.println("password is invalid");
        }
    }

    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();

        boolean fName = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}[0-9]*$", lastName);

        if (fName) {
            System.out.println("lastname is correct ");
        } else {
            System.out.println("lastname is incorrect ");
        }
    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.nextLine();

        boolean validEmail = Pattern.matches("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$", email);
        if (validEmail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void validPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phoneNumber = sc.nextLine();
        boolean number = Pattern.matches("^[9][1][ ][6-9][0-9]{9}$", phoneNumber);

        if (number) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }

    public void validPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user password");
        String password = sc.nextLine();

        boolean validatePassword = Pattern.matches("^[a-z]{8,}$",password);
        if(validatePassword){
            System.out.println("password is valid");
        }
        else{
            System.out.println("passward is invalid");
        }
    }

    public static void main(String[] args) {

    UserRegistration regex = new UserRegistration();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first name: ");
         String firstName = sc.next();
         regex.validFirstName(firstName);

        System.out.println("\nEnter last name: ");
        String lastName = sc.next();
        regex.validLastName(lastName);

        System.out.println("\nEnter email: ");
        String validEmail = sc.next();
        regex.validLastName(validEmail);

        System.out.println("\nEnter phone number: ");
        String number = sc.next();
        regex.validLastName(number);

        System.out.println("\nEnter password: ");
        String password = sc.nextLine();
        regex.validPassword(password);

        UserRegistration userRegistration = new UserRegistration();
//        userRegistration.validFirstName();

//        userRegistration.validLastName();
//        userRegistration.validEmailId();
//        userRegistration.validPhoneNumber();
        userRegistration.validPassword();



//        userRegistration.validLastName();
        userRegistration.validEmailId();

        userRegistration.validLastName();




    }

}
