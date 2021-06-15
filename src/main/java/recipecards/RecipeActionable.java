package recipecards;

public interface RecipeActionable {

    //Actionable - Actionables are methods that are executed based on the the triggering of a trigger.



    public void delete(String deletePath); //Delete a file or folder

    public void copy(); //Copy a file or folder

    public void rename(); //Rename file or folder

    public void move(); //Move file or folder

    public void createFile(); //Create a file

    public void createDir(); //Create a directory

    public void writeToFile(); //writes a String to a .txt file or .csv file

    public void readFile(); //Read from .txt or .csv


}
