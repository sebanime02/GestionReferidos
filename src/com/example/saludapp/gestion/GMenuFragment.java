package com.example.saludapp.gestion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.saludapp.BodyActivity;
import com.example.saludapp.BodyFragment;
import com.example.saludapp.MenuPrincipal;
import com.example.saludapp.R;
import com.example.saludapp.MenuFragment.OnMenufragListener;
import com.example.saludapp.agenda.Agenda;

public class GMenuFragment extends Fragment {
	// views
	Button btnIngresarRefe, btnAgendar, btnCaracterizar;
	ImageButton Atras;

	// activity listener
	private OnMenufragListener menufragListener;

	// interface for communication with activity
	public interface OnMenufragListener {
		public void onMenufrag(String s);
	}

	// onAttach
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			menufragListener = (OnMenufragListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnMenufragListener");
		}
	}

	// onCreate
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	// onActivityCreated
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	// onCreateView
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.gfr_menu, container, false);

		// get button BTN1
		btnIngresarRefe = (Button) view.findViewById(R.id.btnIngReferido);
		// button listener
		btnIngresarRefe.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i;
				i = new Intent(getActivity(), GestionPrincipal.class);
				startActivity(i);
			}
		});

		// get button BTN2
		btnAgendar = (Button) view.findViewById(R.id.btnAgenda);
		// button listener
		btnAgendar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i;
				i = new Intent(getActivity(), Agenda.class);
				startActivity(i);
			}
		});

		// get button BTN2
		btnCaracterizar = (Button) view.findViewById(R.id.btnCaracterizacion);
		// button listener
		btnCaracterizar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i;
				i = new Intent(getActivity(), Agenda.class);
				startActivity(i);
			}
		});
		// get button BTN2
		Atras = (ImageButton) view.findViewById(R.id.Atras);
		// button listener
		Atras.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i;
				i = new Intent(getActivity(), MenuPrincipal.class);
				startActivity(i);
			}
		});

		return view;
	}

	// (recommended) method to send command to activity
	private void sendBodyTextToActivity(String s) {
		menufragListener.onMenufrag(s);
	}

	// alternate (not recommended) method with direct access to fragment
	private void sendBodyTextToFragment(String s) {

		// get body fragment (native method is getFragmentManager)
		BodyFragment fragment = (BodyFragment) getActivity()
				.getSupportFragmentManager()
				.findFragmentById(R.id.GbodyFragment);

		// if fragment is not null and in layout, set text, else launch
		// BodyActivity
		if ((fragment != null) && fragment.isInLayout()) {
			fragment.setText(s);
		} else {
			Intent intent = new Intent(getActivity().getApplicationContext(),
					GBodyActivity.class);
			intent.putExtra("value", s);
			startActivity(intent);
		}

	}
}
