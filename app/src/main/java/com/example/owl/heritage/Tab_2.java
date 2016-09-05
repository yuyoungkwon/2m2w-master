package com.example.owl.heritage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by owl on 2016-08-25.
 */
public class Tab_2 extends Fragment {

    private Context mContext;

    public Tab_2(Context mContext) {
        // Required empty public constructor
        this.mContext = mContext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab_2, container, false);
    }

}