package com.example.lab1_1_web.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TextService {
    public Map<Character, Integer> getResult(String text) {
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = text.toCharArray();

        for (char c : strArray) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public Double getNumOfChars(String text) {
        char[] strArray = text.toCharArray();
        Double count = 0.0;

        for (char c : strArray) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            count++;
        }

        return count;
    }
}
