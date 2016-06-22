package com.example.nino.financeappv20.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Nino on 16. 06. 2016.
 */
public class Main implements Parcelable {
    public static float ask;

    public Main(float ask) {
        this.ask = Main.ask;
    }

    protected Main(Parcel in) {
        ask = in.readFloat();
    }

    public float getask() {
        return ask;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(ask);
    }

    public static final Creator<Main> CREATOR = new Creator<Main>() {
        @Override
        public Main createFromParcel(Parcel in) {
            return new Main(in);
        }

        @Override
        public Main[] newArray(int size) {
            return new Main[size];
        }
    };
}
