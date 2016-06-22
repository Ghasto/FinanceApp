package com.example.nino.financeappv20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.nino.financeappv20.model.FinanceData;

public class MainActivity extends AppCompatActivity {
    private StockAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new StockAdapter(this, StockAdapter.DATA);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                FinanceData item = adapter.getItem(position);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_FINANCE_DATA, item);
                startActivity(intent);
            }
        });


    }
}




