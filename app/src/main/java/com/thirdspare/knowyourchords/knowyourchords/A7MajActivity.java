package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by michael.ritchie205 on 6/6/2017.
 */

public class A7MajActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a7mjr);


        final MediaPlayer a7SoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_sound);

        final Button playA7 = (Button) this.findViewById(R.id.a7Play);

        playA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a7SoundMediaPlayer.start();
            }
        });

    }
}

