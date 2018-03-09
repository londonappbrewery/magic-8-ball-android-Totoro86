package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int [] ballAray =  {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};

        final Button mon_bouton = findViewById(R.id.mon_bouton);

        mon_bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random nombreAleatoireGenere = new Random();

                int nombre = nombreAleatoireGenere.nextInt(5);

                ballDisplay.setImageResource(ballAray[nombre]);
            }
        });
    }
}
