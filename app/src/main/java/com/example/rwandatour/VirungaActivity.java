package com.example.rwandatour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class VirungaActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView location;
    ScrollView scrollView;
    TextView linkText;
    TextView phoneCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virunga);

        toolbar = (Toolbar) findViewById(R.id.virunga_id);
        scrollView=(ScrollView) findViewById(R.id.my_scroll);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        location = (TextView) findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VirungaActivity.this,VolcanoActivity.class);
                startActivity(intent);
            }
        });
        scrollView.post(new Runnable() {
            public void run() {
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
        linkText=(TextView) findViewById(R.id.link);
        phoneCall=(TextView) findViewById(R.id.phone);
        linkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.virunga.org/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        phoneCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "+250785814594";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
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
