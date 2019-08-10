package com.demotxt.droidsrce.homedashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class secondactivity extends AppCompatActivity {

    Intent l;
    CardView rap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        rap = (CardView) findViewById(R.id.rap1);


        l = new Intent(this,SpeakUpNow.class);
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(l);
            }
        });

    }
}
