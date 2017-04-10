package com.example.parulchopra.kids_table;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText E1;
    Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=(EditText)findViewById(R.id.edit);
        B1=(Button)findViewById(R.id.button);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=E1.getText().toString().trim();
                Intent i=new Intent(MainActivity.this,TableShow_Activity.class);
                i.putExtra("Value",value);
                startActivity(i);
            }
        });
    }
}
