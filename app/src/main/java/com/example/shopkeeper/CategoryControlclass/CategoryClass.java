package com.example.shopkeeper.CategoryControlclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.shopkeeper.AllCategories.FragmentAllCategory;
import com.example.shopkeeper.Cart.FragmentCart;
import com.example.shopkeeper.CountryPicker.custom.CountryPickerView;
import com.example.shopkeeper.Home.HomeClass;
import com.example.shopkeeper.Home.MyAccount.HomeAccountFragment;
import com.example.shopkeeper.Profile.HomeProfileFragment;
import com.example.shopkeeper.R;
import com.example.shopkeeper.CategoryControlclass.ProductCategories.ProductCategoryFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class CategoryClass extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    RelativeLayout linear1,fav_lnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_control);

        bottomNavigationView = findViewById(R.id.nav_view);
        linear1 = findViewById(R.id.linear1);
        fav_lnr = findViewById(R.id.fav_lnr);

        fav_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(view.getContext());
                bottomSheetDialog.setContentView(R.layout.wishlist_popup);
                bottomSheetDialog.setCancelable(true);
                CountryPickerView countryPickerView = bottomSheetDialog.findViewById(R.id.countryPickerView);

                ImageView imageView = bottomSheetDialog.findViewById(R.id.drop);
                TextView textView = bottomSheetDialog.findViewById(R.id.text);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        countryPickerView.setVisibility(View.VISIBLE);
                        imageView.setVisibility(View.GONE);
                        textView.setVisibility(View.GONE);
                        countryPickerView.setCountrySelectListener(countryData -> {

                            textView.setText( countryPickerView.getSelectedCountry().getCountryISD());
                            textView.setVisibility(View.VISIBLE);
                            imageView.setVisibility(View.VISIBLE);
                            countryPickerView.setVisibility(View.GONE);

                        });

                    }
                });




                bottomSheetDialog.show();
            }
        });


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new ProductCategoryFragment()).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {

                    case R.id.home:
                        Intent intent = new Intent(CategoryClass.this, HomeClass.class);
                        startActivity(intent);



                        break;
                    case R.id.category:
                        linear1.setVisibility(View.GONE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home,new FragmentAllCategory()).commit();

                        break;
                    case R.id.cart:

                        linear1.setVisibility(View.GONE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new FragmentCart()).commit();
                        break;
                    case R.id.my_account:
                        linear1.setVisibility(View.GONE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new HomeAccountFragment()).commit();

                }


                return true;
            }
        });

    }

}