package com.hfad.banko;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_viewpin extends AppCompatActivity {
    private ImageButton back_button;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_viewpin);

        back_button = (ImageButton) findViewById(R.id.imageButton3);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSettings(); }
        });
    }

    public void openSettings() {
        Intent intent = new Intent(this, activity_settings.class);
        startActivity(intent);
    }
}