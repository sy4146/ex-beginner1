package com.example.ex_beginner1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam02.html";
    }

    @RequestMapping("/calculate")
    public String calculate(String num1,String num2,HttpSession session) {
        int num01 = Integer.parseInt(num1);
        int num02 = Integer.parseInt(num2);
        int sum = num01 + num02;

        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("sum", sum);

        return "exam02-result.html";
    }

    @RequestMapping("/toresult2")
    public String toresult2() {
        // 結果画面2にフォワード
        return "exam02-result2";
    }

}
