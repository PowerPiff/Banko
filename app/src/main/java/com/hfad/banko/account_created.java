package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class account_created extends AppCompatActivity {
    private Button button_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_created);

        button_continue = (Button) findViewById(R.id.button4);

        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAccounts_mainpage();
            }
        });
    }

    public void openAccounts_mainpage(){
        Intent intent = new Intent(this, accounts_mainpage.class);
        startActivity(intent);
}}