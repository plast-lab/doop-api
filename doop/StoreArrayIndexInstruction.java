package doop;

public class StoreArrayIndexInstruction extends ArrayInstruction {
    private Var from = null;
    private Var base = null;

    public StoreArrayIndexInstruction(Var from, Var base) {
        this.from = from;
        this.base = base;
    }

    public void setFrom(Var from) {
        this.from = from;
    }

    public Var getFrom() {
        return this.from;
    }

    public void setBase(Var base) {
        this.base = base;
    }

    public Var getBase() {
        return this.base;
    }
}
