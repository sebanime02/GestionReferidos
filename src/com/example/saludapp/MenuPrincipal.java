package com.example.saludapp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class MenuPrincipal extends FragmentActivity implements
		MenuFragment.OnMenufragListener {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_main);
	}

	// MenuFragment listener
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
