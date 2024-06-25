package com.example.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondPage extends AppCompatActivity {
    TextView email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_page);
        email = findViewById(R.id.email_display);
        password=findViewById(R.id.password_display);
        Intent intent = getIntent();
        String email_in=intent.getStringExtra("email");
        String password_in=intent.getStringExtra("password");
        String gender_in= intent.getStringExtra("gender");
        email.setText(email_in);
        password.setText(password_in);
    }

}