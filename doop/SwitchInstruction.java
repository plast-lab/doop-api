package doop;

import java.util.Map;

public class SwitchInstruction extends Instruction() {
    private Var key;
    private Map<Integer,Integer> target = null;
    private int defaultTarget = -1;

    public SwitchInstruction(Var key) {
        this.key = key;
    }

    public void setKey(Var key) {
        this.key = key;
    }

    public Var getKey() {
        return this.key;
    }

    public void setTarget(Map<Integer, Integer> target) {
        this.target = target;
    }

    public Map<Integer, Integer> getTarget() {
        return this.target;
    }

    public void setDefaultTarget(int defaultTarget) {
        this.defaultTarget = defaultTarget;
    }

    public int getDefaultTarget() {
        return defaultTarget;
    }
}
