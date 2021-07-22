package com.company.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        Map<Character,Integer> map = new HashMap<>();
        char[] cArray = string.toCharArray();
        for(Character item: cArray){
            if(map.get(item) == null){
                map.put(item,1);
            }
            else{
                Integer count = map.get(item);
                map.put(item,count+1);
            }
        }
        for(int i =0; i< cArray.length;i++){
            if(map.get(cArray[i]) ==1){
                return i;
            }
        }
        return -1;
    }
}
