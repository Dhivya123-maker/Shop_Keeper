package com.example.shopkeeper.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.shopkeeper.AllCategories.FragmentAllCategory;
import com.example.shopkeeper.Cart.FragmentCart;
import com.example.shopkeeper.Home.MyAccount.HomeAccountFragment;
import com.example.shopkeeper.Home.MyAccount.MyAccountClass;
import com.example.shopkeeper.Home.MyCart.MyCartClass;
import com.example.shopkeeper.Home.Wishlist.Wishlist;
import com.example.shopkeeper.Notification.Notification;
import com.example.shopkeeper.OrderStatus.Order;
import com.example.shopkeeper.R;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeClass extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    MaterialToolbar toolbar1;
    ImageView imageView;
    RelativeLayout div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        bottomNavigationView = findViewById(R.id.nav_view);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation);
        div = findViewById(R.id.div1);


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


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentHome()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment temp = null;

            switch (item.getItemId()) {

                case R.id.home:
                    temp = new FragmentHome();
                    div.setVisibility(View.VISIBLE);

                    break;
                case R.id.category:
                    temp = new FragmentAllCategory();
                    div.setVisibility(View.GONE);

                    break;
                case R.id.cart:
                    temp = new FragmentCart();
                    div.setVisibility(View.GONE);
                    bottomNavigationView.setVisibility(View.GONE);

                    break;
                case R.id.my_account:
                    temp = new HomeAccountFragment();
                    div.setVisibility(View.GONE);
                    bottomNavigationView.setVisibility(View.GONE);
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, temp).commit();
            return true;
        }
    });


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(HomeClass.this,
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

                      getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentAllCategory()).commit();

                        break;

                    case R.id.nav_bike:

                        Intent intent = new Intent(HomeClass.this,Order.class);
                        startActivity(intent);

                        break;


                    case R.id.nav_sc:

                        Intent cart = new Intent(HomeClass.this, MyCartClass.class);
                        startActivity(cart);

                        break;

                    case R.id.nav_bk:
                        Intent intent1 = new Intent(HomeClass.this, Wishlist.class);
                        startActivity(intent1);

                        break;

                    case R.id.nav_p:
                        Intent intent2 = new Intent(HomeClass.this, Notification.class);
                        startActivity(intent2);

                        break;


                    case R.id.nav_sbk:
                        Intent account = new Intent(HomeClass.this, MyAccountClass.class);
                        startActivity(account);

                        break;

                }


                return true;

            }

        });


//        setting home fragments as main fragment as well as default fragments
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home,new FragmentHome()).commit();


    }



    }
