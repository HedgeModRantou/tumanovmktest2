package com.example.tumanovmktest2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LayoutDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_demo);
    }

    public void onBackPressed(View view) {
        finish();
    }

    public void onLinearClick(View view) {
        Toast.makeText(this, "LinearLayout: элементы выстраиваются в линию", Toast.LENGTH_SHORT).show();
    }

    public void onRelativeClick(View view) {
        Toast.makeText(this, "RelativeLayout: позиция относительно других элементов", Toast.LENGTH_SHORT).show();
    }

    public void onFrameClick(View view) {
        Toast.makeText(this, "FrameLayout: элементы накладываются друг на друга", Toast.LENGTH_SHORT).show();
    }
}
