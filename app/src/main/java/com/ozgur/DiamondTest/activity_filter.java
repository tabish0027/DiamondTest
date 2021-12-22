package com.ozgur.DiamondTest;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class activity_filter extends AppCompatActivity {
    RecyclerView rv_sizes;
    adapter_size adp_sizes;
    double[] from = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.8,0.9,1.0,1.5,2,3.0,4.0,5.0,10.0};
    double[] to   = {0.09,0.19,0.29,0.39,0.49,0.59,0.69,0.79,0.89,0.89,0.99,1.49,1.99,2.99,3.99,4.99,9.99,19.0};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        rv_sizes = findViewById(R.id.rv_sizes);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_sizes.setLayoutManager(layoutManager);
        adp_sizes = new adapter_size(from,to);
        rv_sizes.setAdapter(adp_sizes);
        adp_sizes.notifyDataSetChanged();
    }
}