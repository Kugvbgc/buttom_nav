package com.khair.buttom_nav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment_2and extends Fragment {
    EditText inputNumber;
    TextView resultText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView1=inflater.inflate(R.layout.fragment_2and, container, false);

        if (container!=null){
            container.removeAllViews();
        }

        inputNumber =myView1. findViewById(R.id.input_number);
        resultText = myView1.findViewById(R.id.result_text);

        Button checkButton =myView1. findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPalindrome();
            }
        });




        return myView1;
    }

    private void checkPalindrome() {
        String input = inputNumber.getText().toString();
        if (input.isEmpty()) {
            inputNumber.setError("Please enter a number");
            return;
        }

        int number = Integer.parseInt(input);
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            resultText.setText(number + " is a palindrome number.");
        } else {
            resultText.setText(number + " is not a palindrome number.");
        }
    }

    private boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }


}