package doop;

/**
 *
 * @author anantoni
 * @author gbalats
 */
public class Instruction
{
    private String refmode;
    private int index = -1;
    private MethodSignature enclosingMethod;


    /** Constructs an instruction. */
    public Instruction()
    {
        this();
    }


    /**
     * Constructs an instruction with a refmode.
     *
     * @param refmode  the refmode of this instruction
     */
    public Instruction(String refmode)
    {
        this(refmode,  null);
    }


    /**
     * Constructs an instruction with a refmode and an index.
     *
     * @param refmode  the refmode of this instruction
     * @param index  the index of this instruction
     */
    public Instruction(String refmode, int index)
    {
        this(refmode, index, null);
    }


    /**
     * Constructs an instruction with a refmode, an index, and an
     * enclosing method.
     *
     * @param refmode          the refmode of this instruction
     * @param index            the index of this instruction
     * @param enclosingMethod  the signature of this instruction's enclosing method
     */
    public Instruction(String refmode, int index, MethodSignature enclosingMethod)
    {
        this.refmode = refmode;
        this.index = index;
        this.enclosingMethod = enclosingMethod;
    }


    /**
     * Sets the refmode of this instruction.
     *
     * @param refmode  the refmode to set
     */
    public void setRefmode(String refmode) {
        this.refmode = refmode;
    }


    /**
     * Returns the <i>refmode</i> of this instruction.
     *
     * @return  the <i>refmode</i> of this instruction
     */
    public String getRefmode() {
        return this.refmode;
    }


    /**
     * Sets the unique index of this instruction in its enclosing
     * method.
     *
     * @param index  the unique index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }


    /**
     * Returns the unique index of this instruction in its enclosing
     * method.
     *
     * @return  the unique index of this instruction
     */
    public int getIndex() {
        return this.index;
    }


    /**
     * Sets the enclosing method of this instruction.
     *
     * @param enclosingMethod the signature of the enclosing method to
     * set
     */
    public void setEnclosingMethod(MethodSignature enclosingMethod) {
        this.enclosingMethod = enclosingMethod;
    }


    /**
     * Returns the signature of the enclosing method of this
     * instruction.
     *
     * @return the signature of the enclosing method of this
     * instruction
     */
    public MethodSignature getEnclosingMethod() {
        return enclosingMethod;
    }
}
