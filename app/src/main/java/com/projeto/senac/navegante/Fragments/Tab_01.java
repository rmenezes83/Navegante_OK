package com.projeto.senac.navegante.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.projeto.senac.navegante.Auxiliar.EmbarcViewHolder;
import com.projeto.senac.navegante.Embarcacao;
import com.projeto.senac.navegante.R;

public class Tab_01 extends Fragment {
    private static final String TAG = "Tab_01";
    private EditText campoBuscar;
    private Button btnBuscar;
    private RecyclerView listaResultado;
    private DatabaseReference reference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        reference = FirebaseDatabase.getInstance().getReference("Embarcacao");
        campoBuscar = view.findViewById(R.id.edit_buscar);
        btnBuscar = view.findViewById(R.id.btn_buscar);
        listaResultado = view.findViewById(R.id.lista_resultado);
        listaResultado.setHasFixedSize(true);
        listaResultado.setLayoutManager(new LinearLayoutManager(getContext()));


        btnBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String searchText = campoBuscar.getText().toString();
                firebaseUserSearch(searchText);
            }
        });

        return view;
    }

    private void firebaseUserSearch(String searchText) {

        Toast.makeText(getContext(), "Iniciar Busca", Toast.LENGTH_LONG).show();
        Query firebaseSearchQuery = reference.orderByChild("DestinoEmbarcacao").startAt(searchText).endAt(searchText + "\uf8ff");

        FirebaseRecyclerAdapter<Embarcacao, EmbarcViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Embarcacao, EmbarcViewHolder>(
                Embarcacao.class,R.layout.layout_lista,EmbarcViewHolder.class,firebaseSearchQuery
        ) {

            protected void populateViewHolder(EmbarcViewHolder viewHolder, Embarcacao model, int position) {
        viewHolder.setDetails(getContext(),(model.getNomeEmbarcacao())
                , "Empresa: "+(model.getNomeEmpresa())
                ,   "Tipo: "    +(model.getTipoEmbarcacao())
                ,"Horarios: "+(model.getHorarios())
                ,"Duração: " +(model.getDuracaoViagem())
                ,   "Porto: "   +(model.getNomePorto())
                , "Endereço: "+(model.getEnderecoPorto())
                , model.getImagem()
                , position);
    }
};

        listaResultado.setAdapter(firebaseRecyclerAdapter);
    }

}
