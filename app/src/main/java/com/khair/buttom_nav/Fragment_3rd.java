package com.khair.buttom_nav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment_3rd extends Fragment {

    TextView textView,list_item2,list_item3,list_item4;
    Button myButton;
    EditText edInput1,edInput2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView2=inflater.inflate(R.layout.fragment_3rd, container, false);

        if (container!=null){
            container.removeAllViews();
        }

        textView=myView2.findViewById(R.id.list_item);
        edInput1=myView2.findViewById(R.id.edInput1);
        myButton=myView2.findViewById(R.id.myButton);
        list_item2=myView2.findViewById(R.id.list_item2);
        list_item3=myView2.findViewById(R.id.list_item3);
        list_item4=myView2.findViewById(R.id.list_item4);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string=edInput1.getText().toString();


                if (string.length()>0){
                    int int1=Integer.parseInt(string);

                    textView.setText("");
                    list_item4.setText("");

                    int sum = 0;
                    long number = 9;

                    for (int i =1; i <=int1; i++) {

                        number = number * 10 + 9;


                        sum=sum+i;
                        list_item3.append(""+sum);

                    }


                    list_item4.append(""+number);



                }else {
                    edInput1.setError("palsess enter your namber");
                    edInput2.setError("palsess enter your namber");
                }







            }


        });





        return myView2;
    }
}