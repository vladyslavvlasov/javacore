package com.vladyslavvlasov.app.classwork.lesson12;

/**
 * Created by Murcielago on 09.11.2016.
 */
public class PalindromeWithStringBuilder {
    public static void main(String[] args) {
        PalindromeWithStringBuilder.checkIfPalindrome("kayak");
        PalindromeWithStringBuilder.convertString();
    }

    public static void checkIfPalindrome(String s) {
        StringBuilder newBuild = new StringBuilder(s);
        String newString = newBuild.reverse().toString();
        if (s.equals(newString)) {
            System.out.println("You have a palindrome");
        } else
            System.out.println("Nope, this is not a palindrome");
    }
    public static void convertString() {
        char[] charArr = {'6', '&', 'a'};
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<charArr.length;i++){
            builder.append(charArr[i]);
        }
        System.out.println(builder);
    }
}
