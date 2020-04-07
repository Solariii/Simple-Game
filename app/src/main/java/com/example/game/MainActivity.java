package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeA(View view){
        scoreA +=3;
        displayForTeamA(scoreA);
    }
    public void addTwoA(View view){
        scoreA +=2;
        displayForTeamA(scoreA);
    }
    public void freeThrowA(View view){
        scoreA +=1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeB(View view){
        scoreB +=3;
        displayForTeamB(scoreB);
    }
    public void addTwoB(View view){
        scoreB +=2;
        displayForTeamB(scoreB);
    }
    public void freeThrowB(View view){
        scoreB +=1;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        scoreB = 0;
        scoreA = 0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }

}
