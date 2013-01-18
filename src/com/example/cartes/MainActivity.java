package com.example.cartes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*  final Button parcourirButton = (Button) findViewById(R.id.bt_parcourir);
		  parcourirButton.setOnClickListener(new Button.OnClickListener(){
			  public void onClick(View v) 
			  {
				Intent intent = new Intent(MainActivity.this, ParcourirCartesActivity.class);
				startActivity(intent);
			   }
			  });*/
				  
	 }


	
            
     public void parcourirCartes(View view)
     {
        Intent myIntent = new Intent(this, ParcourirCartesActivity.class);
        /*ImageView monImage = (ImageView) findViewById(R.drawable.koala);*/
        startActivity(myIntent);
     }
     
     public void voirInstructions(View view)
     {
        Intent myIntent = new Intent(this, InstructionsActivity.class);
        startActivity(myIntent);
     }
     
     public void voirApropos(View view)
     {
        Intent myIntent = new Intent(this, AProposActivity.class);
        startActivity(myIntent);
     }
        
        }
