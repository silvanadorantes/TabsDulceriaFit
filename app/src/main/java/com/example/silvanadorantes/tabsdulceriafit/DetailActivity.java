package com.example.silvanadorantes.tabsdulceriafit;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String ID_DULCESFIT = "com.example.silvanadorantes.tabsdulceriafit.extra.idDulceFit";
    public static final String TIPO_DULCESFIT = "com.example.silvanadorantes.tabsdulceriafit.extra.tipoDulceFit";
    public static final String INDICE_SECCION
            = "com.example.silvanadorantes.tabsdulceriafit.MainActivity.extra.INDICE_SECCION";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Se a agregado el dulce al pedido", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        // Se obtiene la posición del item seleccionado
        int position = getIntent().getIntExtra(ID_DULCESFIT, -1);

        int tipo = getIntent().getIntExtra(TIPO_DULCESFIT, -1);

        TextView nombre = (TextView)findViewById(R.id.detail_nombre);
        TextView descripcion = (TextView)findViewById(R.id.detail_descripcion);
        ImageView photo = (ImageView)findViewById(R.id.detailimagen);


        switch (tipo){
            case 1:
                DulcesFit detallegalleta = DulcesFit.getGalletasByPosition(position);
                nombre.setText(detallegalleta.getNombre());
                descripcion.setText(detallegalleta.getDescripcion());
                Glide.with(this).load(detallegalleta.getIdImagen()).into(photo);
                break;

            case 2:
                DulcesFit detallepanqueca = DulcesFit.getPanquecasByPosition(position);
                nombre.setText(detallepanqueca.getNombre());
                descripcion.setText(detallepanqueca.getDescripcion());
                Glide.with(this).load(detallepanqueca.getIdImagen()).into(photo);

                break;

            case 3:
                DulcesFit detalletorta = DulcesFit.getTortaByPosition(position);
                nombre.setText(detalletorta.getNombre());
                descripcion.setText(detalletorta.getDescripcion());
                Glide.with(this).load(detalletorta.getIdImagen()).into(photo);
                break;



        }




    }




}
