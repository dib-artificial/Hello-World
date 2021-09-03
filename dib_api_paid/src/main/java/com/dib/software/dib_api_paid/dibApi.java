package com.dib.software.dib_api_paid;

import android.content.Context;
import android.content.SharedPreferences;

public class dibApi {

    private static dibApi yourPreference;
    private SharedPreferences sharedPreferences;

    public static dibApi getInstance(Context context) {
        if (yourPreference == null) {
            yourPreference = new dibApi(context);
        }
        return yourPreference;
    }

    private dibApi(Context context) {
        sharedPreferences = context.getSharedPreferences("Your Product Name",Context.MODE_PRIVATE);
    }

    public void set_dib_api(String key,String value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putString(key, value);
        prefsEditor.commit();
    }

    public String get_dib_api_module(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getString(key, "");
        }
        return "";
    }

    // dib product

    public void set_dib_product(String key,String value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putString(key, value);
        prefsEditor.commit();
    }

    public String get_dib_product_module(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getString(key, "");
        }
        return "";
    }
}
