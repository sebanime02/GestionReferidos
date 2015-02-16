package com.example.saludapp.informacion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saludapp.R;

public class PBodyFragment extends Fragment {
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
		View view = inflater.inflate(R.layout.pfr_body, container, false);
		return view;
	}

	// set text
	public void setText(String item) {
		if(item=="En minerologia el zafiro del griego"){
			ImageView imagen = (ImageView) getView().findViewById(R.id.diamante);
			imagen.setImageResource(R.drawable.esmeralda);
		TextView view = (TextView) getView().findViewById(R.id.txt_contenido);
		view.setText(item);
		TextView view2 = (TextView) getView().findViewById(R.id.txt_cobertura);
		view2.setText(item);
		
		
		
		}
		else {
			ImageView imagen = (ImageView) getView().findViewById(R.id.diamante);
			imagen.setImageResource(R.drawable.diamante);
			TextView view = (TextView) getView().findViewById(R.id.txt_contenido);
			view.setText(item);
			TextView view2 = (TextView) getView().findViewById(R.id.txt_cobertura);
			view2.setText(item);
			
		
			
		}
		
		
	}
}
