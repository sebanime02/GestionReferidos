package com.example.saludapp.gestion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.saludapp.BodyActivity;
import com.example.saludapp.BodyFragment;
import com.example.saludapp.MenuFragment;
import com.example.saludapp.R;
import com.example.saludapp.R.layout;

public class GestionPrincipal extends FragmentActivity implements
		GMenuFragment.OnMenufragListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ge_main);

	}

	@Override
	public void onMenufrag(String s) {

		// get body fragment (native method is getFragmentManager)
		BodyFragment fragment = (BodyFragment) getSupportFragmentManager()
				.findFragmentById(R.id.bodyFragment);

		// if fragment is not null and in layout, set text, else launch
		// BodyActivity

		if ((fragment != null) && fragment.isInLayout()) {
			fragment.setText(s);
		} else {
			Intent intent = new Intent(this, BodyActivity.class);
			intent.putExtra("value", s);
			startActivity(intent);
		}

	}

}
