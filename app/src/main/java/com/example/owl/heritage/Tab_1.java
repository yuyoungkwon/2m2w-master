package com.example.owl.heritage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by owl on 2016-08-25.
 */
public class Tab_1 extends Fragment implements View.OnClickListener{

    private Context mContext;
    View v;
    Button button1;



    public Tab_1(Context mContext) {
        // Required empty public constructor
        this.mContext = mContext;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.tab_1, container, false);

        button1 = (Button) v.findViewById(R.id.map);

        button1.setOnClickListener(this);



        return  v;

    }


    public void onClick(View V){

        Intent myIntent = new Intent(mContext,daum_map.class);

        startActivity(myIntent);
    }

}

