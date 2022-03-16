package com.detroitlabs.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String testInfo (){
        return "<h1 style=\"background-color:DodgerBlue;\">Amanda created this test to check background colors!</h1>"+
                "<br><h1 style=\"background-color:DarkOrange;\">Amanda created this test to check background colors!</h1>"+
                "<br><h1 style=\"background-color:DeepPink;\">Amanda created this test to check background colors!</h1>";
    }
}
