package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/6/2017.
 */

public class GMajActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmjr);

        final MediaPlayer gSoundMediaPlayer = MediaPlayer.create(this, R.raw.g_sound);

        final Button playG = (Button) this.findViewById(R.id.gPlay);

        playG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gSoundMediaPlayer.start();
            }
        });

    }
}


