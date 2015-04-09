package com.example.emeli_000.pfi3_2015_emelie_l;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class Assignment_1 extends ActionBarActivity {

    @Override
    protected void onStart() {
        super.onStart(); // k
        Log.i("Start","The app starts");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop","The app stops");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy","Destroyed");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("Resume","The app is resumed");
    }


    Random rand = new Random();
    int n = 0;

    public void buttonOnClick(View v) {

        Log.i("MyApp", "Button pressed");

        Button B = (Button) findViewById(R.id.button);
        TextView t1 = (TextView) findViewById(R.id.editText);


        n = rand.nextInt(4);

        String[] citat = getResources().getStringArray(R.array.citat);

        t1.setText(citat[n]);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_assignment_1, menu);
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
