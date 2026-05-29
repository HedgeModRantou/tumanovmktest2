package com.example.tumanovmktest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvEmail;
    private TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName  = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvAge   = findViewById(R.id.tvAge);

        MyObject obj = (MyObject) getIntent().getSerializableExtra("myObject");
        if (obj != null) {
            tvName.setText(obj.getName());
            tvEmail.setText(obj.getEmail());
            tvAge.setText(String.valueOf(obj.getAge()));
        }
    }

    public void onBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void onGoToLayouts(View view) {
        Intent intent = new Intent(this, LayoutDemoActivity.class);
        startActivity(intent);
    }
}
