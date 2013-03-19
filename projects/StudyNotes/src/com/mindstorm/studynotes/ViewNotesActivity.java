package com.mindstorm.studynotes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ViewNotesActivity extends Activity {
	
	WebView fileContents;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewnotes);
        
        fileContents = (WebView)findViewById(R.id.fileContents);     
        
        String subject = getIntent().getExtras().getString("subject");
        
	    //Update the Contents field in the UI
	    fileContents.loadUrl("file:///android_asset/" + subject.toLowerCase() + ".html");
    }
    
    private void showToast(String msg) {
    	Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}