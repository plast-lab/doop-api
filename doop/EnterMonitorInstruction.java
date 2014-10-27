package doop;

public class EnterMonitorInstruction extends MonitorInstruction {
    private Var var = null;

    public EnterMonitorInstruction(Var var) {
        this.var = var;
    }

    public void setVar(Var var) {
        this.var = var;
    }
    public Var getVar() {
        return this.var;
    }
}
