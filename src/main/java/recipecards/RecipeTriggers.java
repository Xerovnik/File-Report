package recipecards;

public interface RecipeTriggers {


    //Triggers - triggers are events that set in motion our recipe chain!

    public void newFileDetected(); // trigger if new file detected at location. (String *I THINK*)

    public void interval(); //Trigger every time X amount of time passes.

    public void atTime(); //Trigger action at set time/date/year

    public void ifTrue(); //Trigger action if conditions evaluate to true. for example interval has passed and there is a new file at location. (boolean)

    public void ifFalse(); //Trigger if condition evaluates false

    public void numberOfFiles(); //Trigger action if number of files meets a certain threshold. (int)

    public void ifFileType(); //Trigger if File passed is of a particular type. (boolean)

    public void onIncrease(); //Trigger if number of files / folders increases (int)

    public void onDecrease(); //Trigger if number of files / folders decreases (int)

    public void isEmpty(); //Trigger if Folder is empty

    public void isNotEmpty(); //Trigger if Folder is not empty

    public void ifSize(); //Trigger if a file size is X size greater / smaller (Long)

    public void nameMatch(); //Trigger if file / folder name matches

    public void noMatch(); //Trigger if no file / folder match






}
