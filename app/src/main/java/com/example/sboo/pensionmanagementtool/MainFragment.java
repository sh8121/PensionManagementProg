package com.example.sboo.pensionmanagementtool;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "MainFragment OnCreate 호출", Toast.LENGTH_LONG).show(); //테스트 코드
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "MainFragment OnCreateView 호출", Toast.LENGTH_LONG).show(); //테스트 코드
        rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main, container, false);

        goHomeMngButton = (Button)rootView.findViewById(R.id.goHomeMngButton);
        goImageMngButton = (Button)rootView.findViewById(R.id.goImageMngButton);
        goTourInfoMngbutton = (Button)rootView.findViewById(R.id.goTourInfoMngButton);

        goHomeMngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity)getActivity();
                activity.onFragmentChanged(FragmentType.HomeMngFragment);
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
