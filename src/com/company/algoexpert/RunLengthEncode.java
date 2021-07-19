package com.company.algoexpert;

public class RunLengthEncode {

    public String runLengthEncoding(String string) {
        StringBuilder sb = new StringBuilder();
        int currentLength = 1;

        for (int i = 1; i < string.length(); i++) {
            char previous = string.charAt(i-1);
            char current = string.charAt(i);
            if(previous != current || currentLength ==9){
                sb.append(Integer.toString(currentLength));
                sb.append(previous);
                currentLength=0;
            }
            currentLength +=1;

        }
        sb.append(Integer.toString(currentLength));
        sb.append(string.charAt(string.length()-1));

        return sb.toString();
    }
}
