package com.example.constraintlayout.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.constraintlayout.fragment.EmployeeListFragment;
import com.example.constraintlayout.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmployeeListFragment listFragment = new EmployeeListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_layout, listFragment, listFragment
                .getClass()
                .getSimpleName())
                .addToBackStack(null)
                .commit();

    }
}
