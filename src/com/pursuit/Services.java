package com.pursuit;

public class Services {

    String userId = "USER";

    public void startJourney(){
        instructions();
        stravaRoutes();
        rwgpsRoutes();
        komootRoutes();
    }

    private void instructions() {
        System.out.println("\nInstructions:" +
                "\nHello, " + userId + " please see your routes.");
    }


    private void stravaRoutes(){
        LinkedListNode stravaHead = new LinkedListNode("SRT");

        LinkedList stravaList = new LinkedList(stravaHead);
        stravaList.append("CVT");
        stravaList.append("Perkiomen");
        stravaList.prepend(userId);

        stravaList.print();
    }

    private void rwgpsRoutes(){
        LinkedListNode rwgpsHead = new LinkedListNode("CVT");

        LinkedList rwgpsList = new LinkedList(rwgpsHead);
        rwgpsList.append("Perikomen");
        rwgpsList.append("Welsh Mountain");
        rwgpsList.append(userId);

        rwgpsList.print();
    }

    private void komootRoutes(){
        LinkedListNode komootHead = new LinkedListNode("SRT");

        LinkedList komootList = new LinkedList(komootHead);
        komootList.append("Welsh Mountain");
        komootList.append("Oaks to Philly");
        komootList.append(userId);
        komootList.prepend(userId);

        komootList.print();
    }



}

