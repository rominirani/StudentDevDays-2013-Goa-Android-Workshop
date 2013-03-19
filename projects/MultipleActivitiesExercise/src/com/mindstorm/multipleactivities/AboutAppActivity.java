package com.mindstorm.multipleactivities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutapp);
        
        //Read the data passed
        String data1 = getIntent().getExtras().getString("data1");
        int data2 = getIntent().getExtras().getInt("data2");
        
        //Set the text
        TextView txtDataPassed = (TextView)findViewById(R.id.txtDataPassed);
        txtDataPassed.setText(data1 + " and " + data2);
    }
}
