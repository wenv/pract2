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
public class rest1 extends Fragment {


    public rest1() {
        // Required empty public constructor
    }
    Button rsuno;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_rest1, container, false);
        rsuno = (Button)view.findViewById(R.id.restar);
        rsuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText va=(EditText)view.findViewById(R.id.ar);
                EditText vb = (EditText)view.findViewById(R.id.br);
                Double A= Double.parseDouble(va.getText().toString());
                Double B=Double.parseDouble(vb.getText().toString());
                Double resp = 0.0;
                operaciones ope = new operaciones();
                resp =ope.restar(A,B);

                TextView res = view.findViewById(R.id.rr);
                res.setText(""+resp);

            }
        });
        return view;
    }

}
