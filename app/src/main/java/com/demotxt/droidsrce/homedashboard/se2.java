package com.demotxt.droidsrce.homedashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class se2 extends AppCompatActivity {
    CardView card1, card2;
    Intent j,l;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se2);
        ll = (LinearLayout) findViewById(R.id.ll);
        card1 = (CardView) findViewById(R.id.cardone);
        card2 = (CardView) findViewById(R.id.cardtwo);

        j = new Intent(this,ParentGuide.class);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(j);
            }
        });

        l = new Intent(this,KidsEd.class);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(l);
            }
        });



    }
}
