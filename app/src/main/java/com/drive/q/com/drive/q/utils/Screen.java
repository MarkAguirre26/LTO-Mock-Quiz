package com.drive.q.com.drive.q.utils;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;

import com.drive.q.MainActivity;


public class Screen {


    public static void setFullScreen(Activity activity) {
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public static  void setNextScreen(Activity activity, Context ctx){

        activity.startActivity(new Intent(ctx, MainActivity.class));
        activity.overridePendingTransition(0, 0);
        activity.finish();
    }
}
