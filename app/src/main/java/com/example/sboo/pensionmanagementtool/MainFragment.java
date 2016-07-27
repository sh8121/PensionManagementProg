package com.example.sboo.pensionmanagementtool;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by sboo on 2016-07-25.
 */
public class MainFragment extends Fragment {

    ViewGroup rootView;

    Button goHomeMngButton;
    Button goImageMngButton;
    Button goTourInfoMngbutton;

    MainActivity mainActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main, container, false);

        goHomeMngButton = (Button)rootView.findViewById(R.id.goHomeMngButton);
        goImageMngButton = (Button)rootView.findViewById(R.id.goImageMngButton);
        goTourInfoMngbutton = (Button)rootView.findViewById(R.id.goTourInfoMngButton);
        mainActivity = (MainActivity)getActivity();

        goHomeMngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation shakeAnim = AnimationUtils.loadAnimation(mainActivity.getApplicationContext(),R.anim.shake);
                shakeAnim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mainActivity.onFragmentChanged(FragmentType.HomeMngFragment);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                goHomeMngButton.startAnimation(shakeAnim);
            }
        });

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(rootView != null){
            ViewGroup parent = (ViewGroup)rootView.getParent();
            if(parent!= null){
                parent.removeView(rootView);
            }
        }
    }
}
