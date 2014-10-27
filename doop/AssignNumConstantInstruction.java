package doop;

public class AssignNumConstantInstruction extends AssignInstruction {
    private NumConstant value = null;

    public class AssignNumConstantInstruction(NumConstant value) {
        this.value = value;
    }

    public void setValue(NumConstant value) {
        this.value = value;
    }

    public NumConstant getValue() {
        return this.value;
    }
}
