package com.company.algoexpert;

import java.util.*;
import java.util.stream.Collectors;

public class TournamentWinner {
    public static void main(String[] arg) {

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list1.add("HTML"); list1.add("C#");
        list2.add("C#"); list2.add("Python");
        list3.add("Python"); list3.add("HTML");

        competitions.add(list1); competitions.add(list2); competitions.add(list3);

        ArrayList<Integer> results = new ArrayList<>();

        results.add(0); results.add(0); results.add(1);

        //System.out.println(tournamentWinnerFirst(competitions,results));
        System.out.println(tournamentWinnerSecond(competitions,results));
    }

    public static String tournamentWinnerFirst(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        if (competitions.isEmpty() && results.isEmpty()) return "";

        ArrayList<String> winnerList = new ArrayList<>();

        for (int i = 0; i < competitions.size(); i++) {
            if(results.get(i) ==0){
                winnerList.add(competitions.get(i).get(1));

            }else if(results.get(i)==1){
                winnerList.add(competitions.get(i).get(0));
            }
        }
        TreeMap<String,Long> tree = winnerList.stream()
                .collect(Collectors.groupingBy(a->a, TreeMap::new,Collectors.counting()));

        Set<Map.Entry<String,Long>> entries = tree.entrySet();

        Map.Entry<String,Long> maxEntry = null;

        for(Map.Entry<String,Long> entry : entries){
           if(maxEntry ==null ||entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    private static int HOME_TEAM_WON  = 1;

    public static String tournamentWinnerSecond(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        String currentBestTeam ="";
        HashMap<String,Integer> scores = new HashMap<>();

        scores.put(currentBestTeam,0);

        for(int idx = 0; idx< competitions.size(); idx++){
            ArrayList<String> competition= competitions.get(idx);
            int result = results.get(idx);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winnerTeam = (result==HOME_TEAM_WON) ? homeTeam : awayTeam;

            updateScore(winnerTeam,3,scores);

            if(scores.get(winnerTeam) > scores.get(currentBestTeam)){
                currentBestTeam = winnerTeam;
            }
        }
        return  currentBestTeam;
    }
    public static void updateScore(String team, int point, HashMap<String,Integer> scores){
        if(!scores.containsKey(team)){
            scores.put(team,0);
        }
        scores.put(team,scores.get(team)+point);

    }

}
