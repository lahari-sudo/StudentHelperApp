package com.example.studenthelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;

public class AddSubjectActivity extends AppCompatActivity {

    EditText editSubjectName;
    Button btnSaveSubject;
    static ArrayList<String> subjectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);

        editSubjectName = findViewById(R.id.editSubjectName);
        btnSaveSubject = findViewById(R.id.btnSaveSubject);

        btnSaveSubject.setOnClickListener(v -> {
            String subject = editSubjectName.getText().toString().trim();
            if (!subject.isEmpty()) {
                subjectList.add(subject);
                Toast.makeText(this, "Subject Added!", Toast.LENGTH_SHORT).show();
                editSubjectName.setText("");
            } else {
                Toast.makeText(this, "Please enter a subject name", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
