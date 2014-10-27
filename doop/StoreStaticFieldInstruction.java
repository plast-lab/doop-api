package doop;

public StoreStaticFieldInstruction extends FieldInstruction {
    private Var from = null;

    public StoreStaticFieldInstruction(Var from) {
        this.from = from;
    }

    public void setFrom(Var from) {
        this.from = from;
    }

    public Var getFrom() {
        return this.from;
    }
}
