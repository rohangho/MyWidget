package com.example.android.mywidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CustomDataType> array=new ArrayList<>();
        array.add(new CustomDataType("hi"));
        array.add(new CustomDataType("this"));
        array.add(new CustomDataType("is"));
        array.add(new CustomDataType("test"));
        array.add(new CustomDataType("case"));


    }


    }

