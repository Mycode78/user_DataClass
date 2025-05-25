package com.example.user_dataclass;



import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView profileTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileTextView = findViewById(R.id.profileTextView);

        // دریافت شیء کلاس UserProfile از Intent
        Intent intent = getIntent();
        UserProfile userProfile = (UserProfile) intent.getSerializableExtra("userProfile");

        if (userProfile != null) {
            profileTextView.setText("نام: " + userProfile.getName() + "\nنام خانوادگی: " + userProfile.getLastName());
        }
    }
}
