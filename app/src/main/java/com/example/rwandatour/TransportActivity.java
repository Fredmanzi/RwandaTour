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

public class TransportActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        ArrayList<Place> places  = new ArrayList<Place>();
        places.add(new Place("Dial Car Rwanda","9 God is Able House, KN 5 Rd","1.5km",R.drawable.dialcar));
        places.add(new Place("self drive Rwanda","Kigali","100m",R.drawable.selfdrive));
        places.add(new Place("Car Hire Rwanda","Airport Road, KN 5 Rd, Kigali","200m",R.drawable.carhire));
        places.add(new Place("Kigali Car Rental","KN 5 Rd, Jesus Is Able House","500m",R.drawable.kigalicar));
        places.add(new Place("Crystal Car Rental ltd","KN 5 Rd, Kigali","500m",R.drawable.crystalcar));
        places.add(new Place("Rwanda Car Rental","KN 5 Rd, Kigali","11.3km",R.drawable.rwandacarr));
        places.add(new Place("Crystal Car Hire","KN 5 Rd, Kigali","500m",R.drawable.dialcar));
        places.add(new Place("Go self Drive Rwanda","KN5 RD","9km",R.drawable.rwandacarr));
        places.add(new Place("Car Self Drive","KG 107 St","134km",R.drawable.selfdrive));
        places.add(new Place("Rent Car Rwanda Ltd","kN5 Airport Road ","500m",R.drawable.kigalicar));
        PlaceAdapter  adapter = new PlaceAdapter(this,places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(TransportActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(TransportActivity.this,AkageraActivity.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(TransportActivity.this,StadeActivity.class);
                    startActivity(intent);
                }
                if(position ==3){
                    Intent intent = new Intent(TransportActivity.this,IbereActivity.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(TransportActivity.this,BisokeActivity.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(TransportActivity.this,ConvetionActivity.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(TransportActivity.this,KimironkoActivity.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(TransportActivity.this,NyungweActivity.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(TransportActivity.this,KivuActivity.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(TransportActivity.this,UrukariActivity.class);
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
