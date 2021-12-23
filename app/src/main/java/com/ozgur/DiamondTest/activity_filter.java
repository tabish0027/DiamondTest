package com.ozgur.DiamondTest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class activity_filter extends AppCompatActivity {
    RecyclerView rv_sizes;
    adapter_size adp_sizes;
    double[] from = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.8,0.9,1.0,1.5,2,3.0,4.0,5.0,10.0};
    double[] to   = {0.09,0.19,0.29,0.39,0.49,0.59,0.69,0.79,0.89,0.89,0.99,1.49,1.99,2.99,3.99,4.99,9.99,19.0};
    ConstraintLayout btn_pear,btn_square,btn_emerald,btn_marquee,btn_round,btn_heart,btn_radiant,btn_oval,btn_cushion;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        rv_sizes = findViewById(R.id.rv_sizes);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_sizes.setLayoutManager(layoutManager);
        adp_sizes = new adapter_size(from,to);

        btn_pear = findViewById(R.id.btn_pear);
        btn_square = findViewById(R.id.btn_square);
        btn_emerald = findViewById(R.id.btn_emerald);
        btn_marquee = findViewById(R.id.btn_marquee);
        btn_round = findViewById(R.id.btn_round);
        btn_heart = findViewById(R.id.btn_heart);
        btn_radiant = findViewById(R.id.btn_radiant);
        btn_oval = findViewById(R.id.btn_oval);
        btn_cushion = findViewById(R.id.btn_cushion);
        rv_sizes.setAdapter(adp_sizes);
        adp_sizes.notifyDataSetChanged();
        setClickevents();
    }
    public void openDiamondList(){
        Intent diamondlist = new Intent(this, activity_diamonds.class);
        this.startActivity(diamondlist);
    }
    void setClickevents(){
        btn_pear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_emerald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_marquee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_radiant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
        btn_cushion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiamondList();
            }
        });
    }

}