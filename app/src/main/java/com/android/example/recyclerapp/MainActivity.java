package com.android.example.recyclerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Planet> planets;
    private PlanetAdapter planetAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        planetAdapter = new PlanetAdapter(planets, this);
        recyclerView.setAdapter(planetAdapter);
    }

    private void initializeData()
    {
        planets = new ArrayList<>();
        planets.add(new Planet("Mercury", "0.47 AU", R.drawable.mercury));
        planets.add(new Planet("Venus", "0.73 AU", R.drawable.venus));
        planets.add(new Planet("Earth", "1 AU", R.drawable.earth));
        planets.add(new Planet("Mars", "1.66 AU", R.drawable.mars));
        planets.add(new Planet("Jupiter", "5.46 AU", R.drawable.jupiter));
        planets.add(new Planet("Saturn", "10.12 AU", R.drawable.saturn));
        planets.add(new Planet("Uranus", "20.11 AU", R.drawable.uranus));
        planets.add(new Planet("Neptune", "30.33 AU", R.drawable.neptune));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.add:
                planets.add(getRandomPlanet());
                planetAdapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private Planet getRandomPlanet(){
        int num = (int) (Math.random() * 8);

        if (num == 0)
            return new Planet("Mercury", "0.47 AU", R.drawable.mercury);
        else if (num == 1)
            return new Planet("Venus", "0.73 AU", R.drawable.venus);
        else if (num == 2)
            return new Planet("Earth", "1 AU", R.drawable.earth);
        else if (num == 3)
            return new Planet("Mars", "1.66 AU", R.drawable.mars);
        else if (num == 4)
            return new Planet("Jupiter", "5.46 AU", R.drawable.jupiter);
        else if (num == 5)
            return new Planet("Saturn", "10.12 AU", R.drawable.saturn);
        else if (num == 6)
            return new Planet("Uranus", "20.11 AU", R.drawable.uranus);
        else
            return new Planet("Neptune", "30.33 AU", R.drawable.neptune);
    }
}
