package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();

        Bundle b1 = getIntent().getExtras();
        String data = b1.getString("user_data");
        txt1.setText(data);
    }

    public void initView(){
        txt1 = findViewById(R.id.result);
    }
}