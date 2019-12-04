package com.example.rwandatour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Volcano national park","2h 33min From Kigali","114km",R.drawable.virung));
        places.add(new Place("Akagera national park","2h 34min From Kigali","111km",R.drawable.kagera));
        places.add(new Place("Amahoro stadium","6min From City","500m",R.drawable.stadium));
        places.add(new Place("Congo nile Trail","3h 3min From Kigali","133km",R.drawable.congo));
        places.add(new Place("Bisoke Mountain Peak","2h 49min From Kigali","123km",R.drawable.bisoke));
        places.add(new Place("Kigali convention Center","8min From City","3km",R.drawable.convention));
        places.add(new Place("Kimironko Market","7min From City","1.9km",R.drawable.kimironko));
        places.add(new Place("Nyungwe Forest","4h 34min From Kigali","219km",R.drawable.nyungwe));
        places.add(new Place("Lake Kivu","3h 4min From Kigali","134km",R.drawable.kivu));
        places.add(new Place("Urukari national Museum","2h 22min From Kigali","99km",R.drawable.urukari));
        places.add(new Place("Ibere rya Bigogwe","2h 57min From Kigali","139km",R.drawable.ibere));
     PlaceAdapter  adapter = new PlaceAdapter(this,places);
     ListView listView = (ListView) findViewById(R.id.list);
     listView.setAdapter(adapter);
     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
             if(position ==0){
                 Intent intent = new Intent(MainActivity.this,VirungaActivity.class);
                 startActivity(intent);
             }
             if (position ==1){
                 Intent intent = new Intent(MainActivity.this,AkageraActivity.class);
                 startActivity(intent);
             }
             if (position ==2){
                 Intent intent = new Intent(MainActivity.this,StadeActivity.class);
                 startActivity(intent);
             }
             if(position ==3){
                 Intent intent = new Intent(MainActivity.this,CongoActivity.class);
                 startActivity(intent);
             }
             if(position == 4){
                 Intent intent = new Intent(MainActivity.this,BisokeActivity.class);
                 startActivity(intent);
             }
             if (position == 5){
                 Intent intent = new Intent(MainActivity.this,ConvetionActivity.class);
                 startActivity(intent);
             }
             if (position == 6){
                 Intent intent = new Intent(MainActivity.this,KimironkoActivity.class);
                 startActivity(intent);
             }
             if (position == 7){
                 Intent intent = new Intent(MainActivity.this,NyungweActivity.class);
                 startActivity(intent);
             }
             if (position == 8){
                 Intent intent = new Intent(MainActivity.this,KivuActivity.class);
                 startActivity(intent);
             }
             if (position == 9){
                 Intent intent = new Intent(MainActivity.this,UrukariActivity.class);
                 startActivity(intent);
             }
             if (position == 10){
                 Intent intent = new Intent(MainActivity.this,IbereActivity.class);
                 startActivity(intent);
             }
         }
     });

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
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
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id =menuItem.getItemId();
        switch (id){
            case R.id.favorites:
               Intent intent = new Intent(MainActivity.this,FavoritesActivity.class);
               startActivity(intent);
                break;
            case R.id.food:
                Intent foodintent = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(foodintent);
                break;
            case R.id.hotels:
                Intent hotelintent = new Intent(MainActivity.this,HotelsActivity.class);
                startActivity(hotelintent);
                break;
            case R.id.attraction:
                Intent attractionintent = new Intent(MainActivity.this,AttractionActivity.class);
                startActivity(attractionintent);
                break;
            case R.id.sports:
                Intent sportsintent = new Intent(MainActivity.this,SportsActivity.class);
                startActivity(sportsintent);
                break;
            case R.id.transport:
                Intent transportintent = new Intent(MainActivity.this,TransportActivity.class);
                startActivity(transportintent);
                break;
            case R.id.shopping:
                Intent shopintent = new Intent(MainActivity.this,ShopingActivity.class);
                startActivity(shopintent);
                break;
            case R.id.instagram:
                Toast.makeText(this,"cliked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.facebook:
                Toast.makeText(this,"cliked",Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }

}
