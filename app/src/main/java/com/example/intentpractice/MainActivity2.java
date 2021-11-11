package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button backToHome;
    TextView putMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //welcome user
        Toast.makeText(this, "Welcome to Screen 2", Toast.LENGTH_SHORT).show();

        //list the view
        putMessage = findViewById(R.id.putMessage);
        backToHome = findViewById(R.id.button);

        //receiving data form Main Activity
        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("KEY"); //Extract data using key

        //Set the message
        putMessage.setText(str);

        //go to home on pressed button
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to home
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}