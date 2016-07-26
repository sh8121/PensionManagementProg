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
public class HomeMngFragment extends Fragment {

    ViewGroup rootView;
    Button goHomeFromHomeMngButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "HomeMngFragment onCreate 호출", Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "HomeMngFragment onCreateView 호출", Toast.LENGTH_LONG).show();
        rootView = (ViewGroup)inflater.inflate(R.layout.fragment_homemng, container, false);

        goHomeFromHomeMngButton = (Button)rootView.findViewById(R.id.goHomeFromHomeMngButton);
        goHomeFromHomeMngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity)getActivity();
                activity.onFragmentChanged(FragmentType.MainFragment);
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
