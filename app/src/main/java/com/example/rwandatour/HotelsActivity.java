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

public class HotelsActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("  2000 Hotel","16min From city","8km",R.drawable.twothousand));
        places.add(new Place("chezlando lando hotel","7min From city","800m",R.drawable.chezlando));
        places.add(new Place("Karisimbi Hotel","15min From city","9km",R.drawable.karis));
        places.add(new Place("Kivu Serena Hotel","3h 24min From kigali","161km",R.drawable.kivuserena));
        places.add(new Place("Kigali marriot Hotel","20min From city","9.3km",R.drawable.hotelmario));
        places.add(new Place("Onomo Hotel","15min From City","7km",R.drawable.onomo));
        places.add(new Place("Serena hotel kigali","22min From City","9km",R.drawable.serenakigal));
        places.add(new Place("Ubumwe Grand hotel","19min From city","3km",R.drawable.ubumwe));
        places.add(new Place("Umubano Hotel","8min From city","14km",R.drawable.umubano));
        places.add(new Place("Virunga Hotel ","2h 15min From Kigali","110km",R.drawable.virunga));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(HotelsActivity.this,TwothousandActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(HotelsActivity.this,ChezlandoActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(HotelsActivity.this,KarisimbActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(HotelsActivity.this,SerenaActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(HotelsActivity.this,MarriothotelActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(HotelsActivity.this,OnomoActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(HotelsActivity.this,SerenaKigaliActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(HotelsActivity.this,UbumweActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(HotelsActivity.this,UmubanoActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(HotelsActivity.this,VirungahotActivity.class);
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
