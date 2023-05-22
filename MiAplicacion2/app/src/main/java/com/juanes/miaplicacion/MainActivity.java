package com.juanes.miaplicacion;

import android.content.Intent;
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
        elementos.add(new ListaElementos("#FF000000","BZRP","Session # 50","300 M", "4:05 min"));
        elementos.add(new ListaElementos("#FF000000","Arcangel","Me prefieres a mi","290 M", "2:30 min"));
        elementos.add(new ListaElementos("#FF000000","Zion y Lennox","Hay algo en ti","250 M", "3:10 min"));
        elementos.add(new ListaElementos("#FF000000","Ice Cube","You know how we do it","230 M", "3:30 min"));
        elementos.add(new ListaElementos("#FF000000","Blessd","Palabras Sobran","200 M", "3:50 min"));
        elementos.add(new ListaElementos("#FF000000","Ryan Castro","Malory","170 M", "3:45 min"));
        elementos.add(new ListaElementos("#FF000000","De La Ghetto","Dices","160 M", "2:50 min"));
        elementos.add(new ListaElementos("#FF000000","Eladio Carrion","Friends","140 M", "3:00 min"));
        elementos.add(new ListaElementos("#FF000000","Carl Cox","Set in France for cercle","100 M", "4:20 min"));
        elementos.add(new ListaElementos("#FF000000","Anuel","Adicto","80 M", "4:18 min"));


        ListAdapter listAdapter = new ListAdapter(elementos, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListaElementos item) {
                pasarDatos(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    public void pasarDatos(ListaElementos item){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("ListaElementos", item);
        startActivity(intent);
    }
}