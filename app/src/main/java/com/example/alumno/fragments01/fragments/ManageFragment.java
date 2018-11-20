package com.example.alumno.fragments01.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumno.fragments01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {

    private TextView txtManage;
    private Button btnManage;
    private ImageView ivImagen;
    private Context context;

    public ManageFragment() {
        // Required empty public constructor
        context = getActivity();
    }

    // Si necesito el Contexto me creo un constructor que tenga el contexto



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);
        // TODO el codigo necesario para que el fragment funciones
        txtManage = rootView.findViewById(R.id.txtManage);
        btnManage = rootView.findViewById(R.id.btnManage);
        ivImagen = rootView.findViewById(R.id.ivImagen);

        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "HOLA MUNDO", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
