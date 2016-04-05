package com.example.adn.matematicasapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;
/**
 * Created by Adán on 02/04/2016.
 */
public class fragmentoTab extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static fragmentoTab newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        fragmentoTab fragment = new fragmentoTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.principal, container, false);
        TextView textView = (TextView) view;
        textView.setText("Fragment #" + mPage);
        return view;
    }


}



