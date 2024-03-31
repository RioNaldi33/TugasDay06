package com.example.tugasday06;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();


        recyclerView = findViewById(R.id.recyclerview);
        adapter = new Adapter(MainActivity.this, models);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        models = new ArrayList<>();
        models.add(new Model("BUGATTI LA VOITURE NOIRE",R.drawable.mobil1,"Harga: RP. 30.000.000.000,00", "Type: Sport", "Mesin: 1500cc"));
        models.add(new Model("LAMBORGHINI HURACAN",R.drawable.mobil2,"Harga: RP. 10.000.000.000,00", "Type: Sport", "Mesin: 1000cc"));
        models.add(new Model("ROLLS ROYCE SPECTRE",R.drawable.mobil3,"Harga: RP. 15.000.000.000,00", "Type: Sport", "Mesin: 1200cc Car"));
        models.add(new Model("BMW I8",R.drawable.mobil4,"Harga: RP. 8.000.000.000,00", "Type: Sport", "Mesin: 950cc"));
        models.add(new Model("KOENIGSEGG REGERA",R.drawable.mobil5,"Harga: RP. 20.000.000.000,00", "Type: Sport", "Mesin: 2000cc"));
        models.add(new Model("KAWASAKI NINJA H2R",R.drawable.motor1,"Harga: RP. 873.000.000,00", "Type: Sport", "Mesin: 998cc"));
        models.add(new Model("APRILIA RSV4",R.drawable.motor2,"Harga: RP. 823.000.000,00", "Type: Sport", "Mesin: 955cc"));
        models.add(new Model("BMW HP4",R.drawable.motor3,"Harga: RP. 1.300.000.000,00", "Type: Sport", "Mesin: 999cc"));
        models.add(new Model("YAMAHA R1M",R.drawable.motor4 ,"Harga: RP. 812.000.000,00", "Type: Sport", "Mesin: 998cc"));
        models.add(new Model("DUCATI PANIGALE",R.drawable.motor5,"Harga: RP. 799.000.000,00", "Type: Sport", "Mesin: 955cc"));
        models.add(new Model("POLYGON Xtrada 4",R.drawable.sepeda1,"Harga: RP. 5.494.500,00", "Type: BMX", "Frame: Alloy Internal Cable Routing"));
        models.add(new Model("POLYGON Xtrada 5",R.drawable.sepeda2,"Harga: RP. 7.710.000,00", "Type: Sepeda Gunung", "Frame: ALX XC 27.5 & 29"));
        models.add(new Model("POLYGON Premier 4 ",R.drawable.sepeda3,"Harga: RP. 5.500.000,00", "Type: BMX", "Frame: ALUTECH XC SPORT FRAME"));
        models.add(new Model("POLYGON Premier 5",R.drawable.sepeda4,"Harga: RP. 5.494.500,00", "Type: BMX", "Frame: ALUTECH XC SPORT FRAME"));
        models.add(new Model("POLYGON Urbano 5",R.drawable.sepeda5,"Harga: RP. 7.038.500,00", "Type: Sepeda Lipat", "Frame: Alloy"));
    }
}
