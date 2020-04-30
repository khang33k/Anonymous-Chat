package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void connect(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void LSA(View view) {

    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.message,Toast.LENGTH_SHORT);
        toast.show();
    }
}
