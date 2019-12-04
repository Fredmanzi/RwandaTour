package com.example.rwandatour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MezefreshActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezefresh);
        toolbar = (Toolbar) findViewById(R.id.meze_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.places_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.about_id:
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rate_id:
                Toast.makeText(this,"rate",Toast.LENGTH_SHORT).show();
                break;
            case R.id.share_id:
                Toast.makeText(this,"searched",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
