package com.example.android.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.submit);
        final TextView tv = findViewById(R.id.show);
        final EditText et = (EditText) findViewById(R.id.plain_text_input);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = et.getText().toString(); //gets you the contents of edit text
                tv.setText("Hello, " + content);


                Context context = getApplicationContext();
                CharSequence text = "Please enter your Name!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show(); //displays it in a textview..

        }
    });

    }
}