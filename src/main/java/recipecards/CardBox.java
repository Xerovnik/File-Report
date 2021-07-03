package recipecards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardBox {

    //this class will be used to store all of the final recipes

    //Map<Object,TriggerCard> cardBox = new HashMap();



    //Recipe Map Stores a Recipe name as the key and an Array list with each index in it containing an integer that is equal to
    //one of the trigger card Keys to the runnable function
    Map<String, ArrayList> recipe = new HashMap<>();

    private String recipeName;

    public void createNewRecipe(){
        System.out.println("Please Type a name for your new recipe");
        System.out.println("Type 'abort' any time to cancel");
        Scanner input = new Scanner(System.in);
        recipeName = input.nextLine();


        System.out.println("Please Select a condition for your recipe card");
        System.out.println();
        selectionMenu();
        input.nextLine();


    }

    public void selectionMenu(){
        System.out.println("███████████████████████████████████████████████████████████████████████████████████████████");
        System.out.println("1) At Time -- Trigger at a particular time. ");
        //The if conditions may need more development before they can be used in the recipes
        System.out.println("2) If True -- Trigger only if one or more conditions are true. ");
        System.out.println("3) If False -- Trigger only if one or more conditions return false.");
        System.out.println("4) Number of Files -- Triggers if the number of files equals X number.");
        System.out.println("5) Number of Files -- Triggers if the number of files equals X number.");
        System.out.println("6) Number of Files -- Triggers if the number of files equals X number.");
        System.out.println("7) If File Type -- Trigger if the file in question is of the specified type.");
        System.out.println("8) On Increase -- Triggers upon the number of files in a directory increase.");
        System.out.println("9) On Decrease -- Triggers upon the number of files in a directory decreasing.");
        System.out.println("10) Is Empty -- Triggers if The directory is empty.");
        System.out.println("11) Is Not Empty -- Trigger if the directory is not empty.");
        // need to add methods for file size greater than / less than
        System.out.println("12) If Size -- Trigger if a File / directory is Of a particular size.");
        System.out.println("13) Name Match -- if a file / directory matches a specified String.");
        System.out.println("14) Name No Match -- Trigger if no file / directory matches a specified String.");
        System.out.println("███████████████████████████████████████████████████████████████████████████████████████████");




    }





}
