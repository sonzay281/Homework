package com.leapfrog.cube;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    public static void main(String[] args) {
        double length = 0, breadth = 0, height, total = 0;
        int cal_option = 0;
        Scanner input = new Scanner(System.in);
        ask_user();
        int option = input.nextInt();
           switch (option) {
                case 1:
                    rectangle(length, breadth, cal_option, total);
                    break;
                case 2:
                    cube(length, cal_option, total);
                    break;
                case 3:
                    square(length, cal_option, total);
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;
            }

        }
    
    private static void ask_user() {

        System.out.println("Please select one of the following(1-3): ");
        System.out.println("1.Rectangle \t 2. Cube \t 3.Square ");
    }

    private static void rectangle(double length, double breadth, int cal_option, double total) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght:");
        length = input.nextInt();
        System.out.println("Please enter the breadth:");
        breadth = input.nextInt();
        System.out.println("Please choose what you want to calculate");
        System.out.println("\t1.Area \t 2.Perimeter");
        cal_option = input.nextInt();
        switch (cal_option) {
            case 1:
                total = length * breadth;
                break;

            case 2:
                total = 2 * (length + breadth);
                break;

            default:
                System.out.println("Invalid entry.");
                break;
        }
        System.out.println("Calculation......");
        System.out.println("Output:" + total);
    }

    private static void cube(double length, int cal_option, double total) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght:");
        length = input.nextInt();
        System.out.println("Please choose what you want to calculate?");
        System.out.println("\t1.Area \t 2.Perimeter \t 3.Volume");

        cal_option = input.nextInt();

        switch (cal_option) {
            case 1:
                total = 6 * length * length;
               break;

            case 2:
                total = 12 * length;
                break;
            case 3:
                total = length * length * length;
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
        System.out.println("Calculation......");
        System.out.println("Output:" + total);

    }

    private static void square(double length, int cal_option, double total) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght:");
        length = input.nextInt();
        System.out.println("What you want to calculate?");
        System.out.println("\t1.Area \t 2.Perimeter");
        cal_option = input.nextInt();
        switch (cal_option) {
            case 1:
                total = length * length;
                break;
            case 2:
                total = 4 * length;
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
        System.out.println("Calculation......");
        System.out.println("Output:" + total);

    }
}
