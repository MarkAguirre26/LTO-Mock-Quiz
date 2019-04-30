package com.drive.q;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.drive.q.com.drive.q.utils.Screen;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Screen.setFullScreen(this);
        setContentView(R.layout.activity_main);

    }


    public void btnChoiceA_Clicked(View view) {
        String tag = (String) view.getTag();
        Toast.makeText(getApplicationContext(), tag, Toast.LENGTH_SHORT).show();
    }

    public void btnChoiceB_Clicked(View view) {
        String tag = (String) view.getTag();
        Toast.makeText(getApplicationContext(), tag, Toast.LENGTH_SHORT).show();
    }

    public void btnChoiceC_Clicked(View view) {
        String tag = (String) view.getTag();
        Toast.makeText(getApplicationContext(), tag, Toast.LENGTH_SHORT).show();
    }

    private void submitUserAnswer() {

    }

    private void setQuestionTOView() {

    }


}
