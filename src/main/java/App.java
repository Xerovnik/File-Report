import controllers.FileController;
import recipecards.ActionableLogic;
import recipecards.CardBox;
import recipecards.TriggerCard;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;
import java.util.Timer;

public class App {

    public static void main(String[] args){

         //final FileController fileController = new FileController();



        banner();

        menu();




    }


    public static void banner(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("███████╗██╗██╗     ███████╗    ██████╗ ███████╗██████╗  ██████╗ ██████╗ ████████╗");
        System.out.println("██╔════╝██║██║     ██╔════╝    ██╔══██╗██╔════╝██╔══██╗██╔═══██╗██╔══██╗╚══██╔══╝");
        System.out.println("█████╗  ██║██║     █████╗      ██████╔╝█████╗  ██████╔╝██║   ██║██████╔╝   ██║   ");
        System.out.println("██╔══╝  ██║██║     ██╔══╝      ██╔══██╗██╔══╝  ██╔═══╝ ██║   ██║██╔══██╗   ██║   ");
        System.out.println("██║     ██║███████╗███████╗    ██║  ██║███████╗██║     ╚██████╔╝██║  ██║   ██║   ");
        System.out.println("╚═╝     ╚═╝╚══════╝╚══════╝    ╚═╝  ╚═╝╚══════╝╚═╝      ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ");
        System.out.println("                                                                  alpha v 0.8    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        System.out.println("1) Scan Managed Folders");
        System.out.println("2) Exit");
        System.out.println("3) print folder objects");
        System.out.println("4) Add managed directory");
        System.out.println("5) Delete A Directory");
        System.out.println("6) Create New Recipe");
    }


    public static void menu(){
        final FileController fileController = new FileController();

        fileController.addManagedFolder("C:\\Users\\17404\\Documents");

        fileController.addManagedFolder("C:\\Users\\17404\\Documents\\My Games");

        fileController.addManagedFolder("C:\\Users\\17404\\Pictures\\Comand-line-BG");

        fileController.addManagedFolder("C:\\Users\\17404\\Downloads");



        Scanner input =  new Scanner(System.in);
        //Scanner directory = new Scanner(System.in);
        ActionableLogic test = new ActionableLogic();

        final TriggerCard triggerCard = new TriggerCard();


        Timer timer = new Timer();
        timer.schedule(triggerCard, 1, 60000);





        boolean power = true;


        while(power) {
            int option = input.nextInt();
            switch (option) {
                case 1:
                    fileController.mainFunction();
                    System.out.println("       ***********************************************************************");
                    System.out.println("       *                      Scroll up to see output                        *");
                    System.out.println("       ***********************************************************************");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("       ***********************************************************************");
                    System.out.println("       *                      How Could you?.. Goodbye Crewel world          *");
                    System.out.println("       ***********************************************************************");
                    power = false;
                    input.close();
                    timer.cancel();
                    break;
                case 3:
                    //this needs to have an option to print just the objects of a particular managed folder.
                    fileController.printFileCabinet();
                    System.out.println("       ***********************************************************************");
                    System.out.println("       *                      Scroll up to see output                        *");
                    System.out.println("       ***********************************************************************");
                    break;
                case 4:

                    JFileChooser fc = new JFileChooser();
                    fc.setMultiSelectionEnabled(false);

                    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int returnVal = fc.showOpenDialog(null);
                    if(returnVal == JFileChooser.APPROVE_OPTION){
                        File file = fc.getSelectedFile();
                        String dPath = file.getAbsolutePath();
                        fileController.addManagedFolder(dPath);
                        System.out.println("Adding \"" + dPath + "\" to managed Directories!...");
                    }else{
                        System.out.println("       ***********************************************************************");
                        System.out.println("       *                      Beep.. Boop... Aborting!                       *");
                        System.out.println("       ***********************************************************************");

                    }




                        break;

                case 5:
                    System.out.println("Please input the directory path.");
                    Scanner deleteMe = new Scanner(System.in);
                    String toDelete = deleteMe.nextLine();
                    test.delete(toDelete);

                    System.out.println("The Directory Has Been Destroyed! You Monster!");
                    //deleteMe.close();
                    break;

                case 6:
                    CardBox cardBox = new CardBox();
                    cardBox.createNewRecipe();


                    }

            banner();
            }


        }










    }












