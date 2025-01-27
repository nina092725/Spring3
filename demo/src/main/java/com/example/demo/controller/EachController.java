package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/each")
public class EachController {

    @RequestMapping("")
    public String index(Model model){

        List<String>itemList=new ArrayList<>();
        // itemList.add("えんぴつ");
        // itemList.add("消しゴム");
        // itemList.add("ホチキス");

        itemList.add(new Item("えんぴつ",120,"green"));
        itemList.add(new Item("PC",120,"silver"));
        itemList.add(new Item("bottle",120,"green"));


        model.addAttribute("itemList,itemList");

        return "each";
    }

}
