package com.android.example.recyclerapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetViewHolder> {
    private List<Planet> planets;
    private Context context;

    public PlanetAdapter(List<Planet> planets, Context context)
    {
        this.planets = planets;
        this.context = context;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_planet, parent, false);
        return new PlanetViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position)
    {
        Planet planet = planets.get(position);
        holder.planetName.setText(planet.name);
        holder.planetInfo.setText(planet.info);
        holder.planetPhoto.setImageResource(planet.photoId);
    }

    @Override
    public int getItemCount() {return planets.size();}
}
