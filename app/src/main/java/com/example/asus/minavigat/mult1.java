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
public class mult1 extends Fragment {


    public mult1() {
        // Required empty public constructor
    }


    Button por;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_mult1, container, false);
        por= (Button)view.findViewById(R.id.mult);
        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText va=(EditText)view.findViewById(R.id.am);
                EditText vb = (EditText)view.findViewById(R.id.bm);
                Double A= Double.parseDouble(va.getText().toString());
                Double B=Double.parseDouble(vb.getText().toString());
                Double resp = 0.0;
                operaciones ope = new operaciones();
                resp =ope.multiplicar(A,B);

                TextView res = view.findViewById(R.id.rm);
                res.setText(""+resp);

            }
        });
        return view;
    }

}
