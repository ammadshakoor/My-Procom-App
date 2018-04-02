package com.example.iamma.procom17iuappdevelopers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bscsCourse extends AppCompatActivity {

    Button addCsCr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bscs_course);


        addCsCr = (Button) findViewById(R.id.addCsCor);

        addCsCr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent intent = new Intent(com.example.iamma.procom17iuappdevelopers.NewCourse);
                Intent intent = new Intent(getBaseContext(), NewCourse.class);
                startActivity(intent);
                finish();

            }
        });
    }
}