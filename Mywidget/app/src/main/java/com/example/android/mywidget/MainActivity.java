package com.example.android.mywidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public  String[] abc=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abc[1]="hi";
        abc[2]="this";
        abc[3]="is";
        abc[0]="a";
        abc[4]="case";

    }
    public String[] returnarray(){
        return abc;

    }
}
