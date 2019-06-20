package machine;
import java.sql.SQLOutput;
import java.util.*;
public class CoffeeMachine
{
    public static int money=550;
    public static int water=400;
    public static int milk=540;
    public static int beans=120;
    public static int cups=9;
    public static boolean hoh=true;
    public static Scanner s = new Scanner(System.in);
    public static boolean bol=true;
    public static String b;
    public static String a;
    public static void main(String[] args) {
        while (hoh == true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            bol=true;
            System.out.println(b = s.next());
            if (b.equalsIgnoreCase("buy")) {
                while (bol) {
                    System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    System.out.println(a = s.next());
                    if (a.equalsIgnoreCase("1")) {
                        if (water >= 250 && beans >= 16 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            buy(a);
                            bol = false;
                            break;
                        } else if (water < 250 && beans >= 16 && cups >= 1) {
                            System.out.println("Sorry, not enough water!");
                            bol = false;
                            break;
                        } else if (water >= 250 && beans < 16 && cups >= 1) {
                            System.out.println("Sorry, not enough coffee beans!");
                            bol = false;
                            break;
                        } else if (water >= 250 && beans >= 16 && cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                            bol = false;
                            break;
                        }
                    } else if (a.equalsIgnoreCase("2")) {
                        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            buy(a);
                            bol = false;
                            break;
                        } else if (water < 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                            System.out.println("Sorry, not enough water!");
                            bol = false;
                            break;
                        } else if (water >= 350 && milk < 75 && beans >= 20 && cups >= 1) {
                            System.out.println("Sorry, not enough milk!");
                            bol = false;
                            break;
                        } else if (water >= 350 && milk >= 75 && beans < 20 && cups >= 1) {
                            System.out.println("Sorry, not enough coffee beans!");
                            bol = false;
                            break;
                        } else if (water >= 350 && milk >= 75 && beans >= 20 && cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                            bol = false;
                            break;
                        }
                    } else if (a.equalsIgnoreCase("3")) {
                        if (water >= 350 && milk >= 75 && beans >= 12 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            buy(a);
                            bol = false;
                            break;
                        } else if (water < 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                            System.out.println("Sorry, not enough water!");
                            bol = false;
                            break;
                        } else if (water >= 200 && milk < 100 && beans >= 12 && cups >= 1) {
                            System.out.println("Sorry, not enough milk!");
                            bol = false;
                            break;
                        } else if (water >= 200 && milk >= 100 && beans < 12 && cups >= 1) {
                            System.out.println("Sorry, not enough coffee beans!");
                            bol = false;
                            break;
                        } else if (water >= 200 && milk >= 100 && beans >= 12 && cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                            bol = false;
                            break;
                        }
                    } else if (a.equalsIgnoreCase("back")) {
                        bol = false;
                        break;
                    }
                }
            } else if (b.equalsIgnoreCase("take")) {
                take();
            } else if (b.equalsIgnoreCase("fill")) {
                int waterf;
                int milkf;
                int beansf;
                int cupsf;
                System.out.print("Write how many ml of water do you want to add: ");
                System.out.println(waterf = s.nextInt());
                System.out.print("Write how many ml of milk do you want to add: ");
                System.out.println(milkf = s.nextInt());
                System.out.print("Write how many grams of coffee beans do you want to add: ");
                System.out.println(beansf = s.nextInt());
                System.out.print("Write how many disposable cups of coffee do you want to add: ");
                System.out.println(cupsf = s.nextInt());
                fill(waterf, milkf, beansf, cupsf);
            } else if (b.equalsIgnoreCase("remaining")) {
                remaining();
            } else if (b.equalsIgnoreCase("exit")) {
                exit();
            }
        }
    }
    public static void buy(String a){
        if (a.equalsIgnoreCase("1")) {
            money += 4;
            water -= 250;
            beans -= 16;
            cups -= 1;
        } else if (a.equalsIgnoreCase("2")) {
            money += 7;
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
        } else if (a.equalsIgnoreCase("3")) {
            money += 6;
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
        }
    }
    public static void fill( int waterf, int milkf, int beansf, int cupsf){
        water += waterf;
        milk += milkf;
        beans += beansf;
        cups += cupsf;
    }
    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
    public static void exit() {
        hoh=false;
    }
}