package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_payeedetails extends AppCompatActivity {

    ImageView add_pay , back;
    TextView pay1 , pay2 , pay3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payeedetails);

        back = findViewById(R.id.back_paydetails);
        pay1 = findViewById(R.id.payeer1);
        pay2 = findViewById(R.id.payeer2);
        pay3 = findViewById(R.id.payee3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payeedetails.this , activity_payandtransfer.class);
                startActivity(intent);
            }
        });
        pay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payeedetails.this , activity_senddeposit.class);
                startActivity(intent);
            }
        });

        pay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payeedetails.this , activity_senddeposit.class);
                startActivity(intent);
            }
        });
        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payeedetails.this , activity_senddeposit.class);
                startActivity(intent);
            }
        });

        add_pay = findViewById(R.id.add_pay);
        add_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_payeedetails.this , activity_addpayee.class);
                startActivity(intent);
            }
        });

    }
}