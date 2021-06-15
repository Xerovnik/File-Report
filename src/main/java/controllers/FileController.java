package controllers;


import blues.FileBluePrint;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Iterator;


public class FileController {



    HashSet<String> managedFolders = new HashSet<String>();
    HashSet<String> extensions = new HashSet<String>();
    HashSet<FileBluePrint> fileCabinet = new HashSet<FileBluePrint>();
    Iterator<FileBluePrint> it = fileCabinet.iterator();



    String filePath;

    File[] path;


    public void mainFunction(){

        try {
            for (String mFolder : managedFolders) {

                path = new File(mFolder).listFiles();
                filePath = mFolder;
                createList();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
        }catch(NullPointerException e){
            System.err.println("Something went wrong");
        }

    }





    public void addManagedFolder(String addPath){
         managedFolders.add(addPath);
    }

    public void printFileCabinet(){
        for(FileBluePrint blue: fileCabinet){
            System.out.println(blue); // look into printing formatted string for readability
        }

    }






    public void createList(){

        int fileCount = 0;
        int directoryCount = 0;

        for(File file : path){
            if(file.isDirectory()){
                System.out.println("Directory: " + file.getName() + " <------------------------------------- FOLDER");

                directoryCount++;
            }else{
                System.out.println("File: " + file.getName());
                extensions.add(getExt(file.getName()));

                FileBluePrint addFile = new FileBluePrint();

                Path fPath = Paths.get(String.valueOf(file));

                addFile.setName(file.getName());
                addFile.setFileType(getExt(String.valueOf(file)));
                addFile.setLocation(String.valueOf(file));


                try {
                    addFile.setSize(Files.size(fPath));
                    BasicFileAttributes attr = Files.readAttributes(fPath, BasicFileAttributes.class);
                    addFile.setCreated(attr.creationTime());
                    addFile.setAccessed(attr.lastAccessTime());
                    addFile.setModified(attr.lastModifiedTime());
                    addFile.setReadOnly(Files.isWritable(fPath));
                    addFile.setHidden(Files.isHidden(fPath));

                }catch(IOException e){
                    e.printStackTrace();
                }

                fileCabinet.add(addFile);
                fileCount++;
            }
        }

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("LOCATION: " + filePath);
        System.out.println("");
        System.out.println("File Types:" + "(" + extensions.size() + ")-" + extensions);
        System.out.println("File Count: " + fileCount);
        System.out.println("Sub Folder Count: " + directoryCount);
        System.out.println("--------------------------------------------------------------------------");
        extensions.clear();


        while(it.hasNext()){
            System.out.println(it.next());
        }

    }



    public String getExt(String fileName){
        return fileName.substring(fileName.lastIndexOf(".")+1);
    }





}
