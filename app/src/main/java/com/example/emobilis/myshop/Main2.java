package com.example.emobilis.myshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2 extends AppCompatActivity {

    ImageButton b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1=findViewById(R.id.imageButton);
        b2=findViewById(R.id.imageButton9);
        b3=findViewById(R.id.imageButton10);
        b4=findViewById(R.id.imageButton11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj=new Intent(getApplicationContext(),spares.class);
                startActivity(jj);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj=new Intent(getApplicationContext(),spares.class);
                startActivity(jj);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj=new Intent(getApplicationContext(),spares.class);
                startActivity(jj);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jj=new Intent(getApplicationContext(),spares.class);
                startActivity(jj);
            }
        });
    }
}
