package doop;

public class ThrowInstruction extends Instruction {


    /** Constructs a throw instruction. */
    public ThrowInstruction()
    {
        super();
    }


    /**
     * Constructs a throw instruction with a refmode.
     *
     * @param refmode  the refmode of this throw instruction
     */
    public ThrowInstruction(String refmode)
    {
        super(refmode,  null);
    }


    /**
     * Constructs a throw instruction with a refmode and an index.
     *
     * @param refmode  the refmode of this throw instruction
     * @param index  the index of this throw instruction
     */
    public ThrowInstruction(String refmode, int index)
    {
        super(refmode, index, null);
    }


    /**
     * Constructs a throw instruction with a refmode, an index, and an
     * enclosing method.
     *
     * @param refmode          the refmode of this throw instruction
     * @param index            the index of this throw instruction
     * @param enclosingMethod  the signature of this throw instruction's enclosing method
     */
    public ThrowInstruction(String refmode, int index, MethodSignature enclosingMethod)
    {
        super(refmode, index, enclosingMethod);
    }

}
