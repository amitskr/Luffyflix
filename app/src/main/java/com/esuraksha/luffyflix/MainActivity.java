package com.esuraksha.luffyflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.esuraksha.luffyflix.Adapters.ImageSliderAdapter;
import com.esuraksha.luffyflix.Adapters.TrendingAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    Button allow,deny,allow_sandbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);

        recycler.setLayoutManager(new GridLayoutManager(this,3,GridLayoutManager.VERTICAL, false));
        recycler.setHasFixedSize(true);

        TrendingAdapter trendingAdapter = new TrendingAdapter(this);
        recycler.setAdapter(trendingAdapter);

        LayoutInflater inflater1 = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater1.inflate(R.layout.permission_dialogue, null);

        PopupWindow popupWindow = new PopupWindow(view, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setAnimationStyle(R.style.popup_window_animation);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        allow = view.findViewById(R.id.allow);
        deny = view.findViewById(R.id.deny);
        allow_sandbox = view.findViewById(R.id.allow_sandbox);

        allow_sandbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });


    }
}