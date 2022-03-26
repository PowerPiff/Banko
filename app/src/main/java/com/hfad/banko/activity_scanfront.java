package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_scanfront extends AppCompatActivity {

    private Button scnbutton;
    private ImageButton backButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanfront);

        scnbutton = findViewById(R.id.scnbutton);
        backButton1 = findViewById(R.id.backButton1);

        scnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openScanBack();}
        });

        backButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {openAccounts();}
        });
    }

    public void openAccounts(){
        Intent intent = new Intent(this, accounts_mainpage.class);
        startActivity(intent);
    }

    public void openScanBack(){
        Intent intent = new Intent(this, activity_scanback.class);
        startActivity(intent);
    }
}