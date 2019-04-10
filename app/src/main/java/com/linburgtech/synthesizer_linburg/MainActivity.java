package com.linburgtech.synthesizer_linburg;

import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private Button button3;
    private Button button1;
    private Button button2;
    private final int WHOLE_NOTE = 500;
    private MediaPlayerThread mpt = new MediaPlayerThread(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3 = (Button)findViewById(R.id.button3);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "Button 1 Clicked");
                mpt.playNote(R.raw.scalee, WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalefs,WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalegs,WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalea,WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaleb,WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalec,WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaleds,WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalee,WHOLE_NOTE/2);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "Button 2 Clicked");
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
            }
            });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e(TAG, "Button 3 Clicked");
                        mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalehighe, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalehighfs, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalehighfs, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalehighe, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalecs, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalecs, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scaleb, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scaleb, WHOLE_NOTE / 2);
                        mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                    }
                });
            }
        }