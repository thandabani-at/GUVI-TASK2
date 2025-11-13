package question2;
import java.util.Scanner;

class ProductMain {
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] Products = new Product[2];

        for (int i = 0; i < Products.length; i++) {
            System.out.println("Enter details for products " + (i + 1) + ":");
            System.out.println("Enter product ID : ");
            int id = sc.nextInt();
            System.out.println("Enter Product Price : ");
            int price = sc.nextInt();
            System.out.println("Enter Product Quantity : ");

            int quantity = sc.nextInt();
            Products[i] = new Product(id, price, quantity);
        }

        double maxPrice = Products[0].price;
        int maxId = Products[0].id;

        for (int i = 1; i < Products.length; i++) {
            if (Products[i].price > maxPrice) {
                maxPrice = Products[i].price;
                maxId = Products[i].id;
            }

        }
        System.out.println("\nproduct ID with highest price :" + maxId);

        double totalAmount = calculateTotalAmount(Products);
        System.out.println("Toatal amount spent an all products : " + totalAmount);
    }
}
