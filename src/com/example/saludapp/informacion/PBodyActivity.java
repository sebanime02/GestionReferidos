package com.example.saludapp.informacion;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


import com.example.saludapp.R;

public class PBodyActivity extends FragmentActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// check orientation to avoid crash (this activity is not necessary in
		// landscape)
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		} else
			setContentView(R.layout.pla_body);

		// show body content as requested in Intent extra
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			// get data from Intent extra
			String s = extras.getString("value");
			// get body fragment
			PBodyFragment fragment = (PBodyFragment) getSupportFragmentManager()
					.findFragmentById(R.id.PbodyFragment);
			// if fragment is not null and in layout set text
			if ((fragment != null) && fragment.isInLayout()) {
				fragment.setText(s);
				
			}
		}

	}
}
