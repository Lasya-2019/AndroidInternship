package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
    }

    public void save(View view) {
        //Explicit Intent
        // Intent i = new Intent(present activity,next activity);
        //startActivity(i)--> to start the activity, if not there, activity wont start
        String s = name.getText().toString();
        // now we shall carry data to next screen
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",s);//holding the value of "name" to carry to another activity
        startActivity(i);//activity will start

    }

    public void dial(View view) {
        //Implicit Intent
        String s = num.getText().toString().trim();
        //tel: - phone number / https:// - web site / geo:- location
        Uri u = Uri.parse("tel:"+s);
        Intent i = new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }
    Intent i = new Intent(Intent.ACTION_SEND)
}