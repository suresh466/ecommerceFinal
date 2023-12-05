package com.example.ecommercefinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckoutActivity extends AppCompatActivity {

    private Button checkoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        checkoutButton = findViewById(R.id.checkoutButton);

        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here you can add logic to handle the checkout process
                // For now, we just navigate back to MainActivity

                Intent intent = new Intent(CheckoutActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close this activity
            }
        });
    }
}
