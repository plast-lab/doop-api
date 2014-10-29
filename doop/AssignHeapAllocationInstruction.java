package doop;

public class AssignHeapAllocationInstruction extends AssignInstruction {
    /** Constructs an assign heap instruction. */
    public AssignHeapInstruction()
    {
        super();
    }


    /**
     * Constructs an assign heap instruction with a refmode.
     *
     * @param refmode  the refmode of this assign heap instruction
     */
    public AssignHeapInstruction(String refmode)
    {
        super(refmode,  null);
    }


    /**
     * Constructs an assign heap instruction with a refmode and an index.
     *
     * @param refmode  the refmode of this assign heap instruction
     * @param index  the index of this assign heap instruction
     */
    public AssignHeapInstruction(String refmode, int index)
    {
        super(refmode, index, null);
    }


    /**
     * Constructs an assign heap instruction with a refmode, an index, and an
     * enclosing method.
     *
     * @param refmode          the refmode of this assign heap instruction
     * @param index            the index of this assign heap instruction
     * @param enclosingMethod  the signature of this assign heap instruction's enclosing method
     */
    public AssignHeapInstruction(String refmode, int index, MethodSignature enclosingMethod)
    {
        super(refmode, index, enclosingMethod);
    }
}
