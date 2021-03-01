package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        e1 = findViewById(R.id.edit1);
    }

    public void doSomething(View view) {
        Intent i1 = new Intent(MainActivity.this, Second.class);
        i1.putExtra("user_data",e1.getText().toString());
        startActivity(i1);
    }
}