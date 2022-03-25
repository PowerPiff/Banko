package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_newpayeeadded extends AppCompatActivity {

    TextView back, newpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpayeeadded);

        back = findViewById(R.id.btn_back_newypayadded);
        newpay = findViewById(R.id.new_payee);
        newpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_newpayeeadded.this , activity_senddeposit.class);
                startActivity(intent);
            }
        });


        back.setOnClickListener(new View.OnClickListener() { //back to home screen
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_newpayeeadded.this , accounts_mainpage.class);
                startActivity(intent);
            }
        });
    }
}