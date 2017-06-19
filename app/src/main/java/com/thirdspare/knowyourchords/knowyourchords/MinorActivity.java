package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by michael.ritchie205 on 5/31/2017.
 */

public class MinorActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor);
    }
    //all of the following methods bring the user to the tabs of which ever chord they wish to play
    public void showAMinorScreen(View view){
        Intent majorIntent = new Intent(this, AMinActivity.class);
        startActivity(majorIntent);
    }

    public void showBMinorScreen(View view){
        Intent minorIntent = new Intent (this, BMinActivity.class);
        startActivity(minorIntent);
    }

    public void showCMinorScreen (View view){
        Intent helpIntent = new Intent (this, CMinActivity.class);
        startActivity(helpIntent);
    }

    public void showDMinorScreen(View view){
        Intent majorIntent = new Intent(this, DMinActivity.class);
        startActivity(majorIntent);
    }

    public void showEMinorScreen(View view){
        Intent minorIntent = new Intent (this, EMinActivity.class);
        startActivity(minorIntent);
    }

    public void showFMinorScreen (View view){
        Intent helpIntent = new Intent (this, FMinActivity.class);
        startActivity(helpIntent);
    }

    public void showGMinorScreen(View view){
        Intent minorIntent = new Intent (this, GMinActivity.class);
        startActivity(minorIntent);
    }

    public void showE7MinorScreen(View view){
        Intent minorIntent = new Intent (this, E7MinActivity.class);
        startActivity(minorIntent);
    }

    public void showA7MinorScreen(View view){
        Intent minorIntent = new Intent (this, A7MinActivity.class);
        startActivity(minorIntent);
    }
}

