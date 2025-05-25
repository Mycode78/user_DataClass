package com.example.user_dataclass;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, lastNameEditText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                String lastName = lastNameEditText.getText().toString().trim();

                // ایجاد یک نمونه از کلاس UserProfile
                UserProfile userProfile = new UserProfile(name, lastName);

                // ارسال شیء با استفاده از Intent
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("userProfile", userProfile);
                startActivity(intent);
            }
        });
    }
}
