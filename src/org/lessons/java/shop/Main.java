package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products ?");
        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        Product[] listOfProducts = new Product[numberOfProducts];

        for (int i = 0; i < listOfProducts.length ; i++) {
            System.out.println("What's prduct's name ?");
            String productName = scanner.nextLine();
            System.out.println("Describe the product");
            String productDescription = scanner.nextLine();
            System.out.println("How much does the product cost");
            double productPrice = Double.parseDouble(scanner.nextLine());
            Product product = new Product(productName,productDescription,productPrice);
            listOfProducts[i] = product;
        }
        System.out.println("Your products");
        for (int i = 0; i < listOfProducts.length ; i++) {
            System.out.println("Product:" + listOfProducts[i].getProductName()+" "
                    + listOfProducts[i].getProductCode()+" "
                    +"Description:"+" "
                    +listOfProducts[i].getProductDescription()+" "
                    +"Price"+listOfProducts[i].getProductPrice()+"$"+" "
                    +"Price with IVA:"+ listOfProducts[i].getIva()+"$");
        }
      scanner.close();
    }
}
