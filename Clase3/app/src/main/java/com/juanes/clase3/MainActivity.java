package com.juanes.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";
    EditText LadoUno, LadoDos;
    TextView Resultado;
    Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Estoy en OnCreate");
        LadoUno = findViewById(R.id.LadoUno);
        LadoDos = findViewById(R.id.LadoDos);
        Resultado = findViewById(R.id.Resultado);
        Calcular = findViewById(R.id.Calcular);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entre a OnStar");
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ladoUno = Float.parseFloat(LadoUno.getText().toString());
                float ladoDos = Float.parseFloat(LadoDos.getText().toString());
                float Resultad = ladoUno*ladoDos;
                Resultado.setText(String.valueOf(Resultad));
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entre a OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entre a OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entre a OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entre a OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entre a OnDestroy");
    }
}