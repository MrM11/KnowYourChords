package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/6/2017.
 */

public class CMajActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmjr);

        final MediaPlayer cSoundMediaPlayer = MediaPlayer.create(this, R.raw.c_sound);

        final Button playC = (Button) this.findViewById(R.id.cPlay);

        playC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cSoundMediaPlayer.start();
            }
        });

    }
}



