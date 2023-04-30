package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class bogi_listActivity extends AppCompatActivity {

    ArrayList<SampleData> movieDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bogi_list);

        this.InitializeMovieData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final MyAdapter myAdapter = new MyAdapter(this,movieDataList);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        myAdapter.getItem(position).getMovieName(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeMovieData()
    {
        movieDataList = new ArrayList<SampleData>();

        movieDataList.add(new SampleData(R.drawable.logo, "미션임파서블","15세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "아저씨","19세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
    }
}