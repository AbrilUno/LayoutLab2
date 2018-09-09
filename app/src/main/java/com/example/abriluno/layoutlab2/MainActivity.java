package com.example.abriluno.layoutlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button consButt = (Button) findViewById(R.id.constraintButton);
        Button linButt = (Button) findViewById(R.id.LinearButton);
        Button relButt = (Button) findViewById(R.id.relativeButton);

        consButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cons = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(cons);
            }

        });

        linButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lin = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(lin);
            }

        });

        relButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rel = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(rel);
            }

        });
    }
}
