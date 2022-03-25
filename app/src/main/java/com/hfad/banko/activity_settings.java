package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class activity_settings extends AppCompatActivity {
    private ImageButton back_button;
    private TextView view_pin;
    private TextView logout;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_settings);

        back_button = findViewById(R.id.imageButton2);
        view_pin = findViewById(R.id.textView5);
        logout = findViewById(R.id.textView8);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAccounts_mainpage();
            }
        });

        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {openLogout();}
        });

        view_pin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {openViewpin();}
        });
    }

    public void openAccounts_mainpage() {
        Intent intent = new Intent(this, accounts_mainpage.class);
        startActivity(intent);
    }

    public void openLogout(){
        Intent intent = new Intent(this, logout.class);
        startActivity(intent);
    }

    public void openViewpin(){
        Intent intent = new Intent(this, activity_viewpin.class);
        startActivity(intent);
    }

}