package com.example.studenthelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class ViewSubjectsActivity extends AppCompatActivity {

    ListView listViewSubjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_subjects);

        listViewSubjects = findViewById(R.id.listViewSubjects);

        ArrayList<String> subjects = AddSubjectActivity.subjectList;

        if (subjects.isEmpty()) {
            Toast.makeText(this, "No subjects added yet!", Toast.LENGTH_SHORT).show();
        } else {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    subjects
            );
            listViewSubjects.setAdapter(adapter);
        }
    }
}