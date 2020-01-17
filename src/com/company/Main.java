package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Snickers");
        products.add(product1);
        Product product2 = new Product("Twix");
        products.add(product2);
        Product product3 = new Product("Mars");
        products.add(product3);
        Product product4 = new Product("Kit-Kat");
        products.add(product4);
        Product product5 = new Product("Coca-Cola");
        products.add(product5);
        Product product6 = new Product("Sprite");
        products.add(product6);
        Product product7 = new Product("Fanta");
        products.add(product7);
        Product product8 = new Product("Marlboro");
        products.add(product8);
        Product product9 = new Product("Winston");
        products.add(product9);
        Product product10 = new Product("Ararat");
        products.add(product10);
        int bestRating = products.get(0).getRating();
        for (int i = 0; i < products.size() - 1; i++) {
            if (bestRating < products.get(i + 1).getRating()) {
                bestRating = products.get(i + 1).getRating();
            }
        }
        ArrayList<Product> productsWithBestRating = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getRating() == bestRating) {
                productsWithBestRating.add(products.get(i));
            }
        }

        for (int i = 0; i < productsWithBestRating.size(); i++) {
            System.out.println(productsWithBestRating.get(i).getTitle());
        }

    }
}
