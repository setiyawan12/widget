package com.plugin.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Button btnButton, btnImage, btnLinear, btnRelative, btnScrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        nyongpanIntent();
        contohfungsi();

    }

    private void contohfungsi() {

    }

    private void findView() {
        btnButton = findViewById(R.id.btnButton);
        btnImage = findViewById(R.id.btnImage);
        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnScrollview = findViewById(R.id.btnScrollview);
    }

    private void nyongpanIntent() {

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(btn);
            }
        });

        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(MainActivity.this,ImageActivity.class);
                startActivity(img);
            }
        });

        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lnr = new Intent(MainActivity.this,LinearAcitivy.class);
                startActivity(lnr);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rltv = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(rltv);
            }
        });

        btnScrollview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrll = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(scrll);
            }
        });
    }


}
