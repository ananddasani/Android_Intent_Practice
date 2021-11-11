package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText fetchMessage;
    Button dialButton, changeActivityButton, showLocationButton, showWebPageButton, showActivitiesButton, passDataButton, letsGetProButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //event list
        fetchMessage = findViewById(R.id.fetchMessage);

        dialButton = findViewById(R.id.dialButton);
        changeActivityButton = findViewById(R.id.changeActivityButton);
        showLocationButton = findViewById(R.id.showActivitiesButton);
        showWebPageButton = findViewById(R.id.showWebPageButton);
        showActivitiesButton = findViewById(R.id.showActivitiesButton);
        passDataButton = findViewById(R.id.passDataButton);
        letsGetProButton = findViewById(R.id.passDataButton);

        //set event listener
        dialButton.setOnClickListener(this);
        changeActivityButton.setOnClickListener(this);
        showLocationButton.setOnClickListener(this);
        showWebPageButton.setOnClickListener(this);
        showActivitiesButton.setOnClickListener(this);
        passDataButton.setOnClickListener(this);
        letsGetProButton.setOnClickListener(this);
    }

    //optimized approach to handle all button clicks
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dialButton: {

                //opening the dial box                        tel: datatype is compulsory for dial
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9426285563"));
                startActivity(intent);
                break;
            }
            case R.id.changeActivityButton: {

                //change the screen
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            }
            case R.id.showLocationButton: {

                //showing the specific location                 geo: datatype is compulsory for opening google map
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:21.6401403,69.6384748,15?z=16"));
                startActivity(intent);
                break;
            }
            case R.id.showWebPageButton: {

                //opening the my github page/account                https: is compulsory for opening any website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/ananddasani"));
                startActivity(intent);
                break;
            }
            case R.id.showActivitiesButton: {

                //showing the available activity option list
                Intent intent = new Intent(Intent.ACTION_VIEW);
                startActivity(intent);
                break;
            }
            case R.id.passDataButton: {

                //change the screen
                Intent intent = new Intent(this, MainActivity2.class);

                //fetch the message given by the user
                String message = fetchMessage.getText().toString();

                // pass the data too
                intent.putExtra("KEY", message);
                startActivity(intent);
                break;
            }
            case R.id.letsGetProButton: {

                //getting professional by making available our app to options list (explicit intent)
                Intent intent = new Intent("android.intent.category.DEFAULT");
                startActivity(intent);
                break;
            }
        }
    }
}