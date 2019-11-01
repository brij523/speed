package com.myapplication.helper;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;


import com.myapplication.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Helper {


    public static void fragment_transaction(FragmentManager fragmentManager, Fragment fragment, int fragment_container) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public static void addFrag(FragmentManager fragmentManager, Fragment fragment, int fragment_container) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    public static Dialog getProgressDialog(Context context) {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_progress_dialog);
        dialog.setCancelable(false);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return dialog;
    }



    public static String dateFormatterToMMM_DD(String date){
        SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date source = null;
        try {
            source = sourceFormat.parse(date);
            System.out.println(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("dd MMM");
        String target_value = format.format(source);
        return target_value;
    }
    public static String dateFormatterFromdd_mm_timeToMMM_DD(String date){
        SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date source = null;
        try {
            source = sourceFormat.parse(date);
            System.out.println(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat format = new SimpleDateFormat("dd MMM");
        String target_value = format.format(source);
        return target_value;
    }




}
