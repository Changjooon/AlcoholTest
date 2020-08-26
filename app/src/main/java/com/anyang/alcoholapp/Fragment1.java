package com.anyang.alcoholapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.anyang.alcoholapp.R;


public class Fragment1 extends Fragment {

    EditText editText1;
    EditText editText3;
    EditText editText5;
    EditText editText6;

    OnDatabaseCallback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        callback = (OnDatabaseCallback) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        editText1 = (EditText) rootView.findViewById(R.id.editText1);
        editText3 = (EditText) rootView.findViewById(R.id.editText3);
        editText5 = (EditText) rootView.findViewById(R.id.editText5);
        editText6 = (EditText) rootView.findViewById(R.id.editText6);

        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = editText1.getText().toString();
                String soju = editText3.getText().toString();
                String beer = editText5.getText().toString();
                String symptom = editText6.getText().toString();

                callback.insert(date, soju, beer, symptom);
                Toast.makeText(getContext(), "음주 정보를 추가했습니다.", Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }
}
