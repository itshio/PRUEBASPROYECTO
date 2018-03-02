package com.example.pruebasproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask Task = new TimerTask() {
            @Override
            public void run() {

                Intent maintent = new Intent(getApplicationContext(), FormularioActivity .class);

                startActivity(maintent);
                finish();

            }
        };

        Timer timer = new Timer();
        timer.schedule(Task, SPLASH_SCREEN_DELAY);
    }
}
