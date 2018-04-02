package com.example.iamma.procom17iuappdevelopers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class NewCourse extends AppCompatActivity {

    EditText id, name, credithour, faculty;
    Button addcourse,logo;
    ListView proList;

    DatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_course);

        mydb = new DatabaseHelper(this);

        name = (EditText) findViewById(R.id.editText_coursename);
        credithour = (EditText) findViewById(R.id.editText_credithour);
        faculty = (EditText) findViewById(R.id.editText_faculty);

        addcourse = (Button) findViewById(R.id.button_addcourse);
        logo = (Button) findViewById(R.id.logOut);
/*
        String a = name.getText().toString();
        String b = credithour.getText().toString();
        String c = faculty.getText().toString();

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_new_course, a);

        ListView proList = (ListView) findViewById(R.id.proList);
        proList.setAdapter(adapter);*/
        AddCourseMethod();
        logoutmethod();

    }

    public void AddCourseMethod()
    {
        addcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = mydb.InsertData(name.getText().toString(), credithour.getText().toString(), faculty.getText().toString());

                if(isInserted==true)
                {
                    Toast.makeText(getBaseContext(),"Data is inserted", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(getBaseContext(),"Data not inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void logoutmethod()
    {
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent intent = new Intent(com.example.iamma.procom17iuappdevelopers.NewCourse);
                Intent intent = new Intent(getBaseContext(), admin_verification.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
