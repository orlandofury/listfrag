package com.example.listasimple;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class DetailActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DetailFragment fragment = DetailFragment.newInstance(getIntent().getExtras());
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		//attach the fragment dynamically to the content
		ft.add(android.R.id.content, fragment);
		ft.commit();
	}

}
