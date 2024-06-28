package com.khair.buttom_nav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fast_Fragment extends Fragment {
    EditText termInput;
    Button generateButton;
    TextView seriesOutput,seriesOutput1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View myView=inflater.inflate(R.layout.fragment_fast_, container, false);

        if (container!=null){
            container.removeAllViews();
        }
        termInput = myView.findViewById(R.id.termInput);
        generateButton =myView.findViewById(R.id.generateButton);
        seriesOutput = myView.findViewById(R.id.seriesOutput);
        seriesOutput1 = myView.findViewById(R.id.seriesOutput1);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateSeries();
            }

        });


        return myView;

    }

    private void generateSeries() {
        String input = termInput.getText().toString();
        if (!input.isEmpty() ){
            long numOfTerms = Long.parseLong(input);
            StringBuilder series = new StringBuilder();
            int sum = 0;
            for (int i = 1; i <= numOfTerms; i++) {
                long term = Integer.parseInt(repeatDigit(i, 9));
                sum += term*term;
                series.append(term);
                if (i < numOfTerms)
                    series.append(" + ");
            }
            seriesOutput1.setText(" = "+sum);
            seriesOutput.setText(series.toString());
        }
    }

    private String repeatDigit(int times, int digit) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(digit);
        }
        return result.toString();
    }


}