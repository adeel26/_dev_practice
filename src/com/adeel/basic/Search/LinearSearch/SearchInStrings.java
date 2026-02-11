package com.adeel.basic.Search.LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Adeel";
        char target = 'd';

        System.out.println(search1(name, target));
        System.out.println(search2(name, target));
    }

    static boolean search1(String str, char target) {
        if( str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if( str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()){
            if (target == ch){
                return true;
            }
        }
        return false;
    }
}
