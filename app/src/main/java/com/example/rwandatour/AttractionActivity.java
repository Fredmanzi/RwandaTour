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

public class AttractionActivity extends AppCompatActivity {
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);
        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Akagera National Park","2h 34min From Kigali","111km",R.drawable.virung));
        places.add(new Place("Bird Watching around kigali","10min From city","800m",R.drawable.birds));
        places.add(new Place("nyungwe Chimpanze Trekking ","4h From kigali city","219km",R.drawable.chimpanze));
        places.add(new Place("Genocide Memorial Center","13min From city","8km",R.drawable.genocide));
        places.add(new Place("Gishwati forest ","10min From city","4km",R.drawable.gishwati));
        places.add(new Place("Gorilla Trekking","2h 45min From City","113km",R.drawable.gorilla));
        places.add(new Place("Kigali Convention Center","8min From City","3km",R.drawable.convention));
        places.add(new Place("Lake Kivu","3h 4min From Kigali","134km",R.drawable.kivu));
        places.add(new Place("Nyungwe Forest","13h From Kigali","14km",R.drawable.nyungwe));
        places.add(new Place("King's Palace Museum","15min From Kigali","9km",R.drawable.urukari));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(AttractionActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(AttractionActivity.this,BirdActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(AttractionActivity.this,ChimpanzeActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(AttractionActivity.this,GenocideActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(AttractionActivity.this,GishwatiActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(AttractionActivity.this,GorillaActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(AttractionActivity.this,ConvetionActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(AttractionActivity.this,KivuActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(AttractionActivity.this,NyungweActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(AttractionActivity.this,UrukariActivity.class);
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
        switch (id) {
            case R.id.testimonials:
                Toast.makeText(this, "testimonials", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_tourism:
                Toast.makeText(this, "about tourism", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search_id:
                Toast.makeText(this, "searched", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
