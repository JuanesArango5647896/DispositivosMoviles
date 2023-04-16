package com.juanes.miaplicacion;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView name2, ciudad2, estado2, hora2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListaElementos element = (ListaElementos) getIntent().getSerializableExtra("ListaElementos");
        name2 = findViewById(R.id.name);
        ciudad2 = findViewById(R.id.ciudad);
        estado2 = findViewById(R.id.estado);
        hora2 = findViewById(R.id.hora);

        name2.setText(element.getName());
        name2.setTextColor(Color.parseColor(element.getColor()));

        ciudad2.setText(element.getCiudad());

        estado2.setText(element.getEstado());
        estado2.setTextColor(Color.GRAY);

        hora2.setText(element.getHora());
    }
}
