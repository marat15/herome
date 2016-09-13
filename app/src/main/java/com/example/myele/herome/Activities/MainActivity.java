package com.example.myele.herome.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.myele.herome.Fragments.MainFragment;
import com.example.myele.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager(); // manager of fragments
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        /*
         if there is no fragment, then go ahead and create a new fragment
         (it is null initially, this has to be done, otherwise the program will fail
        */ if(fragment==null){
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();

            // manager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }



}
