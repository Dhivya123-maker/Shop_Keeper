package com.example.shopkeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.shopkeeper.Cart.FragmentCart;
import com.example.shopkeeper.Categories.FragmentCategory;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    MaterialToolbar toolbar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        bottomNavigationView = findViewById(R.id.nav_view);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation);


        toolbar1 = findViewById(R.id.topAppBar);

        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentHome()).commit();

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


    }
}