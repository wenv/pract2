package com.example.asus.minavigat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus.minavigat.operaciones.operaciones;


/**
 * A simple {@link Fragment} subclass.
 */
public class sumar1 extends Fragment {


    public sumar1() {
        // Required empty public constructor
    }


    Button suno;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_sumar1, container, false);
        suno = (Button)view.findViewById(R.id.resuno);
        suno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText va=(EditText)view.findViewById(R.id.auno);
                EditText vb = (EditText)view.findViewById(R.id.buno);
                Double A= Double.parseDouble(va.getText().toString());
                Double B=Double.parseDouble(vb.getText().toString());
                Double resp = 0.0;
                operaciones ope = new operaciones();
                resp =ope.sumar(A,B);

                TextView res = view.findViewById(R.id.sruno);
                res.setText(""+resp);

            }
        });
        return view;

    }

}
