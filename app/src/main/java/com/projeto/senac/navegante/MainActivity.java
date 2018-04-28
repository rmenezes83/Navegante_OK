package com.projeto.senac.navegante;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.projeto.senac.navegante.Auxiliar.SectionsPageAdapter;
import com.projeto.senac.navegante.Fragments.Tab_01;
import com.projeto.senac.navegante.Fragments.Tab_02;
import com.projeto.senac.navegante.Fragments.Tab_03;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private SectionsPageAdapter sections;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Oncreate: Starting.");
        sections = new SectionsPageAdapter(getSupportFragmentManager());

        viewPager = findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager (ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab_01(),"Destinos");
        adapter.addFragment(new Tab_02(),"Mapas");
        adapter.addFragment(new Tab_03(),"Informações");
        viewPager.setAdapter(adapter);
    }
}
