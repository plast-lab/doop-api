package doop;

public class AssignInstruction extends Instruction {
    private Var to = null;

    /** Constructs an assign instruction. */
    public AssignInstruction()
    {
        super();
    }


    /**
     * Constructs an assign instruction with a refmode.
     *
     * @param refmode  the refmode of this assign instruction
     */
    public AssignInstruction(String refmode)
    {
        super(refmode,  null);
    }


    /**
     * Constructs an assign instruction with a refmode and an index.
     *
     * @param refmode  the refmode of this assign instruction
     * @param index  the index of this assign instruction
     */
    public AssignInstruction(String refmode, int index)
    {
        super(refmode, index, null);
    }


    /**
     * Constructs an assign instruction with a refmode, an index, and an
     * enclosing method.
     *
     * @param refmode          the refmode of this assign instruction
     * @param index            the index of this assign instruction
     * @param enclosingMethod  the signature of this assign instruction's enclosing method
     */
    public AssignInstruction(String refmode, int index, MethodSignature enclosingMethod)
    {
        super(refmode, index, enclosingMethod);
    }


    /**
     * Sets the variable this assign instruction assigns to.
     *
     * @param to  the assigned-to variable to set
     */
    public void setAssignedToVar(Var to) {
        this.to = to;
    }


    /**
     * Returns the variable this assign instruction assigns to.
     *
     * @return to  the assigned-to variable of this instruction
     */
    public Var getTo() {
        return this.to;
    }
}
