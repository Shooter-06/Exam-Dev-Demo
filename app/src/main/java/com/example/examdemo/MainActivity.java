package com.example.examdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton frags, activs, home;
    EditText fragments, activities;
    Boolean isALLfabsvisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frags=findViewById(R.id.floatingActionButton);
        activs=findViewById(R.id.floatingActionButton3);
        home=findViewById(R.id.floatingActionButton2);
        fragments=findViewById(R.id.editTextTextPersonName2);
        activities=findViewById(R.id.editTextTextPersonName3);
        isALLfabsvisible =false;

        frags.setVisibility(View.GONE);
        activs.setVisibility(View.GONE);
        fragments.setVisibility(View.GONE);
        activities.setVisibility(View.GONE);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isALLfabsvisible) {
                    frags.setVisibility(View.VISIBLE);
                    activs.setVisibility(View.VISIBLE);
                    fragments.setVisibility(View.VISIBLE);
                    activities.setVisibility(View.VISIBLE);
                    isALLfabsvisible = true;
                } else {
                    frags.setVisibility(View.GONE);
                    activs.setVisibility(View.GONE);
                    fragments.setVisibility(View.GONE);
                    activities.setVisibility(View.GONE);
                    isALLfabsvisible = false;
                }
//                getSupportFragmentManager().beginTransaction().add(R.id.container,
//                        new FirstFragment()).commit();
            }
        });

        frags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), FragmentInterface.class);
//                startActivity(i);
//                getSupportFragmentManager().beginTransaction().add(R.id.container,
//                        new FragmentInterface()).commit();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                //ft.replace(R.id.container, FragmentInterface);
                ft.commit();
            }
        });


        activs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), FragmentInterface.class);
//                startActivity(i);
                getSupportFragmentManager().beginTransaction().add(R.id.container,
                        new FragmentInterface()).commit();
            }
        });
    }

//    @Override
//    public void respond(String data) {
//
//    }
//
//    @Override
//    public void respond2(String data) {
//
//    }

    @Override
    public void onClick(View view) {
//        if(view.getId()==R.id.floatingActionButton){
//            //getSupportFragmentManager().beginTransaction().
//                    //replace(R.id.con).
//        }
    }
}