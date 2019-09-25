package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ArrayList<String> personName = new ArrayList<>( Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
        ArrayList<Integer> personImage = new ArrayList<>( Arrays.asList( R.drawable.person1, R.drawable.person2, R.drawable.person3, R.drawable.person4, R.drawable.person5, R.drawable.person6, R.drawable.person7,R.drawable.person1, R.drawable.person2, R.drawable.person3, R.drawable.person4, R.drawable.person5, R.drawable.person6, R.drawable.person7) );

        RecyclerView recyclerView = findViewById( R.id.recyclerView );
        GridLayoutManager gridLayoutManager = new GridLayoutManager( getApplicationContext(),2 );
        recyclerView.setLayoutManager( gridLayoutManager);
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,personName,personImage);
        recyclerView.setAdapter( customAdapter );
    }
}
