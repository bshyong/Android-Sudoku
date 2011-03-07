package org.example.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

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
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.menu_about_button:
			Intent i = new Intent(this, About.class);
			startActivity(i);
			break;
		}
	}
}