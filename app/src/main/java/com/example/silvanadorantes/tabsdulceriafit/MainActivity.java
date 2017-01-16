package com.example.silvanadorantes.tabsdulceriafit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    public static final String ID_DULCESFIT = "com.example.silvanadorantes.tabsdulceriafit.extra.idDulceFit";
    public static final String TIPO_DULCESFIT = "com.example.silvanadorantes.tabsdulceriafit.extra.tipoDulceFit";

    private AppBarLayout appBarLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SeccionesDulcesFitAdapter seccionesDulcesFitAdapter;
    private ViewGroup container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        appBarLayout = (AppBarLayout) findViewById(R.id.appbarLayout);
        tabLayout = new TabLayout(this);
        tabLayout.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        appBarLayout.addView(tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewpagerDulceFit);
        poblarViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


    }



    private void poblarViewPager(ViewPager viewPager){
        seccionesDulcesFitAdapter = new SeccionesDulcesFitAdapter(getSupportFragmentManager());
        seccionesDulcesFitAdapter.addFragments(DulcesFitFragment.newInstance(0), getString(R.string.tab_galletas));
        seccionesDulcesFitAdapter.addFragments(DulcesFitFragment.newInstance(1), getString(R.string.tab_panquecas));
        seccionesDulcesFitAdapter.addFragments(DulcesFitFragment.newInstance(2), getString(R.string.tab_tortas));
        viewPager.setAdapter(seccionesDulcesFitAdapter);

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
