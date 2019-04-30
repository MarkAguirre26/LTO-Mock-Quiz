package com.drive.q.com.drive.q.service;

import com.drive.q.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsService {

    public ItemsService() {
        init();
    }

    private List<Item> questions = new ArrayList<>();

    public List<Item> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Item> questions_) {
        questions = questions_;
    }


    private void init(){

        List<Item> items = new ArrayList<>();
        items.add(new Item("Question","A","B","C","A"));
        this.setQuestions(items);

    }
}
