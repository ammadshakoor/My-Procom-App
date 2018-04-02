package com.example.iamma.procom17iuappdevelopers;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button bscsBtn, bseeBtn, bbaBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setBscsBtn();
        setBseeBtn();
        setBbaBtn();
    }

    public void setBscsBtn(){
        bscsBtn = (Button)findViewById(R.id.bscsBtn);

        bscsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.iamma.procom17iuappdevelopers.admin_verification");
                startActivity(intent);
                finish();
            }
        });
    }


    public void setBseeBtn(){
        bseeBtn = (Button)findViewById(R.id.bseeBtn);

        bseeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.iamma.procom17iuappdevelopers.admin_verification");
                startActivity(intent);
                finish();
            }
        });
    }


    public void setBbaBtn(){
        bbaBtn = (Button)findViewById(R.id.bbaBtn);

        bbaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.iamma.procom17iuappdevelopers.admin_verification");
                startActivity(intent);
                finish();
            }
        });
    }
}
