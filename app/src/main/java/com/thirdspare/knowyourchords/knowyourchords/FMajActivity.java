package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/6/2017.
 */

public class FMajActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmjr);

        final MediaPlayer fSoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_sound);

        final Button playF = (Button) this.findViewById(R.id.fPlay);

        playF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fSoundMediaPlayer.start();
            }
        });

    }
}



