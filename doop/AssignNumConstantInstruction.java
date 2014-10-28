package doop;

public class AssignNumConstantInstruction extends AssignInstruction {
    private NumConstant refmode;

    public AssignNumConstantInstruction(NumConstant refmode) {
        this.refmode = refmode;
    }

    public void setValue(NumConstant value) {
        this.value = value;
    }

    public NumConstant getValue() {
        return this.value;
    }
}
