package com.example.cartes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class ParcourirCartesActivity extends Activity {
	ImageView monImage1 = null;
	ImageView monImage2 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parcourir_cartes);
		monImage1 = (ImageView)findViewById(R.id.imageView1);
		monImage2 = (ImageView)findViewById(R.id.imageView2);
		}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_parcourir_cartes, menu);
		return true;
	}

}
