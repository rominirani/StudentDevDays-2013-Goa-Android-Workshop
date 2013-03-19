package com.mindstormsoftware.filereader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	WebView fileContents;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fileContents = (WebView)findViewById(R.id.fileContents);        
        
        //Read File
        Button btnReadFile = (Button)findViewById(R.id.btnReadFile);
        btnReadFile.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					
					//Read the current selection for the subject
					Spinner spinnerSubjects = (Spinner)findViewById(R.id.spinnerSubjects);
					String strSelectedSubject = spinnerSubjects.getSelectedItem().toString();
					
				    //Update the Contents field in the UI
				    fileContents.loadUrl("file:///android_asset/" + strSelectedSubject.toLowerCase() + ".html");
				}
				catch (Exception ex) {
					showToast(ex.getMessage());
				}
			}
		});
    }
    
    private void showToast(String msg) {
    	Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}