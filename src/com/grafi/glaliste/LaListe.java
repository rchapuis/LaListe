package com.grafi.glaliste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LaListe extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button bouton_accueil = (Button)findViewById(R.id.bouton_accueil);
        
        //Listener for the first screen define as a button in order to access the 'panier'
        
        OnClickListener onClickLister = new OnClickListener() {

        public void onClick(View v){
        	Intent intent = new Intent(LaListe.this, magasin.class);
        	startActivity(intent);
        	finish();
        	};
        };
      		    
        //Association between the button and the listener
        bouton_accueil.setOnClickListener(onClickLister);

    }
}