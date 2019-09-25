package com.example.recyclerviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    ImageView selectImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );
        selectImage = findViewById( R.id.selectImageView );
        Intent intent= getIntent();
        selectImage.setImageResource( intent.getIntExtra("image",0) );
    }
}
