import controllers.FileController;

import java.util.Scanner;

public class App {

    public static void main(String args[]){

         final FileController fileController = new FileController();

         //fileController.addManagedFolder("C:\\Users\\17404\\Pictures\\Comand-line-BG");
         //fileController.addManagedFolder("C:\\Users\\17404\\Downloads");
        //fileController.addManagedFolder("C:\\Users\\17404\\Documents");

         //fileController.createList();
        banner();
        //fileController.mainFunction();
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
    }


    public static void menu(){
        final FileController fileController = new FileController();

        fileController.addManagedFolder("C:\\Users\\17404\\Documents");
        fileController.addManagedFolder("C:\\Users\\17404\\Documents\\My Games" +
                "");

        fileController.addManagedFolder("C:\\Users\\17404\\Pictures\\Comand-line-BG");
        fileController.addManagedFolder("C:\\Users\\17404\\Downloads");



        Scanner input =  new Scanner(System.in);
        Scanner directory = new Scanner(System.in);






        boolean power = true;

        while(power) {
            int option = input.nextInt();
            switch (option) {
                case 1:
                    fileController.mainFunction();
                    break;
                case 2:
                    System.out.println("Powering Down!");
                    power = false;
                    break;
                case 3:
                    fileController.printFileCabinet();
                    break;
                case 4:

                    System.out.println("Please input the directory path.");

                    String dPath = directory.nextLine();
                    fileController.addManagedFolder(dPath);

                    System.out.println("Adding path to managed Directories!...");
                    //menuPathAdd();
                        break;

                    }
            System.out.println("****************************");
            System.out.println("* Scroll up to see output *");
            banner();
            }
            //System.out.println("****************************");
            //System.out.println("* Scroll up to see output *");
            //banner();

        }






    }












