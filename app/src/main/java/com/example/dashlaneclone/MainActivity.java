package com.example.dashlaneclone;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.TextView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void GeneratePass(View view)
    {
        String upperCaseChars = "ABCDEFGHIJKLMNPQRSTUVWXYZ";
        String lowerCaseChars = "abcdefghijkmnopqrstuvwxyz";
        String numberChars = "23456789";
        String specialChars = "!@#$";
        String allowedChars = "";
        String chars = upperCaseChars + lowerCaseChars + numberChars + specialChars ;
        TextView tv = findViewById(R.id.textView2);
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        for (int _ = 0; _ < 15; _++){
            int index = generator.nextInt(chars.length());
            randomStringBuilder.append(chars.charAt(index));
        }
        tv.setText(randomStringBuilder.toString());
    }
}
