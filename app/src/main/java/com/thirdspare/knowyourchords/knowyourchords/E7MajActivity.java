package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael.ritchie205 on 6/6/2017.
 */

public class E7MajActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e7mjr);

        final MediaPlayer e7SoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_sound);

        final Button playE7 = (Button) this.findViewById(R.id.e7Play);

        playE7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e7SoundMediaPlayer.start();
            }
        });

    }
}



