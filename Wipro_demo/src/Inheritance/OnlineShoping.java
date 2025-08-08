package Inheritance;

import java.util.*;

class Product {
 protected String name;
 protected double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public void displayInfo() {
     System.out.println("Product: " + name + ", Price: ₹" + price);
 }

 public double getPrice() {
     return price;
 }

 public String getName() {
     return name;
 }
}

class Electronics extends Product {
 private int warrantyYears;

 public Electronics(String name, double price, int warrantyYears) {
     super(name, price);
     this.warrantyYears = warrantyYears;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Category: Electronics, Warranty: " + warrantyYears + " years");
 }
}


class Clothing extends Product {
 private String size;

 public Clothing(String name, double price, String size) {
     super(name, price);
     this.size = size;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Category: Clothing, Size: " + size);
 }
}


class ShoppingCart {
 private List<Product> items = new ArrayList<>();

 public void addProduct(Product p) {
     items.add(p);
     System.out.println(p.getName() + " added to cart.");
 }

 public void viewCart() {
     System.out.println("\n🛒 Your Cart:");
     double total = 0;
     for (Product p : items) {
         p.displayInfo();
         total += p.getPrice();
         System.out.println("--------------");
     }
     System.out.println("Total Price: ₹" + total);
 }
}

//Main class
public class OnlineShoping {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     ShoppingCart cart = new ShoppingCart();

     System.out.println("=== Welcome to Online Shop ===");

     Electronics laptop = new Electronics("Laptop", 50000, 2);
     Clothing tshirt = new Clothing("T-Shirt", 799, "M");

     int choice;
     do {
         System.out.println("\n1. View Products");
         System.out.println("2. Add Laptop to Cart");
         System.out.println("3. Add T-Shirt to Cart");
         System.out.println("4. View Cart");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 laptop.displayInfo();
                 System.out.println("--------------");
                 tshirt.displayInfo();
                 break;
             case 2:
                 cart.addProduct(laptop);
                 break;
             case 3:
                 cart.addProduct(tshirt);
                 break;
             case 4:
                 cart.viewCart();
                 break;
             case 0:
                 System.out.println("Thank you for shopping with us!");
                 break;
             default:
                 System.out.println("Invalid choice.");
         }
     } while (choice != 0);

     sc.close();
 }
}

