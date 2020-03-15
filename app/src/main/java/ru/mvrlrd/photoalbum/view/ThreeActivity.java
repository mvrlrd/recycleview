package ru.mvrlrd.photoalbum.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.mvrlrd.photoalbum.R;
import android.os.Bundle;


public class ThreeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();



    }

    public void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(false);

        MyAdapter myAdapter = new MyAdapter(20);
        recyclerView.setAdapter(myAdapter);
    }
}
