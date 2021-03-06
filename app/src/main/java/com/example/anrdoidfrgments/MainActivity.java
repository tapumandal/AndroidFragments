package com.example.anrdoidfrgments;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadFirstFragment(View view) {
        editText = (EditText) findViewById(R.id.et_main_activity);

        Intent intent = new Intent();
        intent.putExtra("main_et_value", editText.getText().toString());
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new FragmentFirst()).addToBackStack(null).commit();


    }

    public void loadSecondFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new FragmentSecond()).commit();
    }



}
