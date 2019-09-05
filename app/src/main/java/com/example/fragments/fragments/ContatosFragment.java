package com.example.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends Fragment {

    private TextView tvContato;


    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);

        /*
        Observe que acima foi criada uma view que recebe o inflater que veio com a classe.
        É por esta view que é possível manipular os objetos views do xml, como exemplificado abaixo:
         */

        tvContato = view.findViewById(R.id.tvContatos);
        tvContato.setText("Contatos alterados");

        return view;
    }

}
