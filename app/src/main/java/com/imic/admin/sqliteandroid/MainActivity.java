package com.imic.admin.sqliteandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHandler = new DatabaseHandler(this);
        //
        Student student = new Student(1, "HVT", "add", "34567890");
        databaseHandler.addStudent(student);

        // hien thi student
        databaseHandler.getAllStudents();

    }
}
