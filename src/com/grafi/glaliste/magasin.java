package com.grafi.glaliste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class magasin extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magasin);
        
        Button magasin_add = (Button)findViewById(R.id.magasin_add);
        Button panier_add = (Button)findViewById(R.id.panier_add);
        Button magasin_supp=(Button)findViewById(R.id.magasin_supp);
        
        
        //Listener for the three menu button
        OnClickListener onClickLister = new OnClickListener() {

        public void onClick(View v){
        	switch(v.getId()){
        		case R.id.magasin_add:
        			//A compléter: pop-up ajout d'un élément au magasin
        			break;
        		case R.id.panier_add:
        			Intent intent2 = new Intent(magasin.this, panier.class);
        			startActivity(intent2);
        			finish();
        			break;
        		case R.id.magasin_supp:
        			//A compléter: pop-up suppression élément (confirmation)
        			break;
        		}
        	};
        };

        	//Affectation
        	magasin_add.setOnClickListener(onClickLister);
        	panier_add.setOnClickListener(onClickLister);
        	magasin_supp.setOnClickListener(onClickLister);
        
        
        
        
    }
}