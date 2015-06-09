package com.nanodegree.phil.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LaunchActivity extends ActionBarActivity {

    Button btnSpotify;
    Button btnScores;
    Button btnLibrary;
    Button btnBuild;
    Button btnXYZ;
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        btnSpotify = (Button) findViewById(R.id.btn_main_spotify);
        btnScores = (Button) findViewById(R.id.btn_main_scores);
        btnLibrary= (Button) findViewById(R.id.btn_main_library);
        btnBuild = (Button) findViewById(R.id.btn_main_build);
        btnXYZ = (Button) findViewById(R.id.btn_main_xyz);
        btnCapstone = (Button) findViewById(R.id.btn_main_capstone);

        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("Spotify streamer app!");
            }
        });

        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast((String) btnScores.getText().toString());
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast((String) btnLibrary.getText().toString());
            }
        });

        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("build it bigger app!");
            }
        });

        btnXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("XYZ app!");
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("capstone project app!");
            }
        });
    }

    public void displayToast(String message) {
        String intro = "This button will launch my ";
        Toast.makeText(this,intro + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
