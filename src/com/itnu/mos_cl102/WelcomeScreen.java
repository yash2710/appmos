package com.itnu.mos_cl102;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WelcomeScreen extends ListActivity {

	String[] classes = { "Chapter1", "Chapter2"};
	String[] display = { "Bending Stress in Beams", "SFD and BMD"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_screen);
		setListAdapter(new ArrayAdapter<String>(WelcomeScreen.this,
				android.R.layout.simple_expandable_list_item_1, display));
		ListView list = getListView();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Class c;
		try {
			c = Class.forName("com.itnu.mos_cl102." + classes[position]);
			Intent i = new Intent(WelcomeScreen.this, c);
			startActivity(i);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
