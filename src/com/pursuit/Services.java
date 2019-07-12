package com.pursuit;

import java.util.*;

public class Services {

    String userId = "USER";

    ArrayList<String> stravaList = new ArrayList<>(Arrays.asList("STR", "CVT", "Perkiomen"));
    ArrayList<String> rwgpsList = new ArrayList<>(Arrays.asList("CVT", "Perkiomen", "Welsh Mountain"));
    ArrayList<String> komootList = new ArrayList<>(Arrays.asList("STR", "Welsh Mountain", "Oaks to Philly"));


    public void startJourney() {
        instructions();
        stravaRoutes();
        rwgpsRoutes();
        komootRoutes();
        allList();
        uniqueRoutes();
    }

    private void instructions() {
        System.out.println("\nInstructions:" +
                "\nHello, " + userId + " please see your routes.");
    }


    private void stravaRoutes() {
        stravaList.add(0, userId);
        System.out.println(stravaList);
    }

    private void rwgpsRoutes(){
        rwgpsList.add(userId);
        System.out.println(rwgpsList);
    }

    private void komootRoutes(){
        komootList.add(userId);
        komootList.add(0, userId);
        System.out.println(komootList);
    }

    public List allList(){
        ArrayList<String> allList = new ArrayList<>();
        allList.addAll(stravaList);
        allList.addAll(rwgpsList);
        allList.addAll(komootList);
        System.out.println(allList);
        return allList;
    }

    public Set uniqueRoutes(){
        HashSet<String> uniqueList = new HashSet<>();
        for(int i = 0; i < stravaList.size(); i++){
            uniqueList.addAll(stravaList);
        }

        for(int i = 0; i < rwgpsList.size(); i++){
            uniqueList.addAll(rwgpsList);
        }

        for(int i = 0; i < komootList.size(); i++){
            uniqueList.addAll(komootList);
        }

        System.out.println(uniqueList);
        return uniqueList;
    }


}


