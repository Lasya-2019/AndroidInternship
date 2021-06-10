package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast,inc,dec;
    TextView tv;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast);//connecting views in xml with variables in java class
        inc = findViewById(R.id.inc);
        dec = findViewById(R.id.dec);
        tv = findViewById(R.id.tv);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv.setText(""+i);
                //tv.setText(String.valueOf(i));

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0) {
                    i--;

                    tv.setText("" + i);
                    //tv.setText(String.valueOf(i));
                }

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