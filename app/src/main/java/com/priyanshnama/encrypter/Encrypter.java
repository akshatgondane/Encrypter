package com.priyanshnama.encrypter;

import java.util.HashMap;
import java.util.Map;

public abstract class Encrypter {
    private static final String keys = "abcdefghijklmnopqrstuvwxyz !", values = "!abcdefghijklmnopqrstuvwxyz ";
    private static final Map<Character, Character> map = new HashMap<>();

    public static String encrypt(String data) {
        for (int i = 0; i < 28; i++) {
            map.put(keys.charAt(i), values.charAt(i));
        }
        char[] charArray = data.toCharArray();
        StringBuilder new_data = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            new_data.append(map.get(charArray[i]));
        }
        return new_data.toString();
    }

    public static String decrypt(String data) {
        for (int i = 0; i < 28; i++) {
            map.put(values.charAt(i), keys.charAt(i));
        }
        char[] charArray = data.toCharArray();
        StringBuilder new_data = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            new_data.append(map.get(charArray[i]));
        }
        return new_data.toString();
    }
}