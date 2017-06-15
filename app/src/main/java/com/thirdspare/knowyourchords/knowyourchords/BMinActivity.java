package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class BMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmin);

        final MediaPlayer bmSoundMediaPlayer = MediaPlayer.create(this, R.raw.bm_sound);

        final Button playBM = (Button) this.findViewById(R.id.bmPlay);

        playBM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmSoundMediaPlayer.start();
            }
        });

    }
}


