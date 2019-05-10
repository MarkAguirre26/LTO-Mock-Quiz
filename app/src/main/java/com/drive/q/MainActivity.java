package com.drive.q;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.drive.q.model.Item;
import com.drive.q.model.Result;
import com.drive.q.service.ItemsService;
import com.drive.q.utils.Screen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity {

    TextView txtQuestion;
    Button btnChoiceA, btnChoiceB, btnChoiceC;
    private List<Item> items = new ArrayList<>();
    String answer;
    int rightAnswer = 0;
    int currentIndex = 0;
    int totalItems = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Screen.setFullScreen(this);
        setContentView(R.layout.activity_main);

        txtQuestion = findViewById(R.id.txtQuestion);
        btnChoiceA = findViewById(R.id.btnChoiceA);
        btnChoiceB = findViewById(R.id.btnChoiceB);
        btnChoiceC = findViewById(R.id.btnChoiceC);

        //get questions list from service
        init();

        setQuestionToView();

    }

    private void init() {

        items.addAll(new ItemsService().getItems());
        Collections.shuffle(items);
//        totalItems = items.size();
        totalItems = 40;
    }


    public void btnChoice_Clicked(View view) {
        String tag = (String) view.getTag();
        validateUserAnswer(tag);


      if (currentIndex == totalItems) {


            submitUserAnswer();

        }else{
            setQuestionToView();
        }







    }

    private void submitUserAnswer() {

        Result.finalScore = rightAnswer;
        Result.totalItems = totalItems;

        startActivity(new Intent(getApplicationContext(), ResultActivity.class));
//        overridePendingTransition(0, 0);
        finish();
    }

    private void setQuestionToView() {


        String question = items.get(currentIndex).getQuestion();
        String choiceA = "A.) "+ items.get(currentIndex).getChoiceA();
        String choiceB = "B.) "+ items.get(currentIndex).getChoiceB();
        String choiceC = "C.) "+ items.get(currentIndex).getChoiceC();
        answer = items.get(currentIndex).getAnswer();

        currentIndex++;

        txtQuestion.setText(question);
        btnChoiceA.setText(choiceA);
        btnChoiceB.setText(choiceB);
        btnChoiceC.setText(choiceC);




    }

    private void validateUserAnswer(String userAnswer) {

        if (userAnswer.equals(answer)) {
            rightAnswer++;
        }


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }
}
