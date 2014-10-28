package doop;
/**
 *
 * @author anantoni
 */
public class LoadStaticFieldInstruction extends FieldInstruction {
    private Var to;


    public LoadStaticFieldInstruction()
    {
        this();
    }


    public LoadStaticFieldInstruction(Var to)
    {
        this.to = to;
    }

    public void setTo() {
        this.to = to;
    }

    public Var getTo() {
        return this.to;
    }
}
