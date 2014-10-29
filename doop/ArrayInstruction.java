package doop;

public class ArrayInstruction extends Instruction {
    /** Constructs an array instruction. */
    public ArrayInstruction()
    {
        super();
    }


    /**
     * Constructs an array instruction with a refmode.
     *
     * @param refmode  the refmode of this array instruction
     */
    public ArrayInstruction(String refmode)
    {
        super(refmode,  null);
    }


    /**
     * Constructs an array instruction with a refmode and an index.
     *
     * @param refmode  the refmode of this array instruction
     * @param index  the index of this array instruction
     */
    public ArrayInstruction(String refmode, int index)
    {
        super(refmode, index, null);
    }


    /**
     * Constructs an array instruction with a refmode, an index, and an
     * enclosing method.
     *
     * @param refmode          the refmode of this array instruction
     * @param index            the index of this array instruction
     * @param enclosingMethod  the signature of this array instruction's enclosing method
     */
    public ArrayInstruction(String refmode, int index, MethodSignature enclosingMethod)
    {
        super(refmode, index, enclosingMethod);
    }
}
