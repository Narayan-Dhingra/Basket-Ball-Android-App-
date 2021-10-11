package com.example.basketballgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPointsA;
    TextView tvPointsB;
    Button btn3PointsA;
    Button btn3PointsB;
    Button btn2PointsA;
    Button btn2PointsB;
    Button btn1PointsA;
    Button btn1PointsB;
    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPointsA = findViewById(R.id.tvPointsA);
        tvPointsB = findViewById(R.id.tvPointsB);
        btn3PointsA = findViewById(R.id.btn3PointsA);
        btn3PointsB = findViewById(R.id.btn3PointsB);
        btn2PointsA = findViewById(R.id.btn2PointsA);
        btn2PointsB = findViewById(R.id.btn2PointsB);
        btn1PointsA = findViewById(R.id.btnFreeThrowA);
        btn1PointsB = findViewById(R.id.btnFreeThrowB);

        setScoresTeamA(pointsA);
        setScoresTeamB(pointsB);

    }

    /**
     * Setting the scores of Team A
     * @param scores
     */
    private void setScoresTeamA(int scores) {
        tvPointsA.setText(String.valueOf(scores));
    }

    /**
     * Setting the scores of team B
     * @param scores
     */
    private void setScoresTeamB(int scores) {
        tvPointsB.setText(String.valueOf(scores));
    }

    public void add3PointsTeam (View view) {
        if (btn3PointsB.isPressed()) {
            pointsB += 3;
            setScoresTeamB(pointsB);
        }
        else if (btn3PointsA.isPressed()) {
            pointsA += 3;
            setScoresTeamA(pointsA);
        }
    }

    public void add2PointsTeam (View view) {
        if (btn2PointsB.isPressed()) {
            pointsB += 2;
            setScoresTeamB(pointsB);
        }
        else if (btn2PointsA.isPressed()) {
            pointsA += 2;
            setScoresTeamA(pointsA);
        }
    }

    public void add1PointsTeam (View view) {
        if (btn1PointsB.isPressed()) {
            pointsB += 1;
            setScoresTeamB(pointsB);
        }
        else if (btn1PointsA.isPressed()) {
            pointsA += 1;
            setScoresTeamA(pointsA);
        }
    }

    public void reset (View view) {
        pointsA = 0;
        pointsB = 0;
        setScoresTeamA(pointsA);
        setScoresTeamB(pointsB);
    }

}