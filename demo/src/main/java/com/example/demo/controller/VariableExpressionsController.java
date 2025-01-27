package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Car;

@Controller
@RequestMapping("/variable-expressions")
public class VariableExpressionsController {

    @RequestMapping("")
    public String index(Model model){//リクエストスコープ使いたいから

        // String javascriptStr ="<script>alert(XSSの脆弱性あり)";</script>;
        // del.addAttribute("hoge",name)

        model.addAttribute("name", "飛田");

        Car car=new Car(100,"ベンツ",50);
        model.addAttribute("car", car);
        return "variable-expressions";

        
    }
}
