package com.akaraol.bottomnavtestchess.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.akaraol.bottomnavtestchess.Models.ChessCommandLogModel;
import com.akaraol.bottomnavtestchess.R;

import java.util.ArrayList;
import java.util.List;


public class ChessLogAdapter extends RecyclerView.Adapter<ChessLogAdapter.CardViewHolder> {
    //Chess commandleri yani RV de göstereceğimiz verileri arraylist haline getirdik
    List <ChessCommandLogModel> ChessCommandsLog = new ArrayList<>();
    //Activitylerimizi context haline getirdik (Acticitydeki fonksiyonları kullanmak için)
    Fragment fragment;

    //Constractor araştır.
    //ChessCommandsLogtan bize veriler gelecek ve bunlar model listesidir. Ayrıca bize context sınıfından veri gelicek
    public ChessLogAdapter (List<ChessCommandLogModel> ChessCommandsLog, Fragment fragment ) {

        this.ChessCommandsLog = ChessCommandsLog;
        this.fragment = fragment;
    }

    //https://assets.alexandria.raywenderlich.com/books/aa/images/dba1d2447c1511bd7cf0bf86ef9acfea87a334b3bd5edbe4340cec2df8341b7d/original.png
    /* Kavramlar
    * Adapter: RV'yi oluşturacağın Viewa bağlar. Veri ile view arasında bağlantıyı kurar.
    * Cart Holder:
    *
    *  */

    public class CardViewHolder extends RecyclerView.ViewHolder{

        private TextView chessChatTV;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            // CardViewHolderın altındaki cCTV TVsine ulaştık.
            chessChatTV = itemView.findViewById(R.id.chessChatTV);

        }
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext() ).inflate(R.layout.rv_logcard , parent ,false);
        return new ChessLogAdapter.CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        //commandLogu tanımladık
        final ChessCommandLogModel commandLog = ChessCommandsLog.get(position);

        //Layouta cCTV TV sinden gelecek veriyi indexe göre yerleştirdik.
        holder.chessChatTV.setText(commandLog.getMove());

        if (commandLog.getTurn() == 1){
            holder.chessChatTV.setTextColor(Color.WHITE);
            holder.chessChatTV.setGravity(Gravity.RIGHT);
        }else if (commandLog.getTurn() == 2){
            holder.chessChatTV.setTextColor(Color.BLACK);
            holder.chessChatTV.setGravity(Gravity.LEFT);

        }






    }

    @Override
    public int getItemCount() {
        //yazılan CommanLog kadar alan açacak.
        return this.ChessCommandsLog.size();
    }




}
