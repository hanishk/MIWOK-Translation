package com.xyz.miwok;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     TextView phrases=(TextView)findViewById(R.id.idphrases);
     TextView color=(TextView)findViewById(R.id.idcolor);
     TextView number=(TextView)findViewById(R.id.idnumber);
     TextView family =(TextView)findViewById(R.id.idfamily);

     phrases.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(MainActivity.this,Phrases.class);
             startActivity(i);
         }
     });
     color.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(MainActivity.this,Color.class);
             startActivity(i);
         }
     });

     number.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(MainActivity.this,Number.class);
             startActivity(i);
         }
     });

     family.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(MainActivity.this,Family.class);
             startActivity(i);
         }
     });
    }
}