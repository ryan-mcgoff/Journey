package com.stealbox.journey;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.stealbox.journey.databinding.ActivityMainBinding;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity{


    @Inject
    PreferenceManager preferenceManager;

    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);


//        RecyclerView recyclerView = findViewById(R.id.testView);
//        recyclerView.setHasFixedSize(true);
//
//        ArrayList<TripItem> trips = new ArrayList<>();
//        new TripItem("");
//        trips.add(new TripItem("Italy"));
//        trips.add(new TripItem("France"));
//        trips.add(new TripItem("Germany"));
//        trips.add(new TripItem("Iceland"));
//        trips.add(new TripItem("Russia"));
//
//
//        recyclerView.setAdapter(new TripsListAdaptor(this, trips));
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        binding.fab.setOnClickListener(view ->{
            String eee = preferenceManager.getE();
            String e = eee;
            Snackbar.make(view, "d", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
