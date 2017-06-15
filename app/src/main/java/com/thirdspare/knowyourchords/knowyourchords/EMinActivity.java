package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class EMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emin);

        final MediaPlayer emSoundMediaPlayer = MediaPlayer.create(this, R.raw.em_sound);

        final Button playEM = (Button) this.findViewById(R.id.emPlay);

        playEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emSoundMediaPlayer.start();
            }
        });

    }
}


