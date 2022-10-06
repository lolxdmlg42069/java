/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
import java.util.*;
import java.math.*;

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the filing status: ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax;
        if ( status == 0 ) {
            if ( income <= 8350 ) {
                tax = income - ( income * 0.10 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 33950 ) {
                tax = income - ( income * 0.15 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 82250 ) {
                tax = income - ( income * 0.25 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 171550 ) {
                tax = income - ( income * 0.28 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 372950 ) {
                tax = income - ( income * 0.33 );
                System.out.println("Tax is " + tax);
            } else if ( income >= 372951 ) {
                tax = income - ( income * 0.35 );
                System.out.println("Tax is " + tax);
            }
        } else if ( status == 1 ) {
            if ( income <= 16700 ) {
                tax = income - ( income * 0.10 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 67900 ) {
                tax = income - ( income * 0.15 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 137050 ) {
                tax = income - ( income * 0.25 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 208850 ) {
                tax = income - ( income * 0.28 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 372950 ) {
                tax = income - ( income * 0.33 );
                System.out.println("Tax is " + tax);
            } else if ( income >= 372951 ) {
                tax = income - ( income * 0.35 );
                System.out.println("Tax is " + tax);
            }
        } else if ( status == 2 ) {
            if ( income <= 8350 ) {
                tax = income - ( income * 0.10 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 33950 ) {
                tax = income - ( income * 0.15 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 68525 ) {
                tax = income - ( income * 0.25 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 104425 ) {
                tax = income - ( income * 0.28 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 186475 ) {
                tax = income - ( income * 0.33 );
                System.out.println("Tax is " + tax);
            } else if ( income >= 186476 ) {
                tax = income - ( income * 0.35 );
                System.out.println("Tax is " + tax);
            }
        } else if ( status == 3 ) {
            if ( income <= 11950 ) {
                tax = income - ( income * 0.10 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 45500 ) {
                tax = income - ( income * 0.15 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 117450 ) {
                tax = income - ( income * 0.25 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 190200 ) {
                tax = income - ( income * 0.28 );
                System.out.println("Tax is " + tax);
            } else if ( income <= 372950 ) {
                tax = income - ( income * 0.33 );
                System.out.println("Tax is " + tax);
            } else if ( income >= 372951 ) {
                tax = income - ( income * 0.35 );
                System.out.println("Tax is " + tax);
            }
        }
    }
}
