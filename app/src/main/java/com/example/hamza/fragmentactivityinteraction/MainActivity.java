package com.example.hamza.fragmentactivityinteraction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.hamza.fragmentactivityinteraction.fragments.Frag_A;

public class MainActivity extends AppCompatActivity implements Frag_A.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnButtonPressed(String message) {
        TextView messageget= (TextView) findViewById(R.id.textmessage);
        messageget.setText(message);
    }
}
