package com.example.iamma.procom17iuappdevelopers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_verification extends AppCompatActivity {

    EditText idInput, passInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_verification);
        verifBtnClicked();
    }

    public void verifBtnClicked(){
        Button verifBtn = (Button)findViewById(R.id.verifBtn);
        idInput = (EditText)findViewById(R.id.idInput);
        passInput = (EditText)findViewById(R.id.passInput);

        verifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idInput.getText().toString().equals("admin") && passInput.getText().toString().equals("Computer"))
                {
                    Intent intent = new Intent("com.example.iamma.procom17iuappdevelopers.bscsCourse");
                    startActivity(intent);
                    finish();

                }
                else if(idInput.getText().toString().equals("admin") && passInput.getText().toString().equals("Electrical"))
                {
                    Intent intent = new Intent("com.example.iamma.procom17iuappdevelopers.bseeCourse");
                    startActivity(intent);
                    finish();
                }
                else if(idInput.getText().toString().equals("admin") && passInput.getText().toString().equals("Business"))
                {

                   // Intent intent = new Intent("com.example.iamma.procom17iuappdevelopers.bba_course");
                    Intent intent = new Intent(getBaseContext(), bba_course.class);

                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(admin_verification.this,"Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
