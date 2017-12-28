package com.example.hamza.fragmentactivityinteraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.hamza.fragmentactivityinteraction.fragments.Frag_A;

public class ActivityB extends AppCompatActivity implements Frag_A.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    @Override
    public void OnButtonPressed(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
