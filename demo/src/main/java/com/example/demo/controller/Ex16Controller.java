package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/index")
public class Ex16Controller {
    private List<User> userList = new ArrayList<>();

    @RequestMapping("")
    public String index(Model model) {
        // 初期表示時、userListがnullの場合は初期化
        if (userList == null) {
            userList = new ArrayList<>();
        }
        model.addAttribute("userList", userList);
        return "ex-16";
    }

    @RequestMapping("/post")
    public String post(@RequestParam("name") String name,
                       @RequestParam("comment") String comment,
                       Model model) {

        User user = new User(name, comment);
        userList.add(0, user); // 先頭に追加
        model.addAttribute("userList", userList);
        return "ex-16";
    }
}