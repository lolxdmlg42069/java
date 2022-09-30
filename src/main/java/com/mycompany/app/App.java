/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
import java.util.*;

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int fortune = 1 + rand.nextInt(10);
        if ( fortune == 1 ) {
            System.out.println("my sources tell me that you are sus");
        } else if ( fortune == 2 ) {
            System.out.println("are you gay!?");
        } else if ( fortune == 3 ) {
            System.out.println("b-baka!");
        } else if ( fortune == 4 ) {
            System.out.println("amogus");
        } else if ( fortune == 5 ) {
            System.out.println("SUSSY SUS SUS?");
        } else if ( fortune == 6 ) {
            System.out.println("im too tired to write the rest of the code");
        } else if ( fortune == 7 ) {
            System.out.println("im too tired to write the rest of the code");
        } else if ( fortune == 8 ) {
            System.out.println("im too tired to write the rest of the code");
        } else if ( fortune == 9 ) {
            System.out.println("im too tired to write the rest of the code");
        } else if ( fortune == 10 ) {
            System.out.println("im too tired to write the rest of the code");
        } else {
            System.out.println("STOP TRYING TO HACK MY PROGRAM");
        }
    }
}
