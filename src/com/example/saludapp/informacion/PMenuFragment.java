package com.example.saludapp.informacion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


import com.example.saludapp.informacion.PBodyFragment;
import com.example.saludapp.R;
import com.example.saludapp.agenda.Agenda;


public class PMenuFragment extends Fragment {
	// views
		Button btnZafiro, btnEsmeralda;
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
			View view = inflater.inflate(R.layout.pfr_menu, container, false);

			// get button BTN1
			btnEsmeralda = (Button) view.findViewById(R.id.btn_diamante);
			// button listener
			btnEsmeralda.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					 sendBodyTextToFragment("En minerologia el diamante del griego");
				}
			});

			// get button BTN2
			btnZafiro = (Button) view.findViewById(R.id.btn_Zafiro);
			// button listener
			btnZafiro.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					sendBodyTextToFragment("En minerologia el zafiro del griego");
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
			PBodyFragment fragment = (PBodyFragment) getActivity()
					.getSupportFragmentManager()
					.findFragmentById(R.id.PbodyFragment);

			// if fragment is not null and in layout, set text, else launch
			// BodyActivity
			if ((fragment != null) && fragment.isInLayout()) {
				fragment.setText(s);
			} else {
				Intent intent = new Intent(getActivity().getApplicationContext(),
						PBodyActivity.class);
				intent.putExtra("value", s);
				startActivity(intent);
			}

		}
}
