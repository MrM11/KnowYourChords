package com.thirdspare.knowyourchords.knowyourchords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by michael.ritchie205 on 5/31/2017.
 */

public class MajorActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
    }

    public void showAMajorScreen(View view){
        Intent majorIntent = new Intent(this, MajorActivity.class);
        startActivity(majorIntent);
    }

    public void showBMajorScreen(View view){
        Intent minorIntent = new Intent (this, MinorActivity.class);
        startActivity(minorIntent);
    }

    public void showCMajorScreen (View view){
        Intent helpIntent = new Intent (this, HelpActivity.class);
        startActivity(helpIntent);
    }

    public void showDMajorScreen(View view){
        Intent majorIntent = new Intent(this, MajorActivity.class);
        startActivity(majorIntent);
    }

    public void showEMajorScreen(View view){
        Intent minorIntent = new Intent (this, MinorActivity.class);
        startActivity(minorIntent);
    }

    public void showFMajorScreen (View view){
        Intent helpIntent = new Intent (this, HelpActivity.class);
        startActivity(helpIntent);
    }

    public void showGMajorScreen(View view){
        Intent minorIntent = new Intent (this, MinorActivity.class);
        startActivity(minorIntent);
    }

    public void showE7MajorScreen(View view){
        Intent minorIntent = new Intent (this, MinorActivity.class);
        startActivity(minorIntent);
    }

    public void showA7MajorScreen(View view){
        Intent minorIntent = new Intent (this, MinorActivity.class);
        startActivity(minorIntent);
    }
}
