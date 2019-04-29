package com.example.anrdoidfrgments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class FragmentSecond extends Fragment {

    private String fTest;


    public FragmentSecond() {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        String text = getActivity().getIntent().getSerializableExtra("frag_first_value").toString();
        TextView textView = view.findViewById(R.id.tv_frag_second);


        // Retrieving bundle data
        if (getArguments()!=null)
        fTest = getArguments().getString("value");

        textView.setText(fTest);
    }


}
