package com.mindstorm.listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	String[] subjects = null;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Read the String Array for subjects that is defined in the strings.xml
        subjects = getResources().getStringArray(R.array.subjects);
        
        //Create the Adapter
        ArrayAdapter<String> statesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,subjects);
        
        //Assign Adapter to the View
        getListView().setAdapter(statesAdapter);
    }
    
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		showToast("You selected : " + subjects[position]);
	}
    
	private void showToast(String msg) {
    	Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    
}
