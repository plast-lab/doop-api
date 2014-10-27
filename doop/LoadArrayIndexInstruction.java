package doop;

public class LoadArrayIndexInstruction extends ArrayInstruction {
    private Var base = null;
    private Var to = null;

    public LoadArrayIndexInstruction(Var base, Var to) {
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
