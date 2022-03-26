package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;


public class accounts_mainpage extends AppCompatActivity {
    private ImageButton back_button;
    private ImageButton depositButton;
    private ImageButton menuButton;
    private ImageButton transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts_mainpage);

        back_button = findViewById(R.id.imageButton2);
        transfer = findViewById(R.id.imageButton15);
        depositButton = findViewById(R.id.imageButton11);
        menuButton = findViewById(R.id.imageButton10);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        transfer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openTransfer();
            }
        });

        depositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                openDeposit();
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                openMenu();
            }
        });
    }



    public void openLogin () {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void openTransfer(){
        Intent intent = new Intent(this, activity_payandtransfer.class);
        startActivity(intent);
    }

    public void openMenu() {
        Intent intent = new Intent(this, activity_settings.class);
        startActivity(intent);
    }

    public void openDeposit() {
        Intent intent = new Intent(this, activity_scanfront.class);
        startActivity(intent);
    }
}
