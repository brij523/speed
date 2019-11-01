package com.myapplication.helper;

import android.content.Context;
import android.content.SharedPreferences;


import com.myapplication.interfaces.Constants;

import java.util.List;
import java.util.Set;

public class SharedPreferenceManager implements Constants {

    private SharedPreferences sharedPreferences;

    public SharedPreferenceManager(Context context) {
        sharedPreferences = context.getSharedPreferences(MY_PREFERENCE, Context.MODE_PRIVATE);
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    private void addToSharedPreferences(String propertyName, String propertyValue) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(propertyName, propertyValue);
        editor.apply();
    }


    @SuppressWarnings("unchecked")
    public void addDetailToSharedPreferences(String propertyName, Object propertyValue) {
        try {
            if (userDetailsAndObjectTypeInSharedPreference.containsKey(propertyName)) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if (propertyValue instanceof Set) {
                    //noinspection unchecked
                    editor.putStringSet(propertyName, (Set<String>) propertyValue);
                } else if (propertyValue instanceof String) {
                    editor.putString(propertyName, (String) propertyValue);
                } else if (propertyValue instanceof Boolean) {
                    editor.putBoolean(propertyName, (Boolean) propertyValue);
                } else if (propertyValue instanceof Integer) {
                    editor.putInt(propertyName, (Integer) propertyValue);
                } else if (propertyValue instanceof Float) {
                    editor.putFloat(propertyName, (Float) propertyValue);
                } else if (propertyValue instanceof Long) {
                    editor.putLong(propertyName, (Long) propertyValue);
                }
                editor.apply();
            } else {
                throw new Exception("This property is not present in 'userDetailsAndObjectTypeInSharedPreference'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public Object get(String propertyName, Object defaultValue) {
        try {
            if (userDetailsAndObjectTypeInSharedPreference.containsKey(propertyName)) {
                    if (userDetailsAndObjectTypeInSharedPreference.get(propertyName) == String.class) {
                        return sharedPreferences.getString(propertyName, (String) defaultValue);
                    } else if (userDetailsAndObjectTypeInSharedPreference.get(propertyName) == Integer.class) {
                        return sharedPreferences.getInt(propertyName, (Integer) defaultValue);
                    } else if (userDetailsAndObjectTypeInSharedPreference.get(propertyName) == Boolean.class) {
                        return sharedPreferences.getBoolean(propertyName, (Boolean) defaultValue);
                    } else if (userDetailsAndObjectTypeInSharedPreference.get(propertyName) == Long.class) {
                        return sharedPreferences.getLong(propertyName, (Long) defaultValue);
                    } else if (userDetailsAndObjectTypeInSharedPreference.get(propertyName) == Float.class) {
                        return sharedPreferences.getFloat(propertyName, (Float) defaultValue);
                    } else if (userDetailsAndObjectTypeInSharedPreference.get(propertyName) == Set.class) {
                        //noinspection unchecked
                        return sharedPreferences.getStringSet(propertyName, (Set<String>) defaultValue);
                    } else {
                        throw new Exception("Data type incorrect for property");
                    }
                } else {
                    throw new Exception("This property is not present in 'userDetailsAndObjectTypeInSharedPreference'");
                }

        } catch (Exception e) {
            e.printStackTrace();
            return defaultValue;
        }
    }

    public void emptySharedPreferences() {
        sharedPreferences.edit().clear().apply();
    }

    public void removeSpecificValueFromSharedPreferences(String propertyName){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(propertyName);
        editor.apply();
        //sharedPreferences.edit().remove(propertyName).apply();
    }

    public void removeSpecifiedList(List<String> propertyName) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        for(int i=0;i<propertyName.size();i++) {
            editor.remove(propertyName.get(i));
        }
        editor.apply();
    }



    public String toString() {
        return this.sharedPreferences.toString();
    }
}