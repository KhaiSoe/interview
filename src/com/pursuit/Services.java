package com.pursuit;

import java.util.*;

public class Services implements UserInformation {

    String userId = "USER";
    String userInput;

    ArrayList<String> stravaList = new ArrayList<>(Arrays.asList("STR", "CVT", "Perkiomen"));
    ArrayList<String> rwgpsList = new ArrayList<>(Arrays.asList("CVT", "Perkiomen", "Welsh Mountain"));
    ArrayList<String> komootList = new ArrayList<>(Arrays.asList("STR", "Welsh Mountain", "Oaks to Philly"));


    public void startJourney() {
        instructions();
        stravaRoutes();
        rwgpsRoutes();
        komootRoutes();
        allRoutes();
        uniqueRoutes();
        userInput();
        allUserRoutes(userInput);
        userRoutesByService(userInput, stravaList, komootList);
    }

    private void instructions() {
        System.out.println("\nInstructions:" +
                "\nHello, " + userId + " please see your routes.");
    }

    private void stravaRoutes() {
        stravaList.add(0, userId);
        System.out.println(stravaList);
    }

    private void rwgpsRoutes() {
        rwgpsList.add(userId);
        System.out.println(rwgpsList);
    }

    private void komootRoutes() {
        komootList.add(userId);
        komootList.add(0, userId);
        System.out.println(komootList);
    }

    public List allRoutes() {
        ArrayList<String> allList = new ArrayList<>();
        allList.addAll(stravaList);
        allList.addAll(rwgpsList);
        allList.addAll(komootList);
        System.out.println(allList);
        return allList;
    }

    public Set uniqueRoutes() {
        HashSet<String> uniqueList = new HashSet<>();
        for (int i = 0; i < stravaList.size(); i++) {
            uniqueList.addAll(stravaList);
        }

        for (int i = 0; i < rwgpsList.size(); i++) {
            uniqueList.addAll(rwgpsList);
        }

        for (int i = 0; i < komootList.size(); i++) {
            uniqueList.addAll(komootList);
        }

        System.out.println(uniqueList);
        return uniqueList;
    }

    @Override
    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
    }

    @Override
    public List allUserRoutes(String userInput) {
        ArrayList<String> allUserList = new ArrayList<>();
        if(userInput.equals(userId)){
            allUserList.addAll(stravaList);
            allUserList.addAll(rwgpsList);
            allUserList.addAll(komootList);
        }
        return allUserList;

    }

    @Override
    public List userRoutesByService(String userInput, List<String> stravaList, List<String> komootList) {

        ArrayList<String> subUserList = new ArrayList<>();
        if(userInput.equals(userId)){
            subUserList.addAll(stravaList);
            subUserList.addAll(komootList);
        }
        return subUserList;
    }

}



