package com.example.studenthelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAddSubject, btnNotes, btnSetReminder, btnProgress, btnViewSubjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddSubject = findViewById(R.id.btnAddSubject);
        btnNotes = findViewById(R.id.btnNotes);
        btnSetReminder = findViewById(R.id.btnSetReminder);
        btnProgress = findViewById(R.id.btnProgress);
        btnViewSubjects = findViewById(R.id.btnViewSubjects);

        btnAddSubject.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AddSubjectActivity.class)));

        btnNotes.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, NotesActivity.class)));

        btnSetReminder.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ReminderActivity.class)));

        btnProgress.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ProgressActivity.class)));

        btnViewSubjects.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ViewSubjectsActivity.class)));
    }
}