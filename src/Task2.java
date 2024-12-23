import java.util.*;

class Task2 {
    static void Proceed() {
        List<String> products = Arrays.asList(
                "Bread", "Milk", "Oat", "Milk", "Bread"
        );

        System.out.println("All products:");
        products.forEach(System.out::println);

        System.out.println("\nProducts with names shorter than 5 characters:");
        products.stream()
                .filter(product -> product.length() < 5)
                .forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter product name to count its occurrences: ");
        String inputProduct = scanner.nextLine();

        long count = products.stream()
                .filter(product -> product.equalsIgnoreCase(inputProduct))
                .count();
        System.out.println("Occurrences of '" + inputProduct + "': " + count);

        System.out.print("\nEnter starting letter: ");
        char startingLetter = scanner.nextLine().charAt(0);

        System.out.println("\nProducts starting with '" + startingLetter + "':");
        products.stream()
                .filter(product -> product.toLowerCase().startsWith(Character.toString(startingLetter).toLowerCase()))
                .forEach(System.out::println);

        System.out.println("\nProducts Bread category:");
        products.stream()
                .filter(product -> product.equalsIgnoreCase("Bread"))
                .forEach(System.out::println);
    }
}
