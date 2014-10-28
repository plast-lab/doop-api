package doop;

public class ExitMonitorInstruction extends MonitorInstruction {
    private Var var = null;

    public ExitMonitorInstruction(Var var) {
        this.var = var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Var getVar() {
        return this.var;
    }
}
