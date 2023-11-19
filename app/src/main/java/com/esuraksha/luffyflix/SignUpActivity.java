package com.esuraksha.luffyflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signup = findViewById(R.id.signup);
        signup.setOnClickListener(v->{
            startActivity(new Intent(SignUpActivity.this,MainActivity.class));
            finish();
        });
    }
}