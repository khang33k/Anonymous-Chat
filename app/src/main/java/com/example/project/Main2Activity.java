package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void btm(View view) {
        finish();
    }
}
