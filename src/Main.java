import java.util.Arrays;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
task1(); task2(); task6(); task3();
    }

    public static void task6() {
        double number = 5;
        double exponent = 2;
        System.out.println("Число " + number + " в квадрате = " + Math.pow(number, exponent));
    }

    public static void task1() {
        Integer[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));
        Collections.reverse(Arrays.asList(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static void task2() {
        String word ="RACEcar";
        isPalindrome(word);
    }
    public static String reverseString(String word){
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; --i)
            reversedWord += word.charAt(i);
        return reversedWord;


    }
    public static Boolean isPalindrome(String word) {
        word = word.toLowerCase();
        if(word.equals(reverseString(word))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return word.equals(reverseString(word));
    }



    public static void task3() {
        String str = "Привет  мир!";
        int middleIndex = str.length() / 2;
        String firstHalf = str.substring(0, middleIndex);
        String secondHalf = str.substring(middleIndex);

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }

}