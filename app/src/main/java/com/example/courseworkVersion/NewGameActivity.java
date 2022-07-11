package com.example.courseworkVersion;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewGameActivity extends AppCompatActivity {


    Button buttonDogIdentify;
    Button buttonBreed;
    Switch switch_game;
    TextView textView_timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);


        buttonBreed = (Button)findViewById(R.id.identify_breed);
        buttonDogIdentify = (Button)findViewById(R.id.identify_dog);
        switch_game = (Switch)findViewById(R.id.switch_game_levels);
        textView_timer = (TextView)findViewById(R.id.textView_timer);



        buttonDogIdentify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewGameActivity.this,IdentifyBreedTimer.class);
                startActivity(intent);
            }
        });

        buttonBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewGameActivity.this,DogIndentifyTimer.class);
                startActivity(intent);
            }
        });



        //switch is used here to change the game level if it is unchecked
        switch_game.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    Intent intent = new Intent(NewGameActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });


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
}

