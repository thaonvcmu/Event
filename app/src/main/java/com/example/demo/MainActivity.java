package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvDemo;
    Button btnChange;
    Button btnHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDemo = (TextView)findViewById(R.id.tvDemo);
        btnChange = (Button)findViewById(R.id.btnChange);
        btnChange.setOnClickListener(this);
        btnHello = (Button)findViewById(R.id.btnHello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDemo.setText("Hello World!");
            }
        });
    }

    @Override
    public void onClick(View v) {
        //Nếu người dùng click vào Button Change
        if(v == btnChange) {
            tvDemo.setText("Xin chào bạn!");
        }
    }
}
