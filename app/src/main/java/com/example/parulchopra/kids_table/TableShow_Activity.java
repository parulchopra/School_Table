package com.example.parulchopra.kids_table;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TableShow_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_show_);
        Intent intent = getIntent();
        String value = intent.getStringExtra("Value");

        LinearLayout layout = (LinearLayout) findViewById(R.id.Activity2);



        for (int i = 1; i < 31; i++) {
            LinearLayout row = new LinearLayout(this);

            row.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            row.setGravity(Gravity.CENTER_HORIZONTAL);
            for (int j = 1; j <2; j++) {
                int t = Integer.parseInt(value);
               String k = String.valueOf(i * t);


                TextView T1 = new TextView(getApplication());
                TextView T2 = new TextView(getApplication());
                TextView T3 = new TextView(getApplication());
                TextView T4 = new TextView(getApplication());
                TextView T5 = new TextView(getApplication());
                Typeface face1= Typeface.createFromAsset(TableShow_Activity.this.getAssets(), "fonts/PlayfairDisplaySC-BoldItalic.otf");
                T1.setTypeface(face1);
                T2.setTypeface(face1);
                T3.setTypeface(face1);
                T4.setTypeface(face1);
                T5.setTypeface(face1);

                row.addView(T1);
                row.addView(T2);
                row.addView(T3);
                row.addView(T5);
                row.addView(T4);

                T1.setTextSize(50);
                T2.setTextSize(50);
                T3.setTextSize(50);
                T4.setTextSize(50);
                T5.setTextSize(50);

                T1.setTextColor(Color.parseColor("#FF41309F"));
                T2.setTextColor(Color.parseColor("#FF41309F"));
                T3.setTextColor(Color.parseColor("#FF41309F"));
                T4.setTextColor(Color.parseColor("#FF41309F"));
                T5.setTextColor(Color.parseColor("#FF41309F"));



                T1.setText(value);
                T5.setText(" = ");
                T2.setText(" * ");
                T3.setText(String.valueOf(i));
                T4.setText(String.valueOf(k + "\n"));

            }

            layout.addView(row);
        }

        }
        }


