package com.example.courseworkVersion;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class SearchDogBreeds extends AppCompatActivity {


    ArrayList<Integer> breed_list ;
    ArrayList<Integer> goldenRetriever_list;
    ArrayList<Integer> boxer_list;
    ArrayList<Integer> pug_list;
    ArrayList<Integer> pomeranian_list;
    ArrayList<Integer> german_shepherd_list ;
    ArrayList<Integer> bull_mastiff_list ;
    ArrayList<Integer> boston_bull_list;
    ArrayList<Integer> labrador_retriever_list ;
    ArrayList<Integer> doberman_list;
    ArrayList<Integer> rottweiler_list;
    EditText editText;
    Button submit_button;
    Button stop_button;
    ImageView slideshow;
    int timerControl =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_dog_breeds);
        final DogIndentify dg = new DogIndentify();

        editText = (EditText)findViewById(R.id.search_input);
        submit_button = (Button)findViewById(R.id.submit_search);
        stop_button = (Button)findViewById(R.id.stop_button);
        slideshow = (ImageView)findViewById(R.id.slideshow_image);

        breed_list = new ArrayList<>();
        goldenRetriever_list = new ArrayList<>();
        boxer_list = new ArrayList<>();
        pug_list = new ArrayList<>();
        pomeranian_list = new ArrayList<>();
        german_shepherd_list = new ArrayList<>();
        bull_mastiff_list = new ArrayList<>();
        boston_bull_list = new ArrayList<>();
        labrador_retriever_list = new ArrayList<>();
        doberman_list = new ArrayList<>();
        rottweiler_list = new ArrayList<>();

        //for loops are used to retrieve the images from drawable folder and store it to array list and arrays
        for (int i=0;i<9600;i++) {
            try {

                //using getResources you can retrieve the images from drawable
                //credits to stackoverflow
                int resID = getResources().getIdentifier("n02099601_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    goldenRetriever_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<15800;i++) {
            try {

                int resID = getResources().getIdentifier("n02108089_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    boxer_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<12500;i++) {
            try {

                int resID = getResources().getIdentifier("n02110958_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    pug_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<16100;i++) {
            try {

                int resID = getResources().getIdentifier("n02106662_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    german_shepherd_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<9100;i++) {
            try {

                int resID = getResources().getIdentifier("n02106550_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    rottweiler_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<10100;i++) {
            try {

                int resID = getResources().getIdentifier("n02107142_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    doberman_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<3600;i++) {
            try {

                int resID = getResources().getIdentifier("n02108422_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    bull_mastiff_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<3900;i++) {
            try {

                int resID = getResources().getIdentifier("n02112018_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    pomeranian_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<3700;i++) {
            try {

                int resID = getResources().getIdentifier("n02096585_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    boston_bull_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<5010;i++) {
            try {

                int resID = getResources().getIdentifier("n02099712_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    labrador_retriever_list.add(resID);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }



        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //to start the slideshow again after it is stopped
                timerControl=0;
                search();


            }
        });

        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //to stop the slideshow
                timerControl=1;
            }
        });



    }



    public void search(){

        //to get the text which is written
        String getSearch = editText.getText().toString();

            //if the written value is equal to this then images are run randomly
            if (getSearch.equals("Golden Retriever")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                //credits to stackoverflow
                final Handler handler = new Handler();
                //credits to stackoverflow
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        //if the timercontrol is 0 the slideshow starts
                        if(timerControl==0) {
                            int no = new Random().nextInt(goldenRetriever_list.size());
                            slideshow.setImageResource(goldenRetriever_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Boxer")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(boxer_list.size());
                            slideshow.setImageResource(boxer_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Boston Bull")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(boston_bull_list.size());
                            slideshow.setImageResource(boston_bull_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Labrador Retriever")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(labrador_retriever_list.size());
                            slideshow.setImageResource(labrador_retriever_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Pug")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(pug_list.size());
                            slideshow.setImageResource(pug_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Pomeranian")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(pomeranian_list.size());
                            slideshow.setImageResource(pomeranian_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Bull Mastiff")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(bull_mastiff_list.size());
                            slideshow.setImageResource(bull_mastiff_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("German Shepherd")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(german_shepherd_list.size());
                            slideshow.setImageResource(german_shepherd_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Rottweiler")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(rottweiler_list.size());
                            slideshow.setImageResource(rottweiler_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }

            if (getSearch.equals("Doberman")) {

                final Random random = new Random();

                final int timer = random.nextInt(5000);

                final Handler handler = new Handler();
                final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if(timerControl==0) {
                            int no = new Random().nextInt(doberman_list.size());
                            slideshow.setImageResource(doberman_list.get(no));
                            handler.postDelayed(this, timer);
                        }
                    }

                };
                handler.post(runnable);

            }
        }

    }



