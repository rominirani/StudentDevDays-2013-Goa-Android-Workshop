package com.mindstorm.basicui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Next Button
        Button btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showToast("Get Next Notes");
			}
		});
        
        //SMS Quote Button
        Button btnSMS = (Button)findViewById(R.id.btnSMS);
        btnSMS.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showToast("Launch SMS App");
			}
		});

        //Email Quote Button
        Button btnEmail = (Button)findViewById(R.id.btnEmail);
        btnEmail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showToast("Launch Email App");
			}
		});

    }
    private void showToast(String msg) {
    	Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
