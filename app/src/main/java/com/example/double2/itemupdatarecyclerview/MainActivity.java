package com.example.double2.itemupdatarecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMain;

    private RecyclerView mRecyclerView;
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_main);

        String[] data = new String[20];
        for (int i = 0; i < 20; i++) {
            data[i] = "item" + i;
        }

        mMyAdapter = new MyAdapter(this, data);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mMyAdapter);

        btnMain = (Button) findViewById(R.id.btn_main);
        btnMain.setOnClickListener(new View.OnClickListener() {//RecyclerView的局部更新
            @Override
            public void onClick(View v) {
                mMyAdapter.data[0] = "局部更新[0]：0000000";
                mMyAdapter.data[2] = "局部更新[2]：2222222";
                mMyAdapter.notifyItemChanged(0);
                mMyAdapter.notifyItemChanged(2);

                Toast.makeText(MainActivity.this,"局部更新了[0]和[2]",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
