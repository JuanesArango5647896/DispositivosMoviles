package com.juanes.miaplicacion;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListaElementos> elementos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void  init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("#7B1FA2","BZRP","Buenos Aires","Activo", "10:45 AM"));
        elementos.add(new ListaElementos("#22c219","Arcangel","Punta Cana","Inactivo", "11:50 PM"));
        elementos.add(new ListaElementos("#0fd6c9","Leo Messi","Paris","Activo", "2:10 PM"));
        elementos.add(new ListaElementos("#0f12d6","Ice Cube","New York","Inactivo", "5:45 AM"));
        elementos.add(new ListaElementos("#d6730f","Blessd","Los Angeles","Activo", "4:40 PM"));
        elementos.add(new ListaElementos("#d60f94","Ryan","Amsterdam","Inactivo", "7:25 PM"));
        elementos.add(new ListaElementos("#d6190f","Cristiano","Singapour","Activo", "8:33 AM"));
        elementos.add(new ListaElementos("#031236","Neymar","Rio de Janeiro","Inactivo", "3:35 AM"));
        elementos.add(new ListaElementos("#056e33","Carl Cox","Miami","Activo", "6:30 PM"));
        elementos.add(new ListaElementos("#873542","Anuel+","Lisboa","Inactivo", "1:17 PM"));


        ListAdapter listAdapter = new ListAdapter(elementos,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}