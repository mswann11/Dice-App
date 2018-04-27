package com.example.android.candydice;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Tracks score for Team A.
     */
    int scoreTeamA=0;

    /**
     * Tracks score for Team B.
     */
    int scoreTeamB=0;

    TextView scoreAView;
    TextView scoreBView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreBView = (TextView) findViewById(R.id.team_b_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        scoreAView.setText(String.valueOf(scoreTeamA));
        scoreBView.setText(String.valueOf(scoreTeamB));
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
        scoreAView.setText(String.valueOf(score));
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
        scoreBView.setText(String.valueOf(score));
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
