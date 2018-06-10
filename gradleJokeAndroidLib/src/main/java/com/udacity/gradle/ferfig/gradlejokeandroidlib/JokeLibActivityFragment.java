package com.udacity.gradle.ferfig.gradlejokeandroidlib;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeLibActivityFragment extends Fragment {

    public JokeLibActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke_lib, container, false);

        Intent receivedIntent = getActivity().getIntent();
        if (receivedIntent.hasExtra("JOKE")) {
            TextView tvJoke = rootView.findViewById(R.id.tvJoke);
            tvJoke.setText( receivedIntent.getStringExtra("JOKE") );
        }

        return rootView;
    }
}
