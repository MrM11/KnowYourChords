package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/6/2017.
 */
public class AMajActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amjr);

        final MediaPlayer aSoundMediaPlayer = MediaPlayer.create(this, R.raw.a_sound);

        final Button playA = (Button) this.findViewById(R.id.aPlay);

        playA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aSoundMediaPlayer.start();
            }
        });

    }
}


