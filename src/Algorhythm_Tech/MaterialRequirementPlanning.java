/*
* The main functional is in Generate final required quantity option.
* I've added another option that changes the "on hand inventory" individually
*
* Option details:
* 1. Check availability of parts = check the availability of the items.
* 2. Generate final required quantity = the main functionality of the program.
* 3. Change availability individually = use negative sign (e.g -50) to reduce availability
* and positive sign(e.g. 50) to increase availability.
* 4. Display data in cellular form = Display data in table form. This might not work in some cases.
* I tried this because table form is more understandable than simple way. Please select 5th option if data is not showing properly.
* 5. Displaying "inventory net off" list in simple way.
*
* Data structure used: String and int array. The solution could have been solved using a hashmap.
* But I tried the easy way instead of complicating the solution
 */


package Algorhythm_Tech;
import java.util.Scanner;

public class MaterialRequirementPlanning {
    private static Scanner scan = new Scanner(System.in);

    // Item names
    private static final String[] item = new String[]{"Seats","Frames", "Brake sets", "Brake paddles",
            "Brake cables", "Levers", "Brake Shoes", "Handlebars", "Wheels", "Tires", "Chains", "Crank set", "Paddles"};
    // total number of parts
    private static final int total_item = 13;

    // Number of items are required to manufacture a finished product
    private final static int[] item_required = new int[]{1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2};

    // Quantity of each part which is already available
    private static final int[] on_hand_inventory = new int[]{50, 80, 25, 100, 75, 60, 150, 100, 60, 80, 100, 50, 150};

    // Total number of parts required for number of bicycles
    private static int[] material_requirement = new int[13];

    // Final required quantity which is to be purchased from outside
    private static int[] inventory_net_off = new int[13];


    /*
    * Method to generate total material required for the number of bicycle
    * */
    private void findMaterialRequirement(int num_of_bicycle) {
        for(int i=0; i<total_item; i++) {

            // Second Level – to assemble a Brake set
            if(i > 2 && i<=6) {
                material_requirement[i] += 2*item_required[i]*num_of_bicycle;
            }
            else {
                // First Level – to assemble a Bicycle
                material_requirement[i] += item_required[i]*num_of_bicycle;
            }
        }
    }


    /*
    * Method to generate final required quantity which is to be purchased from outside
    * */
    private void findInventoryNetOff() {
        for(int i=0; i<total_item; i++) {

            // If item is in stock then no need to add into required list
            if(material_requirement[i]-on_hand_inventory[i] <= 0) {
                inventory_net_off[i] = 0;
            }
            else {

                // if item is out of stock then add that item in buying list i.e. in inventory net off
                inventory_net_off[i] = Math.abs(material_requirement[i]-on_hand_inventory[i]);
            }
        }
    }

    /*
    * Method to print required quantity
    */
    private void printRequirementData(int num_of_bicycle) {
        System.out.println();
        if(num_of_bicycle != 0) System.out.println("Required quantity for " + num_of_bicycle + " bicycle");
        else System.out.println("Required quantity which is to be purchased from outside: ");
        for (int i = 0; i < total_item; i++) {
            System.out.println(item[i] + " == " + inventory_net_off[i]);
        }
        System.out.println();
    }

    /*
    * Method to reduce availability individually for the item
    */
    private void reduceAvailability() {
        System.out.print("\n1. Seats" + "        2. Frames" + "   3. Brake sets" + "   4. Brake paddles\n" +
                "5. Brake cables" + " 6. Levers" + "   7. Brake Shoes" + "   8. Handlebars\n" +
                "9. Wheels" + "       10. Tires" + "   11. Chains" + "   12. Crank set" +
                "   13. Paddles\nWhich item? ");
        // which item's availability to reduce
        int item_to_reduce = scan.nextInt();
        // how much to reduce
        System.out.print("How much? ");
        int how_much = scan.nextInt();

        int previousAvailability = on_hand_inventory[item_to_reduce-1];

        /*
        * change the availability.
        * result after adding current availability and how_much is positive then change the availability
        * if user entered the quantity which is greater than the availability then
        * we have to ask whether to empty the whole availability of that item and then and add the remaining to buying list?
        * otherwise, skip the process.
        * */
        if(on_hand_inventory[item_to_reduce-1]+how_much >= 0) {
            on_hand_inventory[item_to_reduce-1] = on_hand_inventory[item_to_reduce-1]+how_much;

            /*
             * here is this case we have to change required list accordingly
             * if user adding quantity into the available stock then we have to reduce some from the required
             * as after adding there is no need to add unnecessary into required list
             * But if user is reducing the quantity and the reducing number is greater than the current availability then
             * we have to add the remaining into the required list or we have to increase required list
            */
            if(how_much>0 && how_much>inventory_net_off[item_to_reduce-1]) {
                inventory_net_off[item_to_reduce-1] = 0;
            } else {
                inventory_net_off[item_to_reduce-1] -= how_much;
            }
        } else {

            int remaining = Math.abs(how_much+on_hand_inventory[item_to_reduce-1]);
            if(remaining > 0 && on_hand_inventory[item_to_reduce-1]!=0) {
                System.out.println("Out of stock! only " + on_hand_inventory[item_to_reduce-1] + " can be removed");
                System.out.print("Would you like to reduce " + on_hand_inventory[item_to_reduce-1] + " and add " + remaining
                        + " into buying list? (1/0): ");
            }
            else {
                System.out.println("Out of stock!\n" +
                        "Would you like add \" + remaining + \" into buying list? (1/0): \"");
            }
            if(scan.nextInt() == 1) {
                on_hand_inventory[item_to_reduce-1] = 0;
                inventory_net_off[item_to_reduce-1] += remaining;
                System.out.println(previousAvailability-on_hand_inventory[item_to_reduce-1] + " availability is reduced " +
                        "and "+remaining+" added to buying list");
            }
        }
        System.out.println();
    }


    /*
    * This method is just for the alignment of the text so that all the data looks properly aligned in tabular form
    */
    private void printDataTable() {
        System.out.println("Item\t\tRequired Item\tOn Hand Inventory\tInventory Net Off\tTotal Requirement");
        for (int i = 0; i < total_item; i++) {
            /*
            * Logic behind this block is: find gap between the longest word and current word.
            * after that apply tab space accordingly
            * It may not work in all cases
            * But it is looks good.
            * */
            int temp = 13 - item[i].length();
            System.out.print(item[i]);
            if (temp == 0) System.out.print("\t");
            for (int j = 0; j * j < temp; j++) {
                System.out.print("\t");
            }

            System.out.print(item_required[i] + "\t\t\t\t" + on_hand_inventory[i] +
                    "\t\t\t\t\t" + inventory_net_off[i]+"\t\t\t\t"+material_requirement[i]);
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MaterialRequirementPlanning obj = new MaterialRequirementPlanning();

        System.out.println("\n\t\t****** Material Requirement Planning ******\n");
        while(true) {
            System.out.print("1. Check availability of parts\n" +
                    "2. Generate final required quantity\n" +
                    "3. Change availability individually (-number for reducing)\n" +
                    "4. Display data in cellular form\n"+
                    "(Please select 5th option if data is not showing properly)\n" +
                    "5. Display Requirement Data\nEnter Choice(0 to exit): ");
            int choice1 = scan.nextInt();
            switch (choice1) {
                case 1 -> {
                    System.out.println("\nAvailability of parts: ");
                    for (int i = 0; i < total_item; i++) {
                        System.out.println(item[i] + " == " + on_hand_inventory[i]);
                    }
                    System.out.println();
                }
                case 2 -> {
                    // Take input number of bicycles
                    System.out.print("Number of Bicycles: ");
                    int num_of_bicycle = scan.nextInt();

                    // Method calls
                    obj.findMaterialRequirement(num_of_bicycle);
                    obj.findInventoryNetOff();
                    obj.printRequirementData(num_of_bicycle);
                    System.out.println();
                }
                case 3 -> obj.reduceAvailability();
                case 4 -> obj.printDataTable();
                case 5 -> obj.printRequirementData(0);
                default -> System.exit(0);
            }
        }
    }
}