package com.example.listviewtarea;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Fragment1 extends Fragment {

	
	private ListView lista;
	private Fragment2 mFragment2;
	private String[] nombres ={"jonathan","andres","pedro"};
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment1, container, false);
		
		
		lista = (ListView)rootView.findViewById(R.id.lista);
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(rootView.getContext(),android.R.layout.simple_list_item_1, nombres);
		lista.setAdapter(adaptador);
		mFragment2 = new Fragment2();

		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
			
				
				
				Bundle args = new Bundle();
				args.putString("someString", nombres[position].toString());
				mFragment2.setArguments(args);

				FragmentTransaction ft = getActivity()
						.getSupportFragmentManager().beginTransaction();
				ft.replace(R.id.container, mFragment2)
						.addToBackStack("mFragment2").commit();
			}
		});

		return rootView;
	}

}
