package recipecards;

public class TriggerLogic implements RecipeTriggers {
    @Override
    public void newFileDetected() {
        // This method will probably have to wait until I have my database working so that it can compare
        //the contents of an old scan to a new scan
    }




    @Override
    public void interval() {
//this will probably be removed and handled by the TriggerCards class.
        System.out.println("interval will not be used!");
    }

    @Override
    public void atTime() {
            System.out.println("");
    }

    @Override
    public void ifTrue() {

    }

    @Override
    public void ifFalse() {

    }

    @Override
    public void numberOfFiles() {

    }

    @Override
    public void filesLessOrEqualTo(){

    }

    @Override
    public void filesGreaterOrEqualTo(){

    }

    @Override
    public void ifFileType() {

    }

    @Override
    public void onIncrease() {

    }

    @Override
    public void onDecrease() {

    }

    @Override
    public void isEmpty() {

    }

    @Override
    public void isNotEmpty() {

    }

    @Override
    public void ifSize() {

    }

    @Override
    public void nameMatch() {

    }

    @Override
    public void noMatch() {

    }
}
