package com.example.ecommercefinal;

import java.io.Serializable;

public class Product implements Serializable {
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
