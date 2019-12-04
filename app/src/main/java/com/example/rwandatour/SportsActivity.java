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

public class SportsActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Basketball","6 min to Stadium","500m",R.drawable.basket));
        places.add(new Place("Car Free Day","2h around Kigali","4km",R.drawable.carfree));
        places.add(new Place("Fitness","6 min to Stadium","500m",R.drawable.gym));
        places.add(new Place("Football","6 min to Stadium","500m",R.drawable.football));
        places.add(new Place("Kigali Arena ","6 min to Stadium","500m",R.drawable.arena));
        places.add(new Place("Cricket","27min from kigali","11.3km",R.drawable.cricket));
        places.add(new Place("Volleyball","6 min to Stadium","500m",R.drawable.volley));
        places.add(new Place("siting volleyball","6min to Stadium","9km",R.drawable.sitting));
        places.add(new Place("Beach Volleyball","3h 4min From Kigali","134km",R.drawable.beachvol));
        places.add(new Place("rugby","6min to stadium","500m",R.drawable.rugby));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(SportsActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(SportsActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(SportsActivity.this,StadeActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(SportsActivity.this,IbereActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(SportsActivity.this,BisokeActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(SportsActivity.this,ConvetionActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(SportsActivity.this,KimironkoActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(SportsActivity.this,NyungweActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(SportsActivity.this,KivuActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(SportsActivity.this,UrukariActivity.class);
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
