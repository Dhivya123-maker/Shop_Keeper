package com.example.shopkeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.shopkeeper.Cart.FragmentCart;
import com.example.shopkeeper.Categories.FragmentCategory;
import com.example.shopkeeper.Order_Statusz.Order;
import com.example.shopkeeper.Profile.FragmentMyAccount;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    MaterialToolbar toolbar1;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        bottomNavigationView = findViewById(R.id.nav_view);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation);


        imageView = findViewById(R.id.topAppBar);

//        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                drawerLayout.openDrawer(GravityCompat.START);
//
//            }
//        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });


//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentHome()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment temp = null;

            switch (item.getItemId()) {

                case R.id.home:
                    temp = new FragmentHome();


                    break;
                case R.id.category:
                    temp = new FragmentCategory();

                    break;
                case R.id.cart:
                    temp = new FragmentCart();


                    break;
                case R.id.my_account:
                    temp = new FragmentMyAccount();

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, temp).commit();
            return true;
        }
    });


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(Home.this,
                drawerLayout,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                int id = item.getItemId();


                switch (id) {

                    case R.id.nav_home:

                      getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentCategory()).commit();

                        break;

                    case R.id.nav_bike:

                        Intent intent = new Intent(Home.this,Order.class);
                        startActivity(intent);

                        break;


                    case R.id.nav_sc:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentCart()).commit();

                        break;

                }


                return true;

            }

        });


//        setting home fragments as main fragment as well as default fragments
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home,new FragmentHome()).commit();


    }



    }
