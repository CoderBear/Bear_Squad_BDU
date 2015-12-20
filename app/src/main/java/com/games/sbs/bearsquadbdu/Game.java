package com.games.sbs.bearsquadbdu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Game extends AppCompatActivity {

    public static final String KEY_DIFFICULTY = "com.games.sbs.bearsquadbdu.difficulty";
    public static final int DIFFICULTY_EASY = 0;
    public static final int DIFFICULTY_MEDIUM = 1;
    public static final int DIFFICULTY_HARD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
        setContentView(R.layout.activity_game);
    }
}
