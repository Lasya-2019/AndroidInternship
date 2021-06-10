package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Declare all views here
    Button toast,count;
    TextView tv;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiate views here
        toast = findViewById(R.id.toast);//connecting views in xml with variables in java class
        count = findViewById(R.id.count);
        tv = findViewById(R.id.tv);
        //to make output of one function as input to another function, we have LISTENERS
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv.setText(""+i);
                //tv.setText(String.valueOf(i));

            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Android. Your count is"+i, Toast.LENGTH_SHORT).show();

            }
        });
    }
}