package com.example.shopkeeper.Profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.shopkeeper.Home.MyAccount.AccountAddAddress;
import com.example.shopkeeper.Home.MyAccount.AccountEditProfile;
import com.example.shopkeeper.R;

public class ProfileClass extends AppCompatActivity {
    TextView edit;
    TextView add_address;
    Button edit_btn,change_pass;
     PopupWindow popview;
    Button cancel;
    RelativeLayout relativeLayout;
    LinearLayout add,first,cat_lnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my_account);

        edit = findViewById(R.id.edit);
        add_address =findViewById(R.id.add_address);
        edit_btn = findViewById(R.id.edit_btn);
        change_pass = findViewById(R.id.change_pass);
        relativeLayout =findViewById(R.id.second_lnr);
        add = findViewById(R.id.add_lnr);
        first = findViewById(R.id.first_lnr);
        cat_lnr = findViewById(R.id.cat_lnr);



        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileClass.this, AccountEditProfile.class);
                startActivity(intent);


            }
        });


        add_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProfileClass.this, AccountAddAddress.class);
                startActivity(intent);

            }
        });


        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileClass.this, AccountAddAddress.class);
                startActivity(intent);


            }
        });
        change_pass.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {

                view = LayoutInflater.from(ProfileClass.this).inflate(R.layout.popup_window, null);


                cancel = (Button) view.findViewById(R.id.cancel);


                popview = new PopupWindow(view,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT, true);
                popview.setBackgroundDrawable(null);
                popview.setFocusable(true);
                // Settings disappear when you click somewhere else
                popview.setOutsideTouchable(true);
                popview.setSoftInputMode(PopupWindow.INPUT_METHOD_NEEDED);
                popview.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
                popview.showAtLocation(findViewById(R.id.change_pass), Gravity.CENTER
                    , 0, 0);
                View container = (View) popview.getContentView().getParent();
                WindowManager wm = (WindowManager) ProfileClass.this. getSystemService(Context.WINDOW_SERVICE);
                WindowManager.LayoutParams p = (WindowManager.LayoutParams) container.getLayoutParams();
                p.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
                p.dimAmount = 0.3f;
                wm.updateViewLayout(container, p);

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        popview.dismiss();
                    }
                });


            }
        });




    }


}