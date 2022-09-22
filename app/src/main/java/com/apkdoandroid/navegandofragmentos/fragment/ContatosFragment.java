package com.apkdoandroid.navegandofragmentos.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apkdoandroid.navegandofragmentos.R;


public class ContatosFragment extends Fragment {
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_contatos, container, false);
        TextView textView = view.findViewById(R.id.textViewContatos);
        textView.setText("Exibindo contatos");

        return view;
    }
}