package com.pursuit;

import java.util.Scanner;

public class UserInformation {

    Scanner scanner = new Scanner(System.in);
    String userId;
    int userChoiceRoutes;

    public void startJourney(){
        instructions();
        IdInput();
    }


    private void instructions() {
        System.out.println("\nInstructions:" +
                "\nPlease enter your userId to see your routes.");

    }

    private void IdInput() {
        userId = scanner.nextLine();
        System.out.println("\nHello " + userId);
    }



}
