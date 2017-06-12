package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class DMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmin);

        final MediaPlayer dmSoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_sound);

        final Button playDM = (Button) this.findViewById(R.id.dmPlay);

        playDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dmSoundMediaPlayer.start();
            }
        });

    }
}


