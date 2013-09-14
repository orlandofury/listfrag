package com.example.listasimple;

import java.util.Arrays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainFragment extends Fragment {
	private String [] nombres = {"Fulano mengano","Juan Perez","John Doe","Misato Mikoto","Alistair Macllister","David Moreno","David Moreno","Augusto Bonilla"};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.main,container,false);
		ListView list = (ListView)view.findViewById(R.id.lstMain);
		//Clase especial para pasarla a la lista.
		//hay diferentes tipos de lista
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Arrays.asList(nombres));
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position,
					long id) {
					Intent intent = new Intent(getActivity(),DetailActivity.class);
					intent.putExtra("nombre",nombres[position]);
					startActivity(intent);
					//Toast.makeText(MainListaActivity.this, "Click Item", Toast.LENGTH_LONG).show();
				
			}
		});
		return view;
	}
}
