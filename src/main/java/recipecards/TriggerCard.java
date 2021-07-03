package recipecards;


import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

public class TriggerCard extends TimerTask {





    Map<Integer, Runnable> triggersMethod = new HashMap<>();






    //ArrayList<Integer> triggerBox = new ArrayList<>();

    public final TriggerLogic triggerLogic = new TriggerLogic();

    public void runTriggers() {

        if(triggersMethod.size() == 0) {
            triggersMethod.put(1, triggerLogic::atTime);
            triggersMethod.put(2, triggerLogic::ifTrue);
            triggersMethod.put(3, triggerLogic::ifFalse);
            triggersMethod.put(4, triggerLogic::numberOfFiles);
            triggersMethod.put(5, triggerLogic::ifFileType);
            triggersMethod.put(6, triggerLogic::onIncrease);
            triggersMethod.put(7, triggerLogic::onDecrease);
            triggersMethod.put(8, triggerLogic::isEmpty);
            triggersMethod.put(9, triggerLogic::isNotEmpty);
            triggersMethod.put(10, triggerLogic::ifSize);
            triggersMethod.put(11, triggerLogic::nameMatch);
            triggersMethod.put(12, triggerLogic::noMatch);
            triggersMethod.put(13, triggerLogic::filesLessOrEqualTo);
            triggersMethod.put(14, triggerLogic::filesGreaterOrEqualTo);
        }

        for(Integer key: triggersMethod.keySet()) {
            if(key == 1){
                triggerLogic.interval();
            }
        }
    }

    @Override
    public void run() {
        runTriggers();
    }



}
