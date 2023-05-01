package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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

        bogi_detailFragment Bogi_detailFragment = new bogi_detailFragment();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        myAdapter.getItem(position).getMovieName(),
                        Toast.LENGTH_SHORT).show();

                Bundle bundle = new Bundle();
                bundle.putString("name", myAdapter.getItem(position).getGrade());
                openfragment(Bogi_detailFragment, bundle);
            }
        });

    }

    public void openfragment(Fragment fragment, Bundle bundle) {
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().
                setCustomAnimations(R.anim.to_right, R.anim.from_right).
                replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
    }

    public void InitializeMovieData()
    {
        movieDataList = new ArrayList<SampleData>();

        movieDataList.add(new SampleData(R.drawable.logo, "미션임파서블","15세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "아저씨","19세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.logo, "어벤져스","12세 이상관람가"));
    }
}