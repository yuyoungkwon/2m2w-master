package com.example.owl.heritage;

        import android.widget.ArrayAdapter;
        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;
        import android.widget.Button;
        import android.widget.Toast;

        import java.util.ArrayList;

/**
 * Created by owl on 2016-08-25.
 */
public class Tab_2 extends Fragment implements View.OnClickListener{

    private Context mContext;
    View v;
    Button query_btn;
    Heritage_find finder;
    AutoCompleteTextView autoText;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;
    String[] heritage_list;

    public Tab_2(Context mContext) {
        this.mContext = mContext;

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.tab_2, container, false);
        finder = new Heritage_find(mContext);

        query_btn = (Button) v.findViewById(R.id.query);
        query_btn.setOnClickListener(this);

        heritage_list = getResources().getStringArray(R.array.dataArray); //xml파일 가져오는 부분
        adapter = new ArrayAdapter<String>(mContext,android.R.layout.simple_dropdown_item_1line, heritage_list);//autoCompleteTextView아래로 보여지는 부분분
        autoText= (AutoCompleteTextView)v.findViewById(R.id.search_heritage);
        autoText.setAdapter(adapter); //adapter로 넘겨줌

        return  v;
    }
    public void onClick(View V){
        boolean s;

        autoText = (AutoCompleteTextView) v.findViewById(R.id.search_heritage);
        String search_name = autoText.getText().toString();
        s=finder.select_name(search_name);  //검색어 찾는 곳으로 넘겨줌


        if(s==true){ //true 리턴되면 Heritage_informaion으로 넘어감
            Intent myIntent = new Intent(mContext,Heritage_information.class);
            myIntent.putExtra("name", search_name);
            startActivity(myIntent);

        }
        else if(s==false){
            Toast.makeText(getActivity(),"결과가 없습니다.",Toast.LENGTH_LONG).show();

        }

    }

}