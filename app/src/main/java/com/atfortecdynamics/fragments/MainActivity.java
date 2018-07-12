package com.atfortecdynamics.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);


        Fragment fragment;
        fragment=fragment_one.newInstance();
        final FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.framelayout,fragment);
        transaction.commit();

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        fragment=fragment_one.newInstance();
                        break;
                    case R.id.navigation_dashboard:
                        fragment=fragment_two.newInstance();
                        break;
                    case R.id.navigation_notifications:
                        fragment=fragment_three.newInstance();
                        break;
                }
                FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
                trans.replace(R.id.framelayout,fragment);
                trans.commit();

                return true;
            }
        });

    }

}
