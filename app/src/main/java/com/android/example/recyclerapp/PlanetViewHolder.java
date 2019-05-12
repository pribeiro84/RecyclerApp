package com.android.example.recyclerapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PlanetViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView planetName;
    public TextView planetInfo;
    public ImageView planetPhoto;

    public PlanetViewHolder(View itemView, final Context context){
        super(itemView);
        cardView = (CardView)itemView.findViewById(R.id.card_view);
        planetName = (TextView)itemView.findViewById(R.id.planet_name);
        planetInfo = (TextView) itemView.findViewById(R.id.planet_distance);
        planetPhoto = (ImageView)itemView.findViewById(R.id.planet_photo);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v) {
                Toast.makeText(context, planetName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
