package com.example.test.db_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity);

        ListView lv1;
        ArrayList<Data> data = new ArrayList<>();
        Custom_Adapter adapter;

        l1 =findViewById(R.id.line1);
        l2 =findViewById(R.id.line2);
        l3 =findViewById(R.id.line3);

        l5 =findViewById(R.id.line5);
        l6 =findViewById(R.id.line6);
        l7 =findViewById(R.id.line7);
        l8 =findViewById(R.id.line8);
        lv1 = findViewById(R.id.list_view2);
        adapter = new Custom_Adapter(data, this);
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));
        data.add(new Data(R.mipmap.ic_launcher, "룸타입","수용인원","가격"));

        lv1.setAdapter(adapter);

    }
    public void OnClick(View v){
        if (v.getId() == R.id.button2) {
            Intent intent = new Intent(StartActivity.this, Customer_start.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button3){
            Intent intent = new Intent(StartActivity.this, Staff_Start.class);
            startActivity(intent);
        }
         else if(v.getId() == R.id.button10) {
            l5.setVisibility(View.INVISIBLE);
            l6.setVisibility(View.VISIBLE);

            }
        if(v.getId() == R.id.button11) {

            l6.setVisibility(View.INVISIBLE);
            l1.setVisibility(View.VISIBLE);
        }
        if(v.getId() == R.id.button12){
            l6.setVisibility(View.VISIBLE);
            l7.setVisibility(View.INVISIBLE);
        }
        if(v.getId() == R.id.button13){

            l1.setVisibility(View.VISIBLE);
            l8.setVisibility(View.INVISIBLE);
        }
        }

    }
