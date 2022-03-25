package com.hfad.banko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_addpayee extends AppCompatActivity {

    Button add_payment;
    ImageView Back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpayee);

        Back_btn = findViewById(R.id.btn_back_addpayee);
        Back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_addpayee.this , activity_payeedetails.class);
                startActivity(intent);
            }
        });
        add_payment = findViewById(R.id.btn_add_payment);
        add_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_addpayee.this , activity_newpayeeadded.class);
                startActivity(intent);
            }
        });

    }
}