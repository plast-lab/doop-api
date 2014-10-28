/**
 *
 * @author anantoni
 */

package doop;

public class StoreStaticFieldInstruction extends FieldInstruction {
    private Var from;

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
