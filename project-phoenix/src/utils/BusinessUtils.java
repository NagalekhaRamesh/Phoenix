/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nagal
 */
public class BusinessUtils {
    // Util function to check if argument is a number or not
     public static boolean isNumericEntry(String str) {
        return str.matches("\\d+");
    }
     
    public static boolean isFloatEntry(String str) {
        return str.matches("\\d+(\\.\\d+)?");
    }

    // Util function to check if the argument is a valid email or not
    public static boolean isValidEmail(String email) {
        // Regex pattern for a basic email validation
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    // Util function to check if argument is a valid phone number or not
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Regular expression to validate US phone number format: (XXX) XXX-XXXX
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

        return phoneNumber.matches(regex);
    }

    // Util function to check if argument is a valid password or not
    public static boolean isValidPassword(String password) {
        boolean hasDigits = password.matches(".*\\d.*");

        // Check for special characters
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()].*");

        return hasDigits && hasSpecialChar;
    }

    // Util function to encrypt the password to a HASH
    public static String encryptPassword(String input) {
        try {
            // Create MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Add input bytes to digest
            md.update(input.getBytes());

            // Get the hash's bytes
            byte[] byteData = md.digest();

            // Convert bytes to a hexadecimal string
            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not available.");
            return null;
        }
    }
    
    public static boolean verifyPassword(String passwordHash, String inputPassword){
        return passwordHash.equals(encryptPassword(inputPassword));
    }
}
