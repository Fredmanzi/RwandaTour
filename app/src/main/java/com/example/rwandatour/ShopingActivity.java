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

public class ShopingActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping);
        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Rwanda Clothing Store","KN 2 Ave, Kigali","1.5km",R.drawable.rwandaclothing));
        places.add(new Place("Kigali Heights","KG 7 Ave, Kigali","100m",R.drawable.kigaliheight));
        places.add(new Place("Caplaki Craft Village","KK 2 Ave, Kigali","200m",R.drawable.caplaki));
        places.add(new Place("Haute Baso","39, KG 9 Ave, Kigali","500m",R.drawable.haute));
        places.add(new Place("M-Peace Plaza","KN 4 Ave, Kigali","500m",R.drawable.mpeace));
        places.add(new Place("Azizi Life Boutique"," 7 KN 29 St, Kigali","11.3km",R.drawable.azizishop));
        places.add(new Place("Kigali Business Centre, KBC","Kamukina, Kigali","500m",R.drawable.kbc));
        places.add(new Place("Remera Corner","Kigali","9km",R.drawable.remera));
        places.add(new Place("Kigali Down Town","KN 2 Ave, Kigali","134km",R.drawable.downtown));
        places.add(new Place("Fashion Shop","KN 2 St, Kigali","500m",R.drawable.fashionshop));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(ShopingActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(ShopingActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(ShopingActivity.this,StadeActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(ShopingActivity.this,IbereActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(ShopingActivity.this,BisokeActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(ShopingActivity.this,ConvetionActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(ShopingActivity.this,KimironkoActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(ShopingActivity.this,NyungweActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(ShopingActivity.this,KivuActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(ShopingActivity.this,UrukariActivity.class);
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
