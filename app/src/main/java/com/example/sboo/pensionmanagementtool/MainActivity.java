package com.example.sboo.pensionmanagementtool;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (Fragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
    }

    public void onFragmentChanged()
}
