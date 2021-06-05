/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class SelfCheckout {
    final double taxRate = .055;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        SelfCheckout myApp = new SelfCheckout();
        myApp.output();
    }

    private int item1$Prompt() {
        System.out.print("Enter the price of item 1: ");
        return Integer.parseInt(in.nextLine());
    }

    private int item1qPrompt() {
        System.out.print("Enter the quantity of item 1: ");
        return Integer.parseInt(in.nextLine());
    }

    private int item2$Prompt() {
        System.out.print("Enter the price of item 2: ");
        return Integer.parseInt(in.nextLine());
    }

    private int item2qPrompt() {
        System.out.print("Enter the quantity of item 2: ");
        return Integer.parseInt(in.nextLine());
    }

    private int item3$Prompt() {
        System.out.print("Enter the price of item 3: ");
        return Integer.parseInt(in.nextLine());
    }

    private int item3qPrompt() {
        System.out.print("Enter the quantity of item 3: ");
        return Integer.parseInt(in.nextLine());
    }

    private double[] total(int p1, int q1, int p2, int q2, int p3, int q3) {
        double subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        return new double[]{subtotal, tax, total};
    }

    private void output() {
        double[] nums = total(item1$Prompt(), item1qPrompt(), item2$Prompt(), item2qPrompt(), item3$Prompt(), item3qPrompt());
        String subtotal = "Subtotal: $%.2f\n";
        String tax = "Tax: $%.2f\n";
        String total = "Total: $%.2f\n";
        System.out.printf(subtotal + tax + total, nums[0], nums[1], nums[2]);
    }
}
