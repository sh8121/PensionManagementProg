package com.example.sboo.pensionmanagementtool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MainFragment mainFragment;
    HomeMngFragment homeMngFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        homeMngFragment = new HomeMngFragment();
    }

    public void onFragmentChanged(FragmentType fragmentType){
        if(fragmentType == FragmentType.MainFragment){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, mainFragment).commit();
        }
        else if(fragmentType == FragmentType.HomeMngFragment){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, homeMngFragment).commit();
        }
    }
}
