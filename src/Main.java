import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task6();
        task3();
        task4();
        task5();
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
        String word = "RACEcar";
        isPalindrome(word);
    }

    public static String reverseString(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; --i)
            reversedWord += word.charAt(i);
        return reversedWord;


    }

    public static Boolean isPalindrome(String word) {
        word = word.toLowerCase();
        if (word.equals(reverseString(word))) {
            System.out.println("Полиндром");
        } else {
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

    public static void task4() {
        String[] words = {"aa", "bb", "cc", "aa", "bb", "dd"};
        System.out.println(keepDistinct(words));
    }

    public static String keepDistinct(String... arr) {
        return Arrays.stream(arr)
                .distinct()
                .collect(Collectors.joining(", ", "[", "]")); // в виде "[a, b, c]"
//      .collect(Collectors.joining(", ")); // с разделителем ", " - в виде "a, b"
//      .collect(Collectors.joining()); // без разделителя, в виде "ab"
    }

    public static void task5() {
        System.out.println("Задача 5");
        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }
        System.out.println(Arrays.toString(firstArray));
        int[] newArray = Arrays.copyOfRange(firstArray, 3, 7);
        System.out.println(Arrays.toString(newArray));
    }


}