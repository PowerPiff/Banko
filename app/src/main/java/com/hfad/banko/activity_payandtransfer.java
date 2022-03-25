package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_payandtransfer extends AppCompatActivity {

    TextView back;
    TextView pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payandtransfer);

        back = findViewById(R.id.btn_back_payntransfer);
        pay = findViewById(R.id.txt_payers);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payandtransfer.this , activity_payeedetails.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payandtransfer.this , accounts_mainpage.class);
                startActivity(intent);
            }
        });

    }
}