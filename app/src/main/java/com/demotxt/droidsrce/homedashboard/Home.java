package com.demotxt.droidsrce.homedashboard;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
CardView mycard, cardone, se, ded ;
    Intent i,k, j, m;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.bankcardId);
        cardone = (CardView) findViewById(R.id.card);
        se = (CardView) findViewById(R.id.se1);
        ded = (CardView) findViewById(R.id.ded1);




        i = new Intent(this,ae.class);
        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

        k = new Intent(this,secondactivity.class);
        cardone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(k);
            }
        });



        j = new Intent(this,se2.class);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(j);
            }
        });


        //m = new Intent(this,Dad.class);
        //ded.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
         //       startActivity(m);
         //   }
       // });


    }
}
