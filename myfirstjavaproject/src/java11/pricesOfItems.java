package java11;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pricesOfItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> prices = new ArrayList<>();
        String input;

        while (true) {
            System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    insertPrice(prices);
                    break;
                case "2":
                    viewPurchaseTotal(prices);
                    break;
                case "3":
                    System.out.println("Exit program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        }
    }

    private static void insertPrice(List<Double> prices) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Insert price: ");
            String input = scanner.nextLine();
            try {
                double price = Double.parseDouble(input);
                prices.add(price);
                savePricesToFile(prices);
                System.out.println("Price has been saved to the file.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid price.");
            }

            System.out.print("Do you want to enter the price for more items? (Yes/No): ");
            input = scanner.nextLine().toLowerCase();
            if (!input.equals("yes")) {
                break;
            }
        }
    }

    private static void savePricesToFile(List<Double> prices) {
        Path filePath = Path.of("prices.txt");
        try {
            Files.write(filePath, getPriceStrings(prices));
        } catch (IOException e) {
            System.out.println("An error occurred while saving prices to the file.");
        }
    }

    private static List<String> getPriceStrings(List<Double> prices) {
        List<String> priceStrings = new ArrayList<>();
        for (Double price : prices) {
            priceStrings.add(price.toString());
        }
        return priceStrings;
    }

    private static void viewPurchaseTotal(List<Double> prices) {
        double total = prices.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total Price of all items is: " + total);
        saveTotalToFile(total);
    }

    private static void saveTotalToFile(double total) {
        Path filePath = Path.of("total.txt");
        try {
            Files.write(filePath, Double.toString(total).getBytes());
        } catch (IOException e) {
            System.out.println("An error occurred while saving the total to the file.");
        }
    }
}



