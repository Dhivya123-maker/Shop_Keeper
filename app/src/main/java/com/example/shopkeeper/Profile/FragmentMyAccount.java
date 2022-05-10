package com.example.shopkeeper.Profile;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.shopkeeper.Cart.Change_address_Fragment;
import com.example.shopkeeper.Cart.see_Later_Fragment;
import com.example.shopkeeper.R;
import com.smarteist.autoimageslider.IndicatorView.PageIndicatorView;

public class FragmentMyAccount extends Fragment {
    TextView edit;
    TextView add_address;
    Button edit_btn,change_pass;
     PopupWindow popview;
    Button cancel;
    RelativeLayout relativeLayout;
    LinearLayout add,first;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_my_account, container, false);
        edit = root.findViewById(R.id.edit);
        add_address = root.findViewById(R.id.add_address);
        edit_btn = root.findViewById(R.id.edit_btn);
        change_pass = root.findViewById(R.id.change_pass);
        relativeLayout = root.findViewById(R.id.second_lnr);
        add = root.findViewById(R.id.add_lnr);
        first = root.findViewById(R.id.first_lnr);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new Edit_Profile()).commit();

            }
        });


        add_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new Change_address_Fragment()).commit();

            }
        });


        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new Change_address_Fragment()).commit();

            }
        });
        change_pass.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {

                view = LayoutInflater.from(getActivity()).inflate(R.layout.popup_window, null);


//                relativeLayout.setVisibility(View.GONE);
//                add.setVisibility(View.GONE);
//                first.setVisibility(View.GONE);

                cancel = (Button) view.findViewById(R.id.cancel);



                popview = new PopupWindow(view,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT, true);
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
                        relativeLayout.setVisibility(View.VISIBLE);
                        add.setVisibility(View.VISIBLE);
                        first.setVisibility(View.VISIBLE);
                    }
                });

            }
        });





        return  root;
    }


}