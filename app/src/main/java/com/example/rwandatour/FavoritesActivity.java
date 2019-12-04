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

public class FavoritesActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Akagera national park","2h 34min From Kigali","111km",R.drawable.virung));
        places.add(new Place("Cricket Stadium","24min From Kigali","11km",R.drawable.cricket));
        places.add(new Place("hot springs in Gisenyi","3h 28min From Kigali","164km",R.drawable.hotsprings));
        places.add(new Place("Ibere rya Bigogwe","2h 57min From Kigali","139km",R.drawable.ibere));
        places.add(new Place("Bisoke Mountain Peak","2h 49min From Kigali","123km",R.drawable.bisoke));
        places.add(new Place("Kigali convention Center","8min From City","3km",R.drawable.convention));
        places.add(new Place("Kimironko Market","7min From City","1.9km",R.drawable.kimironko));
        places.add(new Place("Nyungwe Forest","4h 34min From Kigali","219km",R.drawable.nyungwe));
        places.add(new Place("Lake Kivu","3h 4min From Kigali","134km",R.drawable.kivu));
        places.add(new Place("Urukari national Museum","2h 22min From Kigali","99km",R.drawable.urukari));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(FavoritesActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(FavoritesActivity.this,CricketActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(FavoritesActivity.this,HotspringActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(FavoritesActivity.this,IbereActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(FavoritesActivity.this,BisokeActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(FavoritesActivity.this,ConvetionActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(FavoritesActivity.this,KimironkoActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(FavoritesActivity.this,NyungweActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(FavoritesActivity.this,KivuActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(FavoritesActivity.this,UrukariActivity.class);
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
