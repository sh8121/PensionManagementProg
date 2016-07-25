package com.example.sboo.pensionmanagementtool;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by sboo on 2016-07-25.
 */
public class HomeMngFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "HomeMngFragment onCreate 호출", Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "HomeMngFragment onCreateView 호출", Toast.LENGTH_LONG).show();
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_homemng, container, true);
        return rootView;
    }
}
