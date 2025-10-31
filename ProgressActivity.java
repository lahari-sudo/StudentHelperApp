package com.example.studenthelperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textProgressPercent;
    Button btnIncreaseProgress, btnResetProgress;
    SharedPreferences sharedPreferences;
    int currentProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progressBar = findViewById(R.id.progressBar);
        textProgressPercent = findViewById(R.id.textProgressPercent);
        btnIncreaseProgress = findViewById(R.id.btnIncreaseProgress);
        btnResetProgress = findViewById(R.id.btnResetProgress);

        sharedPreferences = getSharedPreferences("StudentHelper", MODE_PRIVATE);
        currentProgress = sharedPreferences.getInt("progress", 0);
        updateProgressUI();

        btnIncreaseProgress.setOnClickListener(v -> {
            if (currentProgress < 100) {
                currentProgress += 10; // increase by 10% each time
                if (currentProgress > 100) currentProgress = 100;
                sharedPreferences.edit().putInt("progress", currentProgress).apply();
                updateProgressUI();
                Toast.makeText(this, "Great job! Keep studying!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "You’ve completed your goals!", Toast.LENGTH_SHORT).show();
            }
        });

        btnResetProgress.setOnClickListener(v -> {
            currentProgress = 0;
            sharedPreferences.edit().putInt("progress", currentProgress).apply();
            updateProgressUI();
            Toast.makeText(this, "Progress reset.", Toast.LENGTH_SHORT).show();
        });
    }

    private void updateProgressUI() {
        progressBar.setProgress(currentProgress);
        textProgressPercent.setText("Progress: " + currentProgress + "%");
    }

