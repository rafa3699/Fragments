package com.example.alumno.fragments01.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumno.fragments01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {

    private TextView txtOperacion;
    private Button btnCalcular;

    public CameraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);
        // TODO el codigo necesario para que el fragment funciones
        btnCalcular = rootView.findViewById(R.id.btnCalcular);
        txtOperacion = rootView.findViewById(R.id.txtOperacion);



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valor = txtOperacion.getText().toString();
                String [] numeros = valor.split(" ");
                int resultado = 0;

                String numero1 = numeros[0];
                String op = numeros[1];
                String numero2 = numeros[3];

                int num1 = Integer.getInteger(numero1);
                int num2 = Integer.getInteger(numero2);




                switch (op){
                    case "+":
                        resultado = num1 + num2;
                        txtOperacion.setText(resultado);
                        break;
                    case "-":
                        resultado = num1 - num2;
                        txtOperacion.setText(resultado);
                        break;
                    case "/":
                        resultado = num1 / num2;
                        txtOperacion.setText(resultado);
                        break;
                    case "*":
                        resultado = num1 * num2;
                        txtOperacion.setText(resultado);
                        break;
                        default:
                }

            }
        });

        return rootView;
    }



}
