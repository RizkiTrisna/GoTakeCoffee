package com.example.gotakecoffee_2;

import java.util.ArrayList;

public class DataCafe {
    public static ArrayList<Cafe> getListData(){
        ArrayList<Cafe> listcafe = new ArrayList<>();
        listcafe.add(new Cafe("Cafe A", "Lokasi A", 4, 4, 14, "09.00", "23.59",R.drawable.coffee));
        listcafe.add(new Cafe("Cafe B", "Lokasi B", 3, 5, 12, "10.00", "23.59",R.drawable.coffee));
        listcafe.add(new Cafe("Cafe C", "Lokasi C", 5, 14, 17, "07.00", "23.59",R.drawable.coffee));
        listcafe.add(new Cafe("Cafe D", "Lokasi D", 3, 6, 18, "13.00", "23.59",R.drawable.coffee));
        listcafe.add(new Cafe("Cafe E", "Lokasi E", 1, 2, 25, "16.00", "23.59",R.drawable.coffee));
        listcafe.add(new Cafe("Cafe F", "Lokasi F", 4, 5, 24, "15.00", "23.59",R.drawable.coffee));
        return listcafe;
    }

}
