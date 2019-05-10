package com.drive.q;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.drive.q.utils.Screen;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Screen.setFullScreen(this);
    }

    @Override
    public void onBackPressed() {
        confirmExit();
    }

    private void confirmExit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Exit Application");
        builder.setMessage("do you want confirm this action?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                finish();

                dialog.dismiss();
            }

        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // I do not need any action here you might
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    public void btnStart_Clicked(View view) {


        startActivity(new Intent(getApplicationContext(),MainActivity.class));
//        overridePendingTransition(0,0);
        finish();
    }
}
