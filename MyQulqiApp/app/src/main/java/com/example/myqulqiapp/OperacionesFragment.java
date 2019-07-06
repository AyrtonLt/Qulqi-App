package com.example.myqulqiapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.FragmentManager;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OperacionesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OperacionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OperacionesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_operaciones, container, false);


        Button btn = (Button) view.findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), RealizarTransferenciaActivity.class);
                startActivity(in);

            }
        });

        Button btn2 = (Button) view.findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), SolicitarPrestamoActivity.class);
                startActivity(in);

            }
        });

        Button btn3 = (Button) view.findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), CancelarCuentasActivity.class);
                in.putExtra("some","some data");
                startActivity(in);

            }
        });

        return view;
    }



}
