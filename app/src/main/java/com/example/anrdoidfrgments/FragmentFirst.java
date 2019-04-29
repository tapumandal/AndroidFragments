package com.example.anrdoidfrgments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentFirst extends Fragment {


    private View view;
    private Intent intent;
    private String text;

    public FragmentFirst() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_fragment_first, container, false);


        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onViewCreated(@NonNull final View view1, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tv = view.findViewById(R.id.tv_frag_first);
        tv.setText(getActivity().getIntent().getStringExtra("main_et_value"));

        view.findViewById(R.id.btn_frag_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = view.findViewById(R.id.et_frag_first);

                /*
                   Passing data from fragment to fragment using Bundle
                 */
                FragmentSecond fragmentSecond = new FragmentSecond();
                Bundle bundle = new Bundle();
                bundle.putString("value", editText.getText().toString());
                fragmentSecond.setArguments(bundle);


                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragmentSecond).addToBackStack(null).commit();
            }
        });

    }

//    public void goToSecondFragment(View view2){
//        EditText editText = view2.findViewById(R.id.et_frag_first);
//        intent.putExtra("frag_first_value", editText.getText().toString());
//
//        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, new FragmentSecond()).addToBackStack(null).commit();
//    }
}
