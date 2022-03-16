package com.detroitlabs.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DateTimeController {
    @RequestMapping("/datetime")
    @ResponseBody
    public String dateTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateTimeString = formatter.format(now);
        return dateTimeString;
    }
}
