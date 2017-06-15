package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class FMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmin);

        final MediaPlayer fmSoundMediaPlayer = MediaPlayer.create(this, R.raw.fm_sound);

        final Button playFM = (Button) this.findViewById(R.id.fmPlay);

        playFM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fmSoundMediaPlayer.start();
            }
        });

    }
}

