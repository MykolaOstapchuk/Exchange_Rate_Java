package com.example.testretrofir;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment cuFragment = new MainPage();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_page, cuFragment)
                .addToBackStack("MainPageFragment")
                .commit();
    }
}