package com.company.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SunsetViews {
    public static void main(String[] args) {
      int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2}; String direction = "WEST";
      System.out.println(sunsetViews(buildings,direction));
        //TestCase1();

    }
    public static void TestCase1() {
        int[] buildings = new int[] {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "WEST";
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        var actual = new SunsetViews().sunsetViews(buildings, direction);
        assert(expected.equals(actual));
        assert(expected.equals(actual));
    }
// My Code is working but Algo did not understand or something my fault :D
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        int i =0,j=0;
        int x=buildings.length-1,y =buildings.length-1;
        ArrayList<Integer> arrayListEast = new ArrayList<Integer>();
        ArrayList<Integer> arrayListWest = new ArrayList<Integer>();

        int maxEast = Integer.MIN_VALUE;
        int maxWest = Integer.MIN_VALUE;

        while(y>=0 && direction.equals("EAST")){
            if(buildings[y] > maxEast){
                maxEast= buildings[y];
                arrayListEast.add(y);
            }
            y--;
        }
        while(j<=buildings.length-1 && direction.equals("WEST")){
            if(buildings[j] > maxWest){
                maxWest= buildings[j];
                arrayListWest.add(j);
            }
            j++;
        }

        if(direction.equals("EAST")) Collections.reverse(arrayListEast);


        return (direction.equals("EAST")) ? arrayListEast : arrayListWest;
    }


    // This is AlgoExpert's solution still does not work

    public static ArrayList<Integer> sunsetViews2(int[] buildings, String direction) {
        ArrayList<Integer> arrayOutput = new ArrayList<Integer>();
        int startIdx,step;
        if(direction == "WEST"){
            startIdx =0;
            step=1;}
        else {
            startIdx =buildings.length-1;
            step=-1; }
        int idx = startIdx;
        int runningMaxHeight =0;

        while(idx >=0 && idx < buildings.length){
              int buildingHeight = buildings[idx];

              if(buildingHeight > runningMaxHeight){
                  arrayOutput.add(idx);
              }
              runningMaxHeight = Math.max(runningMaxHeight,buildingHeight);
              idx += step;
        }
        if(direction == "EAST") {
            Collections.reverse(arrayOutput);
            return arrayOutput;
        }
        return arrayOutput;
    }

    //With Stack
        public static ArrayList<Integer> sunsetViews3(int[] buildings, String direction) {
            ArrayList<Integer> candidateBuildings = new ArrayList<>();
            int startIdx= buildings.length-1,step=-1;
            if(direction.equals("EAST")){
                startIdx = 0;
                step=1;
            }
            int idx = startIdx;

            while(idx >= 0 && idx< buildings.length){
                int buildingHeight = buildings[idx];

                while(candidateBuildings.size() > 0
                        &&  buildings[candidateBuildings.get(candidateBuildings.size()-1)] <= buildingHeight){
                    candidateBuildings.remove(candidateBuildings.size()-1);

                }
                candidateBuildings.add(idx);
                idx +=step;

            }

            if(direction.equals("WEST")) {
                Collections.reverse(candidateBuildings);
            }
            return candidateBuildings;
        }


}
