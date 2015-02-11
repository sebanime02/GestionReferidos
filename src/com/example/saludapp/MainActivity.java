package com.example.saludapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

	Button btn_Ingresar;
	EditText et_Nombre, etContra;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn_Ingresar = (Button) findViewById(R.id.btn_Ingresar);
		btn_Ingresar.setOnClickListener(this);
		et_Nombre = (EditText) findViewById(R.id.edNombre);
		etContra = (EditText) findViewById(R.id.edContrasena);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i;
		switch (v.getId()) {
		case R.id.btn_Ingresar:
			i = new Intent(MainActivity.this, MenuPrincipal.class);
			startActivity(i);
			break;

		}

	}

}
