package com.example.lab1_1_web.controller;

import com.example.lab1_1_web.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

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
        Double size = textService.getNumOfChars(text);

        ArrayList<Double> frequencies = new ArrayList<Double>();

        List<Integer> values = new ArrayList<Integer>(res.values());
        List<Character> keys = new ArrayList<Character>(res.keySet());
        for (Integer i : values) {
            frequencies.add(i / size);
        }

        int[] intValues = new int[values.size()];
        String[] stringKeys = new String[keys.size()];
        int j = 0;
        for (Integer in : values) {
            intValues[j] = in;
            j++;
        }
        j = 0;
        for (Character ch : keys) {
            stringKeys[j] = Character.toString(ch);
            j++;
        }

        Double biggest = Collections.max(frequencies);
        Double smallest = Collections.min(frequencies);

        model.addAttribute("size", size);
        model.addAttribute("result", res);
        model.addAttribute("biggest", biggest);
        model.addAttribute("smallest", smallest);
        model.addAttribute("intValues", intValues);
        model.addAttribute("stringKeys", stringKeys);

        return "/result";
    }
}

//Якщо ви гарячої літньої днини, коли й вітерець не шелесне, стомитесь у дорозі та присядете десь на горбку відпочити, то відразу вдихнете гіркувато-приємний освіжаючий дух деревію, що тут таки довкруж розсипав свої білі щитоподібні суцвіття на високих і міцних внизу брунатних стеблах. Коли ж помнете в долонях один такий щиток або потрете візерунчаті листки і глибоко вдихнете бальзамовий запах, то відчуєте, як стало вам легко, приємно, як прибувають сили. Ось ви вже й готові бадьоріше продовжувати свою путь. Ця багаторічна трав'яниста рослина надзвичайно поширена по всій Україні. Деревій можна знайти практично скрізь: у лісах і чагарниках, на галявинах і узліссях, на вкритих травою степових схилах і на високих берегах річок, у низинах і байраках, попід парканами і вздовж доріг, у лісосмугах і на сухих луках.
