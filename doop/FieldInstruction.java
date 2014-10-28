package doop;

public class FieldInstruction extends Instruction {
    private FieldSignature signature;
    private Var base;
    private Var to;

    public FieldInstruction(FieldSignature signature, Var base, Var to) {
        this.signature = signature;
        this.base = base;
        this.to = to;
    }

    public void setSignature(FieldSignature signature) {
        this.signature = signature;
    }

    public FieldSignature getSignature() {
        return this.signature;
    }
}
