package com.example.rwandatour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Brachetto Kigali","8 min From city","4km",R.drawable.brancheto));
        places.add(new Place("Jumia food kigali","10min From city","800m",R.drawable.jumia));
        places.add(new Place("Marriot bar kigali","18min From city","9km",R.drawable.marriot));
        places.add(new Place("Meze fresh Kigali","7min From city","3.9km",R.drawable.mezefresh));
        places.add(new Place("Poivre Noire Kigali ","10min From city","4km",R.drawable.povoivre));
        places.add(new Place("simba super market","5min From City","3km",R.drawable.simba));
        places.add(new Place("sole luna kigali","5min From City","3km",R.drawable.sole));
        places.add(new Place("Trophy bar Kigali","4min From Kigali","9km",R.drawable.trophy));
        places.add(new Place("Vibe bar Kigali","13h From Kigali","14km",R.drawable.vibe));
        places.add(new Place("Bourbon coffee","15min From Kigali","9km",R.drawable.bourbon));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(FoodActivity.this,BrachetoActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(FoodActivity.this,JumiaActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(FoodActivity.this,MarriotActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(FoodActivity.this,MezefreshActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(FoodActivity.this,PoivreActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(FoodActivity.this,SimbaActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(FoodActivity.this,SoleActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(FoodActivity.this,TrophyActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(FoodActivity.this,VibeActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(FoodActivity.this,BourbonActivity.class);
                    startActivity(intent);
                }
            }
        });
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.testimonials:
                Toast.makeText(this, "testimonials", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_tourism:
                Toast.makeText(this,"about tourism",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search_id:
                Toast.makeText(this,"searched",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

}

