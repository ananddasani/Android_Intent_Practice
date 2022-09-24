# Android_Intent_Practice
Android App to practice Intent (Explicit &amp; Implicit Intents)

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)


# Code

#### 1st Activity 
```
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
```

# App Highlight
![Intent Practice App](https://user-images.githubusercontent.com/74413402/192093022-b515487a-2e94-4756-8104-ef515dcdacd2.png)
![Intent Practice App1](https://user-images.githubusercontent.com/74413402/192093024-008abd4b-0176-41d1-a8b4-b6196b72f6fd.png)

![Intent Practice Code](https://user-images.githubusercontent.com/74413402/192093018-9654f391-3d60-48f1-ab69-2571695a0080.png)
