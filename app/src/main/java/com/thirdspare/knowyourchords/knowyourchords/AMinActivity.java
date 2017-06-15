package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class AMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amin);

        final MediaPlayer amSoundMediaPlayer = MediaPlayer.create(this, R.raw.am_sound);

        final Button playAm = (Button) this.findViewById(R.id.amPlay);

        playAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amSoundMediaPlayer.start();
            }
        });

    }
}


