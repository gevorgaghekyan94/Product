package com.company;

import java.util.Random;

public class Product {
    private String title;
    private int price;
    private int rating;

    Random random = new Random();

    public Product(String title) {
        this.title = title;
        this.price = random.nextInt(50) + 50;
        this.rating = random.nextInt(10);
    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = random.nextInt(50) + 50;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = random.nextInt(10);
    }
}
