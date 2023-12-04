package com.example.ecommercefinal;

public class Product {
    private String description, eligibleReturnDuration, imageUrl, name, price;

    public Product() {
        // Default constructor required for calls to DataSnapshot.getValue(Product.class)
    }

    public String getDescription() { return description; }
    public String getEligibleReturnDuration() { return eligibleReturnDuration; }
    public String getImageUrl() { return imageUrl; }
    public String getName() { return name; }
    public String getPrice() { return price; }
}
