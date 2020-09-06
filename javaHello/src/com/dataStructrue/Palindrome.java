package com.dataStructrue;

public class Palindrome {
    public boolean isPalindromeWord(String str) {
        if (str.length() <= 1) return true;
        else if (str.length() == 2) return str.charAt(0) == str.charAt(1);
        else {
            return (str.charAt(0) == str.charAt(str.length() - 1)) && isPalindromeWord(str.substring(1, str.length() - 1));
        }
    }

    public boolean isPalindromeSentence(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        str = str.toUpperCase();
        return isPalindromeWord(str);
    }
}
