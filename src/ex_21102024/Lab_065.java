package ex_21102024;

import java.util.Scanner;

public class Lab_065 {
    public static void main(String[] args) {
            Scanner browser = new Scanner(System.in);
            System.out.println("Enter the browser");
            String browser_name = browser.next();
            browser_name = browser_name.toLowerCase();
            switch(browser_name){
                case "chrome":
                    System.out.println("enter the chrome browser");
                    break;
                case "edge":
                    System.out.println("enter the edge browser");
                    break;
                case "firefox":
                    System.out.println("enter the firefox browser");
                    break;
                case "safari":
                    System.out.println("enter the safari browser");
                    break;
                default:
                    System.out.println("no browser found");
            }
        }
    }


