package org.example.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

// need to implement OnClickListener because this class is 
// passed to the OnClickListener method
public class Sudoku extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // set up listeners for buttons
        View continueButton = findViewById(R.id.menu_continue_button);
        continueButton.setOnClickListener(this);
        View newButton = findViewById(R.id.menu_about_button);
        newButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.menu_about_button);
        aboutButton.setOnClickListener(this);
        View exitButton = findViewById(R.id.menu_exit_button);
        exitButton.setOnClickListener(this);
    }

    // need to define onClick method here 
    // because OnClickListener was implemented
    @Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.menu_about_button:
			Intent i = new Intent(this, About.class);
			startActivity(i);
			break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.settings:
			startActivity(new Intent(this, Prefs.class));
			return true;
		}
		return false;
	}
}