package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;


public class accounts_mainpage extends AppCompatActivity {
    private ImageButton back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts_mainpage);

        back_button = (ImageButton) findViewById(R.id.imageButton2);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  openLogin(); }


        });
    }

    public void openLogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}