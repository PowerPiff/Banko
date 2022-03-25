package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_senddeposit extends AppCompatActivity {

    Button deposit;
    TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senddeposit);

        back = findViewById(R.id.txt_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_senddeposit.this,activity_payeedetails.class);
                startActivity(intent);
            }
        });
        deposit = findViewById(R.id.btn_add_payment);
        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_senddeposit.this , activity_depositcompleted.class);
                startActivity(intent);
            }
        });
    }
}