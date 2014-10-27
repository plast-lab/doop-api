package doop;

public LoadStaticFieldInstruction extends FieldInstruction {
    private Var to;

    public LoadStaticFieldInstruction(Var to) {
        this.to = to;
    }

    public void setTo() {
        this.to = to;
    }

    public Var getTo() {
        return this.to;
    }
}
