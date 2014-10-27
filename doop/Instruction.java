package doop;

/**
 *
 * @author anantoni
 */
public class Instruction {
    private String value = null;
    private int index = -1;     //TODO: is this ok?
    private MethodSignature inmethod = null;

    public Instruction(String value, int index, MethodSignature inmethod) {
        this.value = value;
        this.index = index;
        this.inmethod = inmethod;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public void setInMethod(MethodSignature inmethod) {
        this.inmethod = inmethod;
    }

    public MethodSignature getInMethod() {
        return inmethod;

    }
}
