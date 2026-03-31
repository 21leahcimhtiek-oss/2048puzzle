package com.auroramarket.puzzle2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView title = findViewById(R.id.title);
        title.setText("2048Puzzle");
        
        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(v -> startGame());
    }
    
    private void startGame() {
        // Game initialization logic here
    }
}