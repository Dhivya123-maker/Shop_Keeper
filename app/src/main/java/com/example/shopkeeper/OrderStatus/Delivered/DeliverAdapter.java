package com.example.shopkeeper.OrderStatus.Delivered;



import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class DeliverAdapter extends RecyclerView.Adapter<DeliverAdapter.ViewHolder> {


    List<Delivermodel> delivermodelList;
    Context context;


    public static DeliverAdapter.OnItemClickListener mListener;


    public interface OnItemClickListener{
        void onItemClick(int position);
    }


    public void setOnItemClickListener(DeliverAdapter.OnItemClickListener listener){

        mListener =  listener;


    }


    public DeliverAdapter(Context context, List<Delivermodel> delivermodelList) {
        this.context = context;
        this.delivermodelList = delivermodelList;
    }

    @NonNull
    @Override
    public DeliverAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deliver_recycle, parent, false);


        return new DeliverAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return delivermodelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView p_name,b_name,price,offer,delivery,qty;
        Button return_btn;

        Button cancel,submit;
        PopupWindow popview;

        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.saree);

            p_name = itemView.findViewById(R.id.p_name);
            b_name = itemView.findViewById(R.id.brand);

            price = itemView.findViewById(R.id.price);
            offer = itemView.findViewById(R.id.offer);
            delivery = itemView.findViewById(R.id.delivery);
            qty = itemView.findViewById(R.id.qty);
            return_btn = itemView.findViewById(R.id.return_order_btn);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }



                }
            });


            return_btn.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("WrongConstant")
                @Override
                public void onClick(View view) {
                    view = LayoutInflater.from(view.getContext()).inflate(R.layout.return_popup, null);
                    cancel = (Button) view.findViewById(R.id.cancel);
                    submit = (Button) view.findViewById(R.id.submit);


                    popview = new PopupWindow(view,
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT, true);
                    popview.setBackgroundDrawable(null);
                    popview.setFocusable(true);

                    popview.setOutsideTouchable(true);
                    popview.setSoftInputMode(PopupWindow.INPUT_METHOD_NEEDED);
                    popview.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
                    popview.showAtLocation(view, Gravity.CENTER, 0, 0);
                    popview.update(0, 0, popview.getWidth(), popview.getHeight());

                    View container = (View) popview.getContentView().getParent();
                    WindowManager wm = (WindowManager) view.getContext(). getSystemService(Context.WINDOW_SERVICE);
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




}