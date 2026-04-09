package com.adeel.Questions.Basic;

public class PalindromeString {
    public static void main(String[] args) {
        String word = "lol";

        if(isPalindrome(word)) {
            System.out.println(word + " is Palindrome String");
        }
        else {
            System.out.println(word + " is not Palindrome String");
        }
    }

    public static boolean isPalindrome(String word) {

        int i = 0;
        int j = word.length()-1;

        while (i < j) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
