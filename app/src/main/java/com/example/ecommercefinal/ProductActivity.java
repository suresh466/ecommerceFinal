package com.example.ecommercefinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter adapter;

    // Sample static data
    private String[] productNames = {"Product 1", "Product 2", "Product 3"};
    private int[] productImages = {R.drawable.product_towel, R.drawable.product_tshirt, R.drawable.product_shorts}; // Example drawable resources
    private String[] productPrices = {"$10", "$20", "$30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ProductAdapter(productNames, productImages, productPrices);
        recyclerView.setAdapter(adapter);
    }

    private class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

        String[] names;
        int[] images;
        String[] prices;

        ProductAdapter(String[] names, int[] images, String[] prices) {
            this.names = names;
            this.images = images;
            this.prices = prices;
        }

        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            holder.productName.setText(names[position]);
            holder.productImage.setImageResource(images[position]);
            holder.productPrice.setText(prices[position]);
        }

        @Override
        public int getItemCount() {
            return names.length;
        }

        class ProductViewHolder extends RecyclerView.ViewHolder {
            TextView productName, productPrice;
            ImageView productImage;

            ProductViewHolder(View itemView) {
                super(itemView);
                productName = itemView.findViewById(R.id.productName);
                productImage = itemView.findViewById(R.id.productImage);
                productPrice = itemView.findViewById(R.id.productPrice);
            }
        }
    }
}
