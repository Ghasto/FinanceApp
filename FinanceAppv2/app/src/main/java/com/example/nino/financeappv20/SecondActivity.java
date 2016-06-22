package com.example.nino.financeappv20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nino.financeappv20.model.FinanceData;

import java.lang.reflect.Array;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_FINANCE_DATA = "extra finance data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        FinanceData financeData = extras.getParcelable(EXTRA_FINANCE_DATA);


        TextView askView = (TextView) findViewById(R.id.askprice);
        askView.setText(getString(R.string.askprice, financeData.getMain().getask()));

    }

}
