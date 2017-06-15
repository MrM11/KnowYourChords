package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class GMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmin);

        final MediaPlayer gmSoundMediaPlayer = MediaPlayer.create(this, R.raw.gm_sound);

        final Button playGM = (Button) this.findViewById(R.id.gmPlay);

        playGM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gmSoundMediaPlayer.start();
            }
        });

    }
}


