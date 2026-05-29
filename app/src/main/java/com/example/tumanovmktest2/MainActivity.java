package com.example.tumanovmktest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editEmail;
    private EditText editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName  = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editAge   = findViewById(R.id.editAge);
    }

    public void onGoToSecond(View view) {
        String name  = editName.getText().toString().trim();
        String email = editEmail.getText().toString().trim();
        String ageStr = editAge.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || ageStr.isEmpty()) {
            Toast.makeText(this, R.string.error_empty_fields, Toast.LENGTH_SHORT).show();
            return;
        }

        int age;
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.error_invalid_age, Toast.LENGTH_SHORT).show();
            return;
        }

        MyObject myObject = new MyObject(name, email, age);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("myObject", myObject);
        startActivity(intent);
    }

    public void onGoToLayouts(View view) {
        Intent intent = new Intent(this, LayoutDemoActivity.class);
        startActivity(intent);
    }
}
