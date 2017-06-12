package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class A7MinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a7min);

        final MediaPlayer a7mSoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_sound);

        final Button playA7M = (Button) this.findViewById(R.id.a7mPlay);

        playA7M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a7mSoundMediaPlayer.start();
            }
        });

    }
}


