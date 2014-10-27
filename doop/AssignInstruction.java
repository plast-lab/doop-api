package doop;

public class AssignInstruction extends Instruction {
    private Var to = null;

    public AssignInstruction(Var to) {
        this.to = to;
    }

    public void setTo(Var to) {
        this.to = to;
    }

    public Var getTo() {
        return this.to;
    }
}
