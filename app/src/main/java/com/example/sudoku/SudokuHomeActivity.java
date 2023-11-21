package com.example.sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SudokuHomeActivity extends MenuClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SudokuHomeActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        start.startAnimation(shake);

        Button settings = (Button) findViewById(R.id.setting);
        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SudokuHomeActivity.this, PreferenceActivity.class);
                startActivity(intent);
            }
        });
        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

}