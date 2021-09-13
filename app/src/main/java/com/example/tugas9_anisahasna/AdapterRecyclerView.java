package com.example.tugas9_anisahasna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private String[] listObat;
    private Integer[] listJumlah;
    private String[] url;
    private Context context;

    AdapterRecyclerView(Context context1, String[] listObat, Integer[] listJumlah, String[] url) {

        this.listObat = listObat;
        this.listJumlah = listJumlah;
        this.url = url;
        context = context1;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNama;
        TextView textViewJumlah;
        ImageView imageViewFoto;

        ViewHolder(View v) {

            super(v);

            textViewNama = v.findViewById(R.id.nama);
            textViewJumlah = v.findViewById(R.id.jumlah);
            imageViewFoto = v.findViewById(R.id.foto);
        }
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textViewNama.setText(listObat[position]);
        holder.textViewJumlah.setText(listJumlah[position].toString());

        Glide.with(context)
                .load(url[position])
                .placeholder(R.drawable.load_img)
                .into(holder.imageViewFoto);
    }

    @Override
    public int getItemCount() {

        return listObat.length;
    }
}

