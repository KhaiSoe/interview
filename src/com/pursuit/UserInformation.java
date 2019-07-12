package com.pursuit;

import java.util.Scanner;

public class UserInformation {

    String userId = "USER";
    int userChoiceRoutes;

    public void startJourney(){
        instructions();
        //IdInput();
    }

    private void instructions() {
        System.out.println("\nInstructions:" +
                "\nHello, " + userId + " please see your routes.");

    }

//    public void IdInput() {
//        Scanner scanner = new Scanner(System.in);
//        String userId = scanner.nextLine();
//        System.out.println("\nHello " + userId);
//    }


}

