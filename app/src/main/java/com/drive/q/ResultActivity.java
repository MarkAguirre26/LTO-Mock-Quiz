package com.drive.q;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.drive.q.model.Result;
import com.drive.q.utils.Screen;

public class ResultActivity extends Activity {

    TextView txtScore, txtOutOflItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Screen.setFullScreen(this);


        txtScore = findViewById(R.id.txtScore);
        txtOutOflItems = findViewById(R.id.txtOutOflItems);

        txtScore.setText(String.valueOf(Result.finalScore));
        txtOutOflItems.setText("Out of " + Result.totalItems + " Items");

    }


    @Override
    public void onBackPressed() {
        resetSetting();
        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
        overridePendingTransition(0,0);
        finish();
    }

    private void resetSetting() {
        Result.totalItems = 0;
        Result.finalScore = 0;
    }
}
