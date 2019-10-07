package com.gonchar.project.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonForDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonForDelete = findViewById(R.id.button);
    }

    public void onClick(View view) {
        mButtonForDelete.setVisibility(View.GONE);
    }
}
