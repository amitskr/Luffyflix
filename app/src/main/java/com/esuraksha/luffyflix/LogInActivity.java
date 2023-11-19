package com.esuraksha.luffyflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        login = findViewById(R.id.login);
        login.setOnClickListener(v->{

        });
    }
}