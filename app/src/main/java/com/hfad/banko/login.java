package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreate_account();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAccounts_mainpage();
            }
        });


    }
    
    public void openCreate_account(){
        Intent intent = new Intent(this, create_account.class);
        startActivity(intent);
    }

    public void openAccounts_mainpage(){
        Intent intent = new Intent(this, accounts_mainpage.class);
        startActivity(intent);
    }

}