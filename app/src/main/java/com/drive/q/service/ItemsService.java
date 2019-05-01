package com.drive.q.service;

import android.util.Log;
import android.widget.Toast;

import com.drive.q.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsService {








    public List<Item> getItems(){

//        List<Item> questions = new ArrayList<>();

        List<Item> items = new ArrayList<>();
        items.add(new Item("Question","A1","B","C","A"));
        items.add(new Item("Question","A2","B","C","B"));
        items.add(new Item("Question","A3","B","C","C"));
        items.add(new Item("Question","A4","B","C","A"));
        items.add(new Item("Question","A5","B","C","B"));
        System.out.println(items.toString());
        Log.d("errMessage","Heree");
        return items;

    }
}
