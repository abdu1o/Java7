import java.util.*;

class Task1 {
     static void Proceed() {
        List<Integer> randomNumbers = new Random()
                .ints(10, -1000, 1000)
                .boxed()
                .toList();

        System.out.println("Generated numbers: " + randomNumbers);

        long positiveCount = randomNumbers.stream()
                .filter(num -> num > 0)
                .count();

        long negativeCount = randomNumbers.stream()
                .filter(num -> num < 0)
                .count();

        long twoDigitCount = randomNumbers.stream()
                .filter(num -> Math.abs(num) >= 10 && Math.abs(num) < 100)
                .count();

        long palindromicCount = randomNumbers.stream()
                .filter(Task1::isPalindromic)
                .count();

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Two-digit numbers count: " + twoDigitCount);
        System.out.println("Palindromic numbers count: " + palindromicCount);
    }

    private static boolean isPalindromic(int num) {
        String str = Integer.toString(Math.abs(num));
        return str.contentEquals(new StringBuilder(str).reverse());
    }
}
