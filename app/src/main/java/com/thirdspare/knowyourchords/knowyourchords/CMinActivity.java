package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/8/2017.
 */

public class CMinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmin);

        final MediaPlayer cmSoundMediaPlayer = MediaPlayer.create(this, R.raw.cm_sound);

        final Button playCM = (Button) this.findViewById(R.id.cmPlay);

        playCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cmSoundMediaPlayer.start();
            }
        });

    }
}


