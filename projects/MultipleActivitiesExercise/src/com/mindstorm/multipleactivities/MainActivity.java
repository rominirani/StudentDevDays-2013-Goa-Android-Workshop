package com.mindstorm.multipleactivities;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnViewSubjects = (Button) findViewById(R.id.btnViewSubjects);
        btnViewSubjects.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    Intent i = new Intent(getBaseContext(),ViewSubjectsActivity.class);
			    i.putExtra("data1", "Android JellyBean");
			    i.putExtra("data2", 10);
			    startActivity(i);
			}
		});

        Button btnAboutApp = (Button) findViewById(R.id.btnAboutApp);
        btnAboutApp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    Intent i = new Intent(getBaseContext(),AboutAppActivity.class);
			    //Data to pass to the activity
			    i.putExtra("data1", "Android IceCream Sandwich");
			    i.putExtra("data2", 20);
			    startActivity(i);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
