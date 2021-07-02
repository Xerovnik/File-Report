package recipecards;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

public class TriggerCard extends TimerTask {

    int interval = 1;
    int trigger02 = 2;
    int trigger03 = 3;
    int trigger04 = 4;
    int trigger05 = 5;
    int trigger06 = 6;
    int trigger07 = 7;
    int trigger08 = 8;
    int trigger09 = 9;
    int trigger10 = 10;
    int trigger11 = 11;
    int trigger12 = 12;
    int trigger13 = 13;
    int trigger14 = 14;



    Map<Integer, Runnable> triggersMethod = new HashMap<>();






    ArrayList<Integer> triggers = new ArrayList<>();

    public final TriggerLogic triggerLogic = new TriggerLogic();

    public void runTriggers() {

        triggersMethod.put(1,()-> triggerLogic.atTime());
        triggersMethod.put(2,()-> triggerLogic.ifTrue());
        triggersMethod.put(3,()-> triggerLogic.ifFalse());
        triggersMethod.put(4,()-> triggerLogic.numberOfFiles());
        triggersMethod.put(5,()-> triggerLogic.ifFileType());
        triggersMethod.put(6,()-> triggerLogic.onIncrease());
        triggersMethod.put(7,()-> triggerLogic.onDecrease());
        triggersMethod.put(8,()-> triggerLogic.isEmpty());
        triggersMethod.put(9,()-> triggerLogic.isNotEmpty());
        triggersMethod.put(10,()-> triggerLogic.ifSize());
        triggersMethod.put(11,()->triggerLogic.nameMatch());
        triggersMethod.put(12,()-> triggerLogic.noMatch());

        for(int i = 0; i < triggers.size() -1; i++) {
            if(triggers.get(i) == 1){
                triggerLogic.interval();
            }
        }
    }

    @Override
    public void run() {
        runTriggers();
    }



}
