package com.example.saludapp.pantallas;





import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Afiliar extends Fragment {
	
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View view;
	
	view = inflater.inflate(com.example.saludapp.R.layout.login_afiliar,container,false );
	
	return view;
}
}
