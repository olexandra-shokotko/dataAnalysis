package com.example.lab1_1_web.controller;

import com.example.lab1_1_web.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private TextService textService;

    @GetMapping
    public String main(Map<String, Object> model) {
        return "main";
    }

    @PostMapping("/count")
    public String count(@RequestParam String text,
                        Model model) {
        Map<Character, Integer> res = textService.getResult(text);
        int size = textService.getNumOfChars(text);
        ArrayList<Double> frequencies = new ArrayList<Double>();
        int obj;
        for (Map.Entry entry : res.entrySet()) {
            frequencies.add(Double.valueOf((int)entry.getValue() / size));
        }

        model.addAttribute("size", size);
        model.addAttribute("result", res);
        model.addAttribute("freq", frequencies);

        return "/result";
    }
}
