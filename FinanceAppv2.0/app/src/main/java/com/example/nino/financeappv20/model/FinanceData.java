package com.example.nino.financeappv20.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Nino on 16. 06. 2016.
 */
public class FinanceData implements Parcelable{

    private String symbol;
    private Main main;

    public FinanceData(String symbol, float ask) {
        this.symbol = symbol;
        this.main = new Main(ask);
    }
    protected FinanceData(Parcel in) {
        symbol = in.readString();
        main = in.readParcelable(Main.class.getClassLoader());
    }


    public String getSymbol() {
        return symbol;
    }


    public Main getMain() {
        return main;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(symbol);
        dest.writeParcelable(main, 0);
    }

    public static final Creator<FinanceData> CREATOR = new Creator<FinanceData>() {
        @Override
        public FinanceData createFromParcel(Parcel in) {
            return new FinanceData(in);
        }

        @Override
        public FinanceData[] newArray(int size) {
            return new FinanceData[size];
        }
    };
}
