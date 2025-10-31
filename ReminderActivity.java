public package com.example.studenthelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReminderActivity extends AppCompatActivity {

    EditText editReminder;
    Button btnSetReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        // Link the views from XML
        editReminder = findViewById(R.id.editReminder);
        btnSetReminder = findViewById(R.id.btnSetReminder);

        // Button click listener
        btnSetReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = editReminder.getText().toString().trim();

                if (!task.isEmpty()) {
                    Toast.makeText(ReminderActivity.this,
                            "Reminder set for: " + task,
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ReminderActivity.this,
                            "Please enter a reminder first!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
 {
    
}
