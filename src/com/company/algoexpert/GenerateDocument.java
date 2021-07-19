package com.company.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {
        if(document.equals("")) return true;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        boolean isEqual = false;
        char[] chars = characters.toCharArray();
        char[] chars2 = document.toCharArray();
        for(Character item : chars){
            if(map.get(item) == null){
                map.put(item,1);
            }
            else{
                Integer count = map.get(item);
                map.put(item,count+1);
            }
        }
        if(map.containsKey(' ')){
            map.remove(' ');
        }
        for(Character item : chars2){
            if(map2.get(item) == null){
                map2.put(item,1);
            }
            else{
                Integer count = map2.get(item);
                map2.put(item,count+1);
            }
        }
        if(map2.containsKey(' ')){
            map2.remove(' ');
        }
        if(map.size() == map2.size()){
            for(Map.Entry<Character,Integer> item : map.entrySet()){
                Character c = item.getKey();
                Integer count = item.getValue();
                if(map2.containsKey(c) && map.get(c) == map2.get(c)){
                    isEqual = true;
                }
                else if(!(map2.containsKey(c)) && map.get(c) != map2.get(c)){
                    isEqual = false;
                }
            }
        }

        return isEqual;
    }
}
