package com.example.uks.viewpagertestapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentForPager extends Fragment {
    private TextView textView;

    public FragmentForPager() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_for_pager, container, false);
        textView = view.findViewById(R.id.txt_display);
        String message = null;
        if (getArguments() != null) {
            message = getArguments().getString("message");
        }
        textView.setText(message);
        return view;
    }

}
