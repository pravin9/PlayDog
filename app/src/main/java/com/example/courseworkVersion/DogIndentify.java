package com.example.courseworkVersion;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DogIndentify<drawables> extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView imageView;
    ImageView imageView1;
    Button button2;
    Random random;
    TextView textView;
    TextView textview2;
    int name;
    String spinnerLabel;
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
    ArrayList<Integer> breed_list;
    Spinner spinner;

    int no = 0;
    int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_breed);

        imageView = (ImageView)findViewById(R.id.breed_dog_images);
        imageView1 = (ImageView)findViewById(R.id.breed_dog_images);
        button2 = (Button)findViewById(R.id.submit);
        random = new Random();
        textView = (TextView)findViewById(R.id.answer_text);
        textview2 = (TextView)findViewById(R.id.text_right_breed);
        breed_list = new ArrayList<>();
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
        for (int i=0;i<16100;i++) {
            try {

                //using getResources you can retrieve the images from drawable
                //credits to stackoverflow
                int resID = getResources().getIdentifier("n02099601_"+i, "drawable", getPackageName());
                if(resID != 0){
                    breed_list.add(resID);
                    goldenRetriever_list.add(resID);
                    goldenRetreiver1 = goldenRetriever_list.toArray();
                }

                int resID_1 = getResources().getIdentifier("n02099712_"+i, "drawable", getPackageName());
                if(resID_1 != 0){
                    breed_list.add(resID_1);
                    labrador_retriever_list.add(resID_1);
                    labrador_retriever = labrador_retriever_list.toArray();
                }

                int resID_2 = getResources().getIdentifier("n02108089_"+i, "drawable", getPackageName());
                if(resID_2 != 0){
                    breed_list.add(resID_2);
                    boxer_list.add(resID_2);
                    boxer = boxer_list.toArray();
                }

                int resID_3 = getResources().getIdentifier("n02110958_"+i, "drawable", getPackageName());
                if(resID_3 != 0){
                    breed_list.add(resID_3);
                    pug_list.add(resID_3);
                    pug = pug_list.toArray();
                }

                int resID_4 = getResources().getIdentifier("n02106662_"+i, "drawable", getPackageName());
                if(resID_4 != 0){
                    breed_list.add(resID_4);
                    german_shepherd_list.add(resID_4);
                    german_shepherd = german_shepherd_list.toArray();
                }

                int resID_5 = getResources().getIdentifier("n02107142_"+i, "drawable", getPackageName());
                if(resID_5 != 0){
                    breed_list.add(resID_5);
                    doberman_list.add(resID_5);
                    doberman = doberman_list.toArray();
                }

                int resID_6 = getResources().getIdentifier("n02106550_"+i, "drawable", getPackageName());
                if(resID_6 != 0){
                    breed_list.add(resID_6);
                    rottweiler_list.add(resID_6);
                    rottweiler = rottweiler_list.toArray();
                }

                int resID_7 = getResources().getIdentifier("n02108422_"+i, "drawable", getPackageName());
                if(resID_7 != 0){
                    breed_list.add(resID_7);
                    bull_mastiff_list.add(resID_7);
                    bull_mastiff = bull_mastiff_list.toArray();
                }

                int resID_8 = getResources().getIdentifier("n02112018_"+i, "drawable", getPackageName());
                if(resID_8 != 0){
                    breed_list.add(resID_8);
                    pomeranian_list.add(resID_8);
                    pomeranian = pomeranian_list.toArray();
                }


                int resID_9 = getResources().getIdentifier("n02096585_"+i, "drawable", getPackageName());
                if(resID_9 != 0){
                    breed_list.add(resID_9);
                    boston_bull_list.add(resID_9);
                    boston_bull = boston_bull_list.toArray();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }



         spinner = (Spinner)findViewById(R.id.breed_names_list);

        //getting the index of the arraylist randomly and storing it to position
        position = new Random().nextInt(breed_list.size());

        //setting the image
        imageView.setImageResource(Integer.valueOf(breed_list.get(position)));
        name = breed_list.get(position);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if loop is used to change the submit button to next when submit is clicked
                if (no == 0) {

                    //if condition is used to check whether that particular breed which is chose is matching the image
                    if (spinnerLabel.equals("Golden Retriever")) {
                        System.out.println("in");
                        System.out.println(name);

                        //for loop is used to check whether the image displayed is in the array of the particular breed
                        for (int i = 0; i < goldenRetreiver1.length; i++) {
                            if (goldenRetreiver1[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                System.out.println("Correct");
                                i = goldenRetreiver1.length;

                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }

                    }

                    if (spinnerLabel.equals("Boxer")) {
                        for (int i = 0; i < boxer.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (boxer[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = boxer.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();

                            }
                        }
                    }

                    if (spinnerLabel.equals("Pug")) {
                        for (int i = 0; i < pug.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (pug[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = pug.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }
                    }

                    if (spinnerLabel.equals("German Shepherd")) {
                        for (int i = 0; i < german_shepherd.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (german_shepherd[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = german_shepherd.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }
                    }

                    if (spinnerLabel.equals("Rottweiler")) {
                        for (int i = 0; i < rottweiler.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (rottweiler[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = rottweiler.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }
                    }

                    if (spinnerLabel.equals("Doberman")) {
                        for (int i = 0; i < doberman.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (doberman[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = doberman.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }
                    }

                    if (spinnerLabel.equals("Bull Mastiff")) {
                        for (int i = 0; i < bull_mastiff.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (bull_mastiff[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = bull_mastiff.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }
                    }

                    if (spinnerLabel.equals("Pomeranian")) {
                        for (int i = 0; i < pomeranian.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (pomeranian[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = pomeranian.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();
                            }
                        }
                    }

                    if (spinnerLabel.equals("Boston Bull")) {
                        for (int i = 0; i < boston_bull.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (boston_bull[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = boston_bull.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();


                            }
                        }
                    }

                    if (spinnerLabel.equals("Labrador Retriever")) {
                        for (int i = 0; i < labrador_retriever.length; i++) {
                            System.out.println("no" + name);
                            System.out.println("id" + boxer[i]);
                            if (labrador_retriever[i].equals(name)) {
                                textView.setText(R.string.correct);
                                textview2.setText("");
                                i = labrador_retriever.length;
                            } else {
                                textView.setText(R.string.wrong);
                                loop();


                            }
                        }
                    }



                    button2.setText(R.string.next_button);
                    no++;

                } else if (no == 1) {

                    textview2.setText("");

                    System.out.println(breed_list);
                    System.out.println(Arrays.toString(goldenRetreiver1));
                    //System.out.println(Arrays.toString(testing));

                    position = new Random().nextInt(breed_list.size());
                    imageView.setImageResource(Integer.valueOf(breed_list.get(position)));
                    name = breed_list.get(position);
                    //arrImages.remove(position);
                    //imageView.setImageResource(arrImages.get(5));

                    textView.setText("");
                    button2.setText(R.string.submit_label);

                    no = 0;
                }

            }

        });



        if(spinner != null){
            spinner.setOnItemSelectedListener(this);
        }


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.breed_names,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        if(spinner != null){
            spinner.setAdapter(adapter);
        }

        //credits to https://www.youtube.com/watch?v=TcTgbVudLyQ
        if(savedInstanceState != null) {
            textView.setText(savedInstanceState.getString("answer"));
            textview2.setText(savedInstanceState.getString("breed_name"));
            imageView.setImageResource(breed_list.get(savedInstanceState.getInt("position")));
            button2.setText(savedInstanceState.getString("button_label"));
            no = savedInstanceState.getInt("no");
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinnerLabel = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //credits to https://www.youtube.com/watch?v=TcTgbVudLyQ
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        CharSequence answer =  textView.getText();
        CharSequence breed_name = textview2.getText();
        CharSequence button_label = button2.getText();

        outState.putString("answer", String.valueOf(answer));
        outState.putString("breed_name", String.valueOf(breed_name));
        outState.putInt("position", position);
        outState.putString("button_label", String.valueOf(button_label));
        outState.putInt("no",no);


    }



    //this loop is used to get the breed of the displayed image in case the answer is wrong
    public void loop(){
        for(int j = 0; j < goldenRetreiver1.length; j++){
            if (goldenRetreiver1[j].equals(name)) {
                textview2.setText(R.string.golden_retriever);
                j = goldenRetreiver1.length;
            }
        }

        for(int j = 0; j < pug.length; j++){
            if (pug[j].equals(name)) {
                textview2.setText(R.string.pug);
                j = pug.length;
            }
        }

        for(int j = 0; j < pomeranian.length; j++){
            if (pomeranian[j].equals(name)) {
                textview2.setText(R.string.pomeranian);
                j = pomeranian.length;
            }
        }

        for(int j = 0; j < boston_bull.length; j++){
            if (boston_bull[j].equals(name)) {
                textview2.setText(R.string.boston_bull);
                j = boston_bull.length;
            }
        }

        for(int j = 0; j < labrador_retriever.length; j++){
            if (labrador_retriever[j].equals(name)) {
                textview2.setText(R.string.labrador_retriever);
                j = labrador_retriever.length;
            }
        }

        for(int j = 0; j < bull_mastiff.length; j++){
            if (bull_mastiff[j].equals(name)) {
                textview2.setText(R.string.bull_mastiff);
                j = bull_mastiff.length;
            }
        }

        for(int j = 0; j < boxer.length; j++){
            if (boxer[j].equals(name)) {
                textview2.setText(R.string.boxer);
                j = boxer.length;
            }
        }

        for(int j = 0; j < german_shepherd.length; j++){
            if (german_shepherd[j].equals(name)) {
                textview2.setText(R.string.german_shepherd);
                j = german_shepherd.length;
            }
        }

        for(int j = 0; j < rottweiler.length; j++){
            if (rottweiler[j].equals(name)) {
                textview2.setText(R.string.rottweiler);
                j = rottweiler.length;
            }
        }

        for(int j = 0; j < doberman.length; j++){
            if (doberman[j].equals(name)) {
                textview2.setText(R.string.doberman);
                j = doberman.length;
            }
        }


    }
}
