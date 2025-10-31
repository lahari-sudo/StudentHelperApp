package com.example.studenthelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NotesActivity extends AppCompatActivity {

    EditText editNote;
    Button btnSaveNote;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        editNote = findViewById(R.id.editNote);
        btnSaveNote = findViewById(R.id.btnSaveNote);
        sharedPreferences = getSharedPreferences("StudentHelper", MODE_PRIVATE);

        // Load existing note
        editNote.setText(sharedPreferences.getString("notes", ""));

        btnSaveNote.setOnClickListener(v -> {
            String note = editNote.getText().toString();
            sharedPreferences.edit().putString("notes", note).apply();
            Toast.makeText(this, "Note Saved!", Toast.LENGTH_SHORT).show();
        });
    }
}