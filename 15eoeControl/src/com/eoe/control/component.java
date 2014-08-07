package com.eoe.control;

import android.app.Activity;
import android.os.Bundle;

import com.eoe.control.view.ProgressBar;

public class component extends Activity {

	private ProgressBar pb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mycomponent);

		pb = (ProgressBar) findViewById(R.id.my_progressBar);
		// pb.setText(R.string.loadtext);
	}

}
