package com.example.android.candydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Tracks score for Team A.
     */
    int scoreTeamA = 0;

    /**
     * Tracks score for Team B.
     */
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds 10 points to the score for Team A.
     */
    public void threeOfAKindForTeamA(View view) {
        scoreTeamA += 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 20 points to the score for Team A.
     */
    public void smallStraightForTeamA(View view) {
        scoreTeamA += 20;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 25 points to the score for Team A.
     */
    public void fullHouseForTeamA(View view) {
        scoreTeamA += 25;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 30 points to the score for Team A.
     */
    public void fourOfAKindForTeamA(View view) {
        scoreTeamA += 30;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 40 points to the score for Team A.
     */
    public void largeStraightForTeamA(View view) {
        scoreTeamA += 40;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 50 points to the score for Team A.
     */
    public void yahtzeeForTeamA(View view) {
        scoreTeamA += 50;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 10 points to the score for Team B.
     */
    public void threeOfAKindForTeamB(View view) {
        scoreTeamB += 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 20 points to the score for Team B.
     */
    public void smallStraightForTeamB(View view) {
        scoreTeamB += 20;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 25 points to the score for Team B.
     */
    public void fullHouseForTeamB(View view) {
        scoreTeamB += 25;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 30 points to the score for Team B.
     */
    public void fourOfAKindForTeamB(View view) {
        scoreTeamB += 30;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 40 points to the score for Team B.
     */
    public void largeStraightForTeamB(View view) {
        scoreTeamB += 40;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 50 points to the score for Team B.
     */
    public void yahtzeeForTeamB(View view) {
        scoreTeamB += 50;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets scores for Team A and Team B to zero.
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
