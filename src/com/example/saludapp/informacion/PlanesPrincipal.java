package com.example.saludapp.informacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


import com.example.saludapp.R;

public class PlanesPrincipal extends FragmentActivity implements
PMenuFragment.OnMenufragListener {

public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.pla_main);
}

// MenuFragment listener
@Override
public void onMenufrag(String s) {

// get body fragment (native method is getFragmentManager)
PBodyFragment fragment = (PBodyFragment) getSupportFragmentManager()
		.findFragmentById(R.id.PbodyFragment);

// if fragment is not null and in layout, set text, else launch
// BodyActivity

if ((fragment != null) && fragment.isInLayout()) {
	fragment.setText(s);
} else {
	Intent intent = new Intent(this, PBodyActivity.class);
	intent.putExtra("value", s);
	startActivity(intent);
}

}
}

