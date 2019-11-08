package com.example.gotakecoffee_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Beranda extends AppCompatActivity {

    private RecyclerView recyclerViewCafe;
    private ArrayList<Cafe> listCafe = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        recyclerViewCafe = findViewById(R.id.rv_beranda);
        recyclerViewCafe.setHasFixedSize(true);

        listCafe.addAll(DataCafe.getListData());
        tampilCardviewBeranda();
    }

    private void tampilCardviewBeranda(){
        recyclerViewCafe.setLayoutManager(new LinearLayoutManager(this));
        AdapterCardviewBeranda adapterCardviewBeranda = new AdapterCardviewBeranda(listCafe);
        recyclerViewCafe = findViewById(R.id.rv_beranda);
        recyclerViewCafe.setAdapter(adapterCardviewBeranda);
        adapterCardviewBeranda.setOnItemCallback(new AdapterCardviewBeranda.OnItemCallback() {
            @Override
            public void onItemClicked(Cafe data) {
                setSelectedCafe(data);
            }
        });
    }

    private void setSelectedCafe(Cafe cafe){
        Toast.makeText(this, "Cafe Terpilih: " + cafe.getNamaCafe(), Toast.LENGTH_SHORT).show();
Intent mIntent = new Intent(this, DetailMenuActivity.class);
startActivity(mIntent);
    }
}
