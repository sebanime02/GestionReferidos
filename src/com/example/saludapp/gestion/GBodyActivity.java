package com.example.saludapp.gestion;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.example.saludapp.BodyFragment;
import com.example.saludapp.R;

public class GBodyActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// check orientation to avoid crash (this activity is not necessary in
		// landscape)
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		} else
			setContentView(R.layout.ge_body);

		// show body content as requested in Intent extra
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			// get data from Intent extra
			String s = extras.getString("value");
			// get body fragment
			BodyFragment fragment = (BodyFragment) getSupportFragmentManager()
					.findFragmentById(R.id.GbodyFragment);
			// if fragment is not null and in layout set text
			if ((fragment != null) && fragment.isInLayout()) {
				fragment.setText(s);
			}
		}

	}
}
