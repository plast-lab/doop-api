package doop;

public class LoadInstanceFieldInstruction extends FieldInstruction {
    private Var base;
    private Var to;

    public LoadInstanceFieldInstruction(Var base, Var to) {
        this.base = base;
        this.to = to;
    }

    public void setBase(Var base) {
        this.base = base;
    }

    public Var getBase() {
        return this.base;
    }

    public void setTo(Var to) {
        this.to = to;
    }

    public Var getTo() {
        return this.to;
    }
}
