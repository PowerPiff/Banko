package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_sendchequedeposit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendchequedeposit);

        Button deposit;
        TextView back;

            back = findViewById(R.id.txt_back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(activity_sendchequedeposit.this,activity_scanback.class);
                    startActivity(intent);
                }
            });
            deposit = findViewById(R.id.deposit_payment);
            deposit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(activity_sendchequedeposit.this , activity_chequedepositcomplete.class);
                    startActivity(intent);
                }
            });
        }

}