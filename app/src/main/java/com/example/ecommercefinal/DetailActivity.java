package com.example.ecommercefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView productImage;
    private TextView productName, productPrice, productDescription, productReturnPolicy;
    private Button buyNowButton;
    private Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        productImage = findViewById(R.id.detailImage);
        productName = findViewById(R.id.detailName);
        productPrice = findViewById(R.id.detailPrice);
        productDescription = findViewById(R.id.detailDescription);
        productReturnPolicy = findViewById(R.id.detailReturn);
        buyNowButton = findViewById(R.id.buyNowButton);

        // Receive product from Intent
        product = (Product) getIntent().getSerializableExtra("product");

        // Set product details
        Glide.with(this).load(product.getImageUrl()).into(productImage);
        productName.setText(product.getName());
        productPrice.setText("Price: " + product.getPrice());
        productDescription.setText(product.getDescription());
        productReturnPolicy.setText("Return within: " + product.getEligibleReturnDuration());

        // Set OnClickListener for the Buy Now button
        buyNowButton.setOnClickListener(view -> {
            Intent intent = new Intent(DetailActivity.this, CheckoutActivity.class);
            startActivity(intent);
        });
    }
}
