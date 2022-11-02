package com.biniyam.recyclerviewexemple02112022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListData[] listDataArray = new ListData[]{
                new ListData("on text", android.R.drawable.btn_star),
                new ListData("on text till", android.R.drawable.btn_default),
                new ListData("on bra text", android.R.drawable.ic_btn_speak_now),
                new ListData("on dålig text", android.R.drawable.btn_radio),
                new ListData("on tråkig text", android.R.drawable.btn_star_big_on)

        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        CustomAdapter adapter = new CustomAdapter(listDataArray);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);




    }
}