package com.plugin.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    Button btnNormal;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        getSupportActionBar().setTitle("Button Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findView();
        aksiButton();
    }

    private void findView() {
        btnNormal = findViewById(R.id.btnNormal);
    }

    private void aksiButton() {
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Button Normal", Toast.LENGTH_SHORT).show();
            }
        });
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ButtonActivity.this, "Button Zize", Toast.LENGTH_SHORT).show();
//            }
//        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
