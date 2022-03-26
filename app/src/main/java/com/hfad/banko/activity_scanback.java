package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;

public class activity_scanback extends AppCompatActivity {

    private ImageButton backscnbtn4;
    private Button completeButton;
    private ImageButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanback);

        completeButton= findViewById(R.id.completeButton);
        backscnbtn4 = findViewById(R.id.backscnbtn4);
        homeButton = findViewById(R.id.homeButton);

        backscnbtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openScanfront();
            }
        });

        completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAmount();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }

    public void openScanfront(){
        Intent intent = new Intent(this, activity_scanfront.class);
        startActivity(intent);
    }

    public void openAmount(){
        Intent intent = new Intent(this, activity_senddeposit.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, accounts_mainpage.class);
        startActivity(intent);
    }
}