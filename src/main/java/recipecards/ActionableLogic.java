package recipecards;

//import org.apache.maven.shared.utils.io.FileUtils;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ActionableLogic implements RecipeActionable{
    @Override
    public void delete(String deletePath) {

        try {
            FileUtils.deleteDirectory(new File(deletePath));
        }catch(IOException e){
            System.err.println("Something went wrong. Could not delete directory");
        }
    }

    @Override
    public void copy() {

    }

    @Override
    public void rename() {

    }

    @Override
    public void move() {

    }

    @Override
    public void createFile() {

    }

    @Override
    public void createDir() {

    }

    @Override
    public void writeToFile() {

    }

    @Override
    public void readFile() {

    }
}
