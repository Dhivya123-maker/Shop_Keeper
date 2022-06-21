package com.example.shopkeeper.OrderStatus.Delivered;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;

import com.example.shopkeeper.R;

public class DeliveryDetails extends AppCompatActivity {

    Button cancel,submit;
    PopupWindow popview;


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_order);

        button = findViewById(R.id.cancel_order_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {

                view = LayoutInflater.from(DeliveryDetails.this).inflate(R.layout.return_popup, null);
                cancel = (Button) view.findViewById(R.id.cancel);
                submit = (Button) view.findViewById(R.id.submit);



                popview = new PopupWindow(view,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popview.setBackgroundDrawable(null);
                popview.setFocusable(true);
                // Settings disappear when you click somewhere else
                popview.setOutsideTouchable(true);
                popview.setSoftInputMode(PopupWindow.INPUT_METHOD_NEEDED);
                popview.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
                popview.showAtLocation(findViewById(R.id.cancel_order_btn), Gravity.CENTER
                        , 0, 0);
                View container = (View) popview.getContentView().getParent();
                WindowManager wm = (WindowManager) DeliveryDetails.this. getSystemService(Context.WINDOW_SERVICE);
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

                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        popview.dismiss();

                    }
                });
            }
        });

    }
}