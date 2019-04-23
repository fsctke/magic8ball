package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        final ImageView ball;
        final TextView headerText;

        askButton = (Button) findViewById(R.id.askButton);
        ball = (ImageView) findViewById(R.id.ballImage);
        headerText = (TextView) findViewById(R.id.headerText);

        final int[] ballArray = {R.drawable.ball1
                , R.drawable.ball2
                , R.drawable.ball3
                , R.drawable.ball4
                , R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //    Log.d("ask", "ask button is working");
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(5);
                //   Log.d("number random ", "the random number is:" + randomNumber);
                ball.setImageResource(ballArray[randomNumber]);
                if (randomNumber == 3 || randomNumber == 0) {
                    headerText.animate().rotationYBy(360f).setDuration(1000);

                } else {

                    headerText.animate().rotationXBy(180f).setDuration(1000);
                }
            }
        });

    }
}
