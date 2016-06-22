package com.example.nino.financeappv20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nino.financeappv20.model.FinanceData;

/**
 * Created by Nino on 16. 06. 2016.
 */
public class StockAdapter extends  BaseAdapter{

    private final LayoutInflater layoutInflater;
    private FinanceData[] data;
    public StockAdapter(Context context, FinanceData[] data) {
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }
    @Override
    public int getCount() {
        if (data != null) {
            return data.length;
        } else {
            return 0;
        }
    }

    @Override
    public FinanceData getItem(int position) {
        return data[position];
    }

    @Override //ne pusti da je ID String...
    public String getItemSymbol(int position) {
        return getItem(position).getSymbol();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        FinanceData item = getItem(position);


        return view;
    }
public static final FinanceData[] DATA = new FinanceData[] {
        new FinanceData("GOOG", 139.41f),
        new FinanceData("MS", 139.41f),
        new FinanceData("FB", 139.41f),


};
}