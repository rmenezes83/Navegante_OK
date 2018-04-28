package com.projeto.senac.navegante.Auxiliar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.projeto.senac.navegante.R;

public class EmbarcViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    View view;

    public EmbarcViewHolder(View itemView) {
        super(itemView);
        view = itemView;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }

    public void setDetails(Context ctx, String embarcNome, String embarcEmpresa, String embarcTipo, String horariosViagem, String duracaoViagem, String nomePorto, String enderecoPorto, String embarcImagem, int position){

        TextView embarc_nome    = view.findViewById(R.id.embarc_text);
        TextView embarc_empresa = view.findViewById(R.id.empresa_text);
        TextView horarios       = view.findViewById(R.id.horario_text);
        TextView porto_nome     = view.findViewById(R.id.porto_text);
        ImageView embarc_imagem = view.findViewById(R.id.imagem);

        embarc_nome.setText(embarcNome);
        embarc_empresa.setText(embarcEmpresa);
        horarios.setText(horariosViagem);
        porto_nome.setText(nomePorto);
        Glide.with(ctx).load(embarcImagem).into(embarc_imagem);
    }
}
