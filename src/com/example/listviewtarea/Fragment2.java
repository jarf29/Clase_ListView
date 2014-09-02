package com.example.listviewtarea;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

	private TextView resultado;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment2, container, false);

		resultado = (TextView) rootView.findViewById(R.id.resultado);
		resultado.setText(getArguments().getString("someString"));
		



		return rootView;
	}

}