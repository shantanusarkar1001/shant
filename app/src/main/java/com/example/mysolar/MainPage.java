package com.example.mysolar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        findViewById(R.id.iv_about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,About.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_certificate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,certificate.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_videos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, videos.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_products).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,Products.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_supply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,Supply.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_members).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,Members.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_contact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,Contact.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.iv_download).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,Download.class);
                startActivity(intent);
            }
        });
    }
}

