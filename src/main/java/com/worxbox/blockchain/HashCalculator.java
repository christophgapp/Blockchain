package com.worxbox.blockchain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalculator {
    static String calculateToHex(String message) {
        try {
            var instance = MessageDigest.getInstance("SHA-256");
            return bytesToHex(instance.digest(message.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        var result = new StringBuilder();
        for (byte b : bytes) {
            var value = Integer.toHexString(0xff & b);
            if(value.length() == 1) {
                result.append("0");
            }
            result.append(value);
        }
        return result.toString();
    }
}
