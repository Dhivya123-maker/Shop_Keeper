package com.example.shopkeeper.Profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

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

import com.example.shopkeeper.Cart.ChangeAddressFragment;
import com.example.shopkeeper.R;


public class HomeProfileFragment extends Fragment {

    TextView edit;
    TextView add_address;
    Button edit_btn,change_pass;
    PopupWindow popview;
    Button cancel;
    RelativeLayout relativeLayout;
    LinearLayout add,first,cat_lnr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home_profile, container, false);


        edit = root.findViewById(R.id.edit);
        add_address = root.findViewById(R.id.add_address);
        edit_btn = root.findViewById(R.id.edit_btn);
        change_pass = root.findViewById(R.id.change_pass);
        relativeLayout = root.findViewById(R.id.second_lnr);
        add = root.findViewById(R.id.add_lnr);
        first = root.findViewById(R.id.first_lnr);
        cat_lnr = root.findViewById(R.id.cat_lnr);



        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new HomeEditProfile()).commit();

            }
        });


        add_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new ChangeAddressFragment()).commit();

            }
        });


        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new ChangeAddressFragment()).commit();

            }
        });
        change_pass.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {

                view = LayoutInflater.from(getActivity()).inflate(R.layout.popup_window, null);


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
                popview.showAtLocation(root.findViewById(R.id.change_pass), Gravity.CENTER
                        , 0, 0);
                View container = (View) popview.getContentView().getParent();
                WindowManager wm = (WindowManager) getActivity(). getSystemService(Context.WINDOW_SERVICE);
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

        return  root;
    }
}