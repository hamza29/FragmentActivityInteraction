package com.example.hamza.fragmentactivityinteraction.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.hamza.fragmentactivityinteraction.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Frag_A.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Frag_A extends Fragment {

    private OnFragmentInteractionListener mListener;

    public Frag_A() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_frag_, container, false);


        final EditText message=(EditText) rootView.findViewById(R.id.etInputMessage);
        Button btnPress = (Button) rootView.findViewById(R.id.btnPress);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mListener.OnButtonPressed(message.getText().toString());

            }
        });


        return rootView;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void OnButtonPressed(String message);
    }
}
