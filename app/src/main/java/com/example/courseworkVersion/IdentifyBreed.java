package com.example.courseworkVersion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class IdentifyBreed extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    Button button;
    int random;
    int random1;
    int random2;
    int getRandom;
    int getRandom1;
    int getRandom2;
    TextView textview;
    TextView textView2;
    Object[] goldenRetreiver1;
    Object[] boxer;
    Object[] pug;
    Object[] bull_mastiff;
    Object[] german_shepherd;
    Object[] doberman;
    Object[] pomeranian;
    Object[] labrador_retriever;
    Object[] boston_bull;
    Object[] rottweiler;
    int attempt =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_dog);


        DogIndentify dg = new DogIndentify();

        imageView1 = (ImageView) findViewById(R.id.random_image_one);
        imageView2 = (ImageView) findViewById(R.id.random_image_two);
        imageView3 = (ImageView) findViewById(R.id.random_image_three);
        button = (Button) findViewById(R.id.next_button_layout2);
        textview = (TextView) findViewById(R.id.textView_random_image);
        textView2 = (TextView) findViewById(R.id.textView_answer);

        final ArrayList<Integer> breed_list = new ArrayList<>();
        final ArrayList<Integer> goldenRetriever_list = new ArrayList<>();
        final ArrayList<Integer> boxer_list = new ArrayList<>();
        final ArrayList<Integer> pug_list = new ArrayList<>();
        final ArrayList<Integer> pomeranian_list = new ArrayList<>();
        final ArrayList<Integer> german_shepherd_list = new ArrayList<>();
        final ArrayList<Integer> bull_mastiff_list = new ArrayList<>();
        final ArrayList<Integer> boston_bull_list = new ArrayList<>();
        final ArrayList<Integer> labrador_retriever_list = new ArrayList<>();
        final ArrayList<Integer> doberman_list = new ArrayList<>();
        final ArrayList<Integer> rottweiler_list = new ArrayList<>();

        //for loops are used to retrieve the images frma drawable folder and store it to array list and arrays
        for (int i = 0; i < 9600; i++) {
            try {

                //using getResources you can retrieve the images from drawable
                //credits to stackoverflow
                int resID = getResources().getIdentifier("n02099601_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    goldenRetriever_list.add(resID);
                    goldenRetreiver1 = goldenRetriever_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 15800; i++) {
            try {

                int resID = getResources().getIdentifier("n02108089_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    boxer_list.add(resID);
                    boxer = boxer_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 12500; i++) {
            try {

                int resID = getResources().getIdentifier("n02110958_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    pug_list.add(resID);
                    pug = pug_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 16100; i++) {
            try {

                int resID = getResources().getIdentifier("n02106662_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    german_shepherd_list.add(resID);
                    german_shepherd = german_shepherd_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 9100; i++) {
            try {

                int resID = getResources().getIdentifier("n02106550_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    rottweiler_list.add(resID);
                    rottweiler = rottweiler_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 10100; i++) {
            try {

                int resID = getResources().getIdentifier("n02107142_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    doberman_list.add(resID);
                    doberman = doberman_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 3600; i++) {
            try {

                int resID = getResources().getIdentifier("n02108422_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    bull_mastiff_list.add(resID);
                    bull_mastiff = bull_mastiff_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 3900; i++) {
            try {

                int resID = getResources().getIdentifier("n02112018_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    pomeranian_list.add(resID);
                    pomeranian = pomeranian_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 3700; i++) {
            try {

                int resID = getResources().getIdentifier("n02096585_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    boston_bull_list.add(resID);
                    boston_bull = boston_bull_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5010; i++) {
            try {

                int resID = getResources().getIdentifier("n02099712_" + i, "drawable", getPackageName());
                if (resID != 0) {
                    breed_list.add(resID);
                    labrador_retriever_list.add(resID);
                    labrador_retriever = labrador_retriever_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //getting the index of the arraylist randomnly and storing it to three different variables
        random = new Random().nextInt(breed_list.size());
        random1 = new Random().nextInt(breed_list.size());
        random2 = new Random().nextInt(breed_list.size());

        getRandom = breed_list.get(random);
        getRandom1 = breed_list.get(random1);
        getRandom2 = breed_list.get(random2);

        //for loop is used to run the process till the three images displayed are different
        for (int i = 0; i < 1; i++) {

            //if condition used to make sure that all three images are different
            if ((getRandom != getRandom1) && (getRandom1 != getRandom2) && (getRandom != getRandom2)) {

                //setting the images
                imageView1.setImageResource(breed_list.get(random));
                imageView2.setImageResource(breed_list.get(random1));
                imageView3.setImageResource(breed_list.get(random2));
                i = 1;

            }

        }


        //for loop is used here to print the breed name if any of the image has that breed
        for (int i = 0; i < goldenRetreiver1.length; i++) {
            if ((goldenRetreiver1[i].equals(getRandom)) || (goldenRetreiver1[i].equals(getRandom1) || (goldenRetreiver1[i].equals(getRandom2)))) {
                textview.setText("Golden Retriever");
                i = goldenRetreiver1.length;
            }
        }

        for (int i = 0; i < boxer.length; i++) {
            if ((boxer[i].equals(getRandom)) || (boxer[i].equals(getRandom1) || (boxer[i].equals(getRandom2)))) {
                textview.setText("boxer");
                i = boxer.length;
            }
        }

        for (int i = 0; i < doberman.length; i++) {
            if ((doberman[i].equals(getRandom)) || (doberman[i].equals(getRandom1) || (doberman[i].equals(getRandom2)))) {
                textview.setText("Doberman");
                i = doberman.length;
            }
        }

        for (int i = 0; i < pomeranian.length; i++) {
            if ((pomeranian[i].equals(getRandom)) || (pomeranian[i].equals(getRandom1) || (pomeranian[i].equals(getRandom2)))) {
                textview.setText("Pomeranian");
                i = pomeranian.length;
            }
        }

        for (int i = 0; i < bull_mastiff.length; i++) {
            if ((bull_mastiff[i].equals(getRandom)) || (bull_mastiff[i].equals(getRandom1) || (bull_mastiff[i].equals(getRandom2)))) {
                textview.setText("Bull Mastiff");
                i = bull_mastiff.length;
            }
        }

        for (int i = 0; i < labrador_retriever.length; i++) {
            if ((labrador_retriever[i].equals(getRandom)) || (labrador_retriever[i].equals(getRandom1) || (labrador_retriever[i].equals(getRandom2)))) {
                textview.setText("Labrador Retriever");
                i = labrador_retriever.length;
            }
        }

        for (int i = 0; i < pug.length; i++) {
            if ((pug[i].equals(getRandom)) || (pug[i].equals(getRandom1) || (pug[i].equals(getRandom2)))) {
                textview.setText("Pug");
                i = pug.length;
            }
        }

        for (int i = 0; i < boston_bull.length; i++) {
            if ((boston_bull[i].equals(getRandom)) || (boston_bull[i].equals(getRandom1) || (boston_bull[i].equals(getRandom2)))) {
                textview.setText("Boston Bull");
                i = boston_bull.length;
            }
        }

        for (int i = 0; i < rottweiler.length; i++) {
            if ((rottweiler[i].equals(getRandom)) || (rottweiler[i].equals(getRandom1) || (rottweiler[i].equals(getRandom2)))) {
                textview.setText("Rottweiler");
                i = rottweiler.length;
            }
        }

        for (int i = 0; i < german_shepherd.length; i++) {
            if ((german_shepherd[i].equals(getRandom)) || (german_shepherd[i].equals(getRandom1) || (german_shepherd[i].equals(getRandom2)))) {
                textview.setText("German Shepherd");
                i = german_shepherd.length;
            }
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this is used to make sure that the image is clickable once and one attempt only
                attempt=0;

                random = new Random().nextInt(breed_list.size());
                random1 = new Random().nextInt(breed_list.size());
                random2 = new Random().nextInt(breed_list.size());

                getRandom = breed_list.get(random);
                getRandom1 = breed_list.get(random1);
                getRandom2 = breed_list.get(random2);

                for (int i = 0; i < 1; i++) {

                    if ((getRandom != getRandom1) && (getRandom1 != getRandom2) && (getRandom != getRandom2)) {

                        imageView1.setImageResource(breed_list.get(random));
                        imageView2.setImageResource(breed_list.get(random1));
                        imageView3.setImageResource(breed_list.get(random2));
                        i = 1;

                    }

                }

                for (int i = 0; i < goldenRetreiver1.length; i++) {
                    if ((goldenRetreiver1[i].equals(getRandom)) || (goldenRetreiver1[i].equals(getRandom1) || (goldenRetreiver1[i].equals(getRandom2)))) {
                        textview.setText("Golden Retriever");
                        i = goldenRetreiver1.length;
                    }
                }

                for (int i = 0; i < boxer.length; i++) {
                    if ((boxer[i].equals(getRandom)) || (boxer[i].equals(getRandom1) || (boxer[i].equals(getRandom2)))) {
                        textview.setText("Boxer");
                        i = boxer.length;
                    }
                }

                for (int i = 0; i < doberman.length; i++) {
                    if ((doberman[i].equals(getRandom)) || (doberman[i].equals(getRandom1) || (doberman[i].equals(getRandom2)))) {
                        textview.setText("Doberman");
                        i = doberman.length;
                    }
                }

                for (int i = 0; i < pomeranian.length; i++) {
                    if ((pomeranian[i].equals(getRandom)) || (pomeranian[i].equals(getRandom1) || (pomeranian[i].equals(getRandom2)))) {
                        textview.setText("Pomeranian");
                        i = pomeranian.length;
                    }
                }

                for (int i = 0; i < bull_mastiff.length; i++) {
                    if ((bull_mastiff[i].equals(getRandom)) || (bull_mastiff[i].equals(getRandom1) || (bull_mastiff[i].equals(getRandom2)))) {
                        textview.setText("Bull Mastiff");
                        i = bull_mastiff.length;
                    }
                }

                for (int i = 0; i < labrador_retriever.length; i++) {
                    if ((labrador_retriever[i].equals(getRandom)) || (labrador_retriever[i].equals(getRandom1) || (labrador_retriever[i].equals(getRandom2)))) {
                        textview.setText("Labrador Retriever");
                        i = labrador_retriever.length;
                    }
                }

                for (int i = 0; i < pug.length; i++) {
                    if ((pug[i].equals(getRandom)) || (pug[i].equals(getRandom1) || (pug[i].equals(getRandom2)))) {
                        textview.setText("Pug");
                        i = pug.length;
                    }
                }

                for (int i = 0; i < boston_bull.length; i++) {
                    if ((boston_bull[i].equals(getRandom)) || (boston_bull[i].equals(getRandom1) || (boston_bull[i].equals(getRandom2)))) {
                        textview.setText("Boston Bull");
                        i = boston_bull.length;
                    }
                }

                for (int i = 0; i < rottweiler.length; i++) {
                    if ((rottweiler[i].equals(getRandom)) || (rottweiler[i].equals(getRandom1) || (rottweiler[i].equals(getRandom2)))) {
                        textview.setText("Rottweiler");
                        i = rottweiler.length;
                    }
                }

                for (int i = 0; i < german_shepherd.length; i++) {
                    if ((german_shepherd[i].equals(getRandom)) || (german_shepherd[i].equals(getRandom1) || (german_shepherd[i].equals(getRandom2)))) {
                        textview.setText("German Shepherd");
                        i = german_shepherd.length;
                    }
                }

                image1(v);
                image2(v);
                image3(v);

                textView2.setText("");
                attempt=0;
            }

        });

        //credits to https://www.youtube.com/watch?v=TcTgbVudLyQ
        if(savedInstanceState != null) {
            textView2.setText(savedInstanceState.getString("answer"));
            textview.setText(savedInstanceState.getString("breed_name"));
            imageView1.setImageResource(breed_list.get(savedInstanceState.getInt("random")));
            imageView2.setImageResource(breed_list.get(savedInstanceState.getInt("random1")));
            imageView3.setImageResource(breed_list.get(savedInstanceState.getInt("random2")));
            attempt = savedInstanceState.getInt("attempt");
        }

    }


    //credits to https://www.youtube.com/watch?v=TcTgbVudLyQ
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        CharSequence answer = textView2.getText();
        CharSequence breed_name = textview.getText();
        outState.putString("breed_name", String.valueOf(breed_name));
        outState.putString("answer", String.valueOf(answer));
        outState.putInt("random", random);
        outState.putInt("random1", random1);
        outState.putInt("random2", random2);
        outState.putInt("attempt",attempt);
    }

    public void image3(View view) {

        //only if the image is not clicked even once then this works
        if(attempt==0) {

            textView2.setText("");

            String text = (String) textview.getText();

            //if condition is used to display correct or wrong
            if (text.equals("Labrador Retriever")) {
                for (int i = 0; i < labrador_retriever.length; i++) {
                    if (labrador_retriever[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = labrador_retriever.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Boston Bull")) {
                for (int i = 0; i < boston_bull.length; i++) {
                    if (boston_bull[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = boston_bull.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Pomeranian")) {
                for (int i = 0; i < pomeranian.length; i++) {
                    if (pomeranian[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = pomeranian.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Rottweiler")) {
                for (int i = 0; i < rottweiler.length; i++) {
                    if (rottweiler[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = rottweiler.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Bull Mastiff")) {
                for (int i = 0; i < bull_mastiff.length; i++) {
                    if (bull_mastiff[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = bull_mastiff.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Boxer")) {
                for (int i = 0; i < boxer.length; i++) {
                    if (boxer[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = boxer.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("German Shepherd")) {
                for (int i = 0; i < german_shepherd.length; i++) {
                    if (german_shepherd[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = german_shepherd.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Golden Retriever")) {
                for (int i = 0; i < goldenRetreiver1.length; i++) {
                    if (goldenRetreiver1[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = goldenRetreiver1.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Doberman")) {
                for (int i = 0; i < doberman.length; i++) {
                    if (doberman[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = doberman.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Pug")) {
                for (int i = 0; i < pug.length; i++) {
                    if (pug[i].equals(getRandom2)) {
                        textView2.setText(R.string.correct);
                        i = pug.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }
        }

        attempt++;
    }

    public void image2(View view) {

        if(attempt==0) {
            textView2.setText("");

            String text = (String) textview.getText();

            if (text.equals("Labrador Retriever")) {
                for (int i = 0; i < labrador_retriever.length; i++) {
                    if (labrador_retriever[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = labrador_retriever.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Boston Bull")) {
                for (int i = 0; i < boston_bull.length; i++) {
                    if (boston_bull[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = boston_bull.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Pomeranian")) {
                for (int i = 0; i < pomeranian.length; i++) {
                    if (pomeranian[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = pomeranian.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Rottweiler")) {
                for (int i = 0; i < rottweiler.length; i++) {
                    if (rottweiler[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = rottweiler.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Bull Mastiff")) {
                for (int i = 0; i < bull_mastiff.length; i++) {
                    if (bull_mastiff[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = bull_mastiff.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Boxer")) {
                for (int i = 0; i < boxer.length; i++) {
                    if (boxer[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = boxer.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("German Shepherd")) {
                for (int i = 0; i < german_shepherd.length; i++) {
                    if (german_shepherd[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = german_shepherd.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Golden Retriever")) {
                for (int i = 0; i < goldenRetreiver1.length; i++) {
                    if (goldenRetreiver1[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = goldenRetreiver1.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Doberman")) {
                for (int i = 0; i < doberman.length; i++) {
                    if (doberman[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = doberman.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Pug")) {
                for (int i = 0; i < pug.length; i++) {
                    if (pug[i].equals(getRandom1)) {
                        textView2.setText(R.string.correct);
                        i = pug.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }
        }
        attempt++;

    }

    public void image1(View view) {
        if(attempt==0) {
            textView2.setText("");

            String text = (String) textview.getText();

            if (text.equals("Labrador Retriever")) {
                for (int i = 0; i < labrador_retriever.length; i++) {
                    if (labrador_retriever[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = labrador_retriever.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Boston Bull")) {
                for (int i = 0; i < boston_bull.length; i++) {
                    if (boston_bull[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = boston_bull.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Pomeranian")) {
                for (int i = 0; i < pomeranian.length; i++) {
                    if (pomeranian[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = pomeranian.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Rottweiler")) {
                for (int i = 0; i < rottweiler.length; i++) {
                    if (rottweiler[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = rottweiler.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Bull Mastiff")) {
                for (int i = 0; i < bull_mastiff.length; i++) {
                    if (bull_mastiff[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = bull_mastiff.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Boxer")) {
                for (int i = 0; i < boxer.length; i++) {
                    if (boxer[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = boxer.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("German Shepherd")) {
                for (int i = 0; i < german_shepherd.length; i++) {
                    if (german_shepherd[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = german_shepherd.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Golden Retriever")) {
                for (int i = 0; i < goldenRetreiver1.length; i++) {
                    if (goldenRetreiver1[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = goldenRetreiver1.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Doberman")) {
                for (int i = 0; i < doberman.length; i++) {
                    if (doberman[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = doberman.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }

            if (text.equals("Pug")) {
                for (int i = 0; i < pug.length; i++) {
                    if (pug[i].equals(getRandom)) {
                        textView2.setText(R.string.correct);
                        i = pug.length;

                    } else {
                        textView2.setText(R.string.wrong);
                    }
                }
            }
        }
        attempt++;
    }


}
