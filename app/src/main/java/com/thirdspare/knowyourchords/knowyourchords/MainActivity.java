package com.thirdspare.knowyourchords.knowyourchords;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //when the button is clicked it will direct the user to the screen they wish to view
    public void showMajorScreen(View view){
        Intent majorIntent = new Intent(this, MajorActivity.class);
        startActivity(majorIntent);
    }

    public void showMinorScreen(View view){
        Intent minorIntent = new Intent (this, MinorActivity.class);
        startActivity(minorIntent);
    }

    public void showHelpScreen (View view){
        Intent helpIntent = new Intent (this, HelpActivity.class);
        startActivity(helpIntent);
    }
}
