package com.example.courseworkVersion;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button buttonDogIdentify;
    Button buttonBreed;
    Button buttonSearch;
    Switch switch_game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonBreed = (Button)findViewById(R.id.identify_breed);
        buttonDogIdentify = (Button)findViewById(R.id.identify_dog);
        buttonSearch = (Button)findViewById(R.id.search_dogs_breeds);
        switch_game = (Switch)findViewById(R.id.switch_game_levels);

        //when clicked it opens the identify dog layout
        buttonDogIdentify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,IdentifyBreed.class);
                startActivity(intent);
            }
        });

        //when clicked it opens the identify breed layout
        buttonBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DogIndentify.class);
                startActivity(intent);
            }
        });

        //when clicked it opens the search breed layout
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SearchDogBreeds.class);
                startActivity(intent);
            }
        });

        //switch is used here to change the game level if it is checked
        switch_game.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Intent intent = new Intent(MainActivity.this,NewGameActivity.class);
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



//    public void dogIdentify(View view) {
//        Intent intent = new Intent(MainActivity.this,DogIndentify.class);
//        intent.putExtra(extraMessage,mOrderMessage);
//        startActivity(intent);
//    }
}
