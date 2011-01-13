package com.grafi.glaliste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class panier extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panier);
        
        Button to_magasin = (Button)findViewById(R.id.to_magasin);
        Button panier_vider = (Button)findViewById(R.id.panier_vider);
        Button panier_supp =(Button)findViewById(R.id.panier_supp);
        
        
        //Listener for the three menu button
        OnClickListener onClickLister = new OnClickListener() {

        public void onClick(View v){
        	switch(v.getId()){
        		case R.id.to_magasin:
        			Intent intent1 = new Intent(panier.this, magasin.class);
        			startActivity(intent1);
        			finish();
        			break;
        		case R.id.panier_vider:
        			//A compléter pop-up Vider le panier (confirmation)
        			break;
        		case R.id.panier_supp:
        			//A compléter
        			break;
        		}
        	};
        };

        	//Affectation Listeners
        	to_magasin.setOnClickListener(onClickLister);
        	panier_vider.setOnClickListener(onClickLister);
        	panier_supp.setOnClickListener(onClickLister);
        
    }
}