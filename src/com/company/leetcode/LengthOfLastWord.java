package com.company.leetcode;

public class LengthOfLastWord {
   // lengthOfLastWord("berka bura soner");
   public static void main(String[] args) {
       System.out.println(
               lengthOfLastWord("berkay bura soner")+"\n"+
               lengthOfLastWord(" ")+"\n"+
               lengthOfLastWord("kenan ulas soyubey")+"\n"+
               lengthOfLastWord("ahmet burak ozyurt")+"\n"+
               lengthOfLastWord("berkay burak")+"\n"+
               lengthOfLastWord("saim ilker atabay"));
   }
    public static int lengthOfLastWord(String s) {
            // baştan sonran boşluk varsa siler.
           s = s.trim();
           // boşluğun olduğu son indexi alır ve bir arttırıp kelimemizin ilk indexini alır .
           //berkay soner 6 boşluk index s başlangıç index 7
           //13-6
           int last = s.lastIndexOf(' ')+1;
           //17-12 = 5
           return s.length()-last;
    }
}
