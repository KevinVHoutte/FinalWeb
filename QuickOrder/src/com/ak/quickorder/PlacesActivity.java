package com.ak.quickorder;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class PlacesActivity extends Activity {

	private ArrayList<String> plaatsen = new ArrayList<String>();
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.places);

	}
	
	public void onResume(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		plaatsen.add("R1");
		plaatsen.add("R2");
		plaatsen.add("R3");
		plaatsen.add("R4");
		plaatsen.add("R5");
		addList();
	}

	private void addList(){
		LinearLayout lo = (LinearLayout) findViewById(R.id.list);
		for (String plaats : plaatsen) {
			TextView tekst = new TextView(this);
			tekst.setText(plaats);
			tekst.setTextSize(20);
			ScrollView sv = (ScrollView) findViewById(R.id.scrollView1);
			lo.addView(tekst);
			sv.addView(lo);

		}
	}
}
