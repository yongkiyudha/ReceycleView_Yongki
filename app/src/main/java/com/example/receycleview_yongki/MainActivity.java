package com.example.receycleview_yongki;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView= findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter= new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<model> getMyList(){

        ArrayList<model> models =new ArrayList<>();
        model m = new model();
        m.setTitle("Sukirno");
        m.setDeskripsi("Ayah");
        m.setImg(R.drawable.ayah);
        models.add(m);

        m = new model();
        m.setTitle("Eti Suparini");
        m.setDeskripsi("Ibu");
        m.setImg(R.drawable.ibu);
        models.add(m);

        m = new model();
        m.setTitle("Yongki Yudha");
        m.setDeskripsi("Abang");
        m.setImg(R.drawable.yudha);
        models.add(m);

        m = new model();
        m.setTitle("Elvin Sindi");
        m.setDeskripsi("Adek");
        m.setImg(R.drawable.sindi);
        models.add(m);

        return models;
    }
}
