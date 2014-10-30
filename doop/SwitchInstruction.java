package doop;

import java.util.Map;

public class SwitchInstruction extends Instruction {
    private Var key;
    private Map<Integer,Integer> target = null;
    private int defaultTarget = -1;


    /** Constructs an switch instruction. */
    public SwitchInstruction()
    {
        super();
    }


    /**
     * Constructs an switch instruction with a refmode.
     *
     * @param refmode  the refmode of this switch instruction
     */
    public SwitchInstruction(String refmode)
    {
        super(refmode,  null);
    }


    /**
     * Constructs an switch instruction with a refmode and an index.
     *
     * @param refmode  the refmode of this switch instruction
     * @param index  the index of this switch instruction
     */
    public SwitchInstruction(String refmode, int index)
    {
        super(refmode, index, null);
    }


    /**
     * Constructs an switch instruction with a refmode, an index, and an
     * enclosing method.
     *
     * @param refmode          the refmode of this switch instruction
     * @param index            the index of this switch instruction
     * @param enclosingMethod  the signature of this switch instruction's enclosing method
     */
    public SwitchInstruction(String refmode, int index,
                             MethodSignature enclosingMethod)
    {
        super(refmode, index, enclosingMethod);
    }


    /**
     * Constructs a switch instruction with a rfemode, an index, an enclosing method
     * and a key.
     *
     * @param refmode          the refmode of this switch instruction
     * @param index            the index of this switch instruction
     * @param enclosingMethod  the signature of this switch instruction's enclosing method
     * @param key              the key variable of this switch instruction
     */
    public SwitchInstruction(String refmode, int index,
                             MethodSignature enclosingMethod, Var key)
    {
        this(refmode, index, enclosingMethod, key, null, -1);
    }


    /**
     * Constructs a switch instruction with a rfemode, an index, an enclosing method,
     * a key and a target.
     *
     * @param refmode          the refmode of this switch instruction
     * @param index            the index of this switch instruction
     * @param enclosingMethod  the signature of this switch instruction's enclosing method
     * @param key              the key variable of this switch instruction
     * @param target           the target of this switch instruction
     */
    public SwitchInstruction(String refmode, int index,
                             MethodSignature enclosingMethod, Var key,
                             Map<Integer, Integer> target)
    {
        this(refmode, index, enclosingMethod, key, target, -1);
    }


    /**
     * Constructs a switch instruction with a rfemode, an index, an enclosing method,
     * a key and a target.
     *
     * @param refmode          the refmode of this switch instruction
     * @param index            the index of this switch instruction
     * @param enclosingMethod  the signature of this switch instruction's enclosing method
     * @param key              the key variable of this switch instruction
     * @param target           the target of this switch instruction
     * @param defaultTarget    the default target of this switch instruction
     */
    public SwitchInstruction(String refmode, int index,
                             MethodSignature enclosingMethod, Var key,
                             Map<Integer, Integer> target, int defaultTarget)
    {
        this.refmode = refmode;
        this.index = index;
        this.enclosingMethod = enclosingMethod;
        this.key = key;
        this.target = target;
        this.defaultTarget = defaultTarget;
    }

    /* Sets the key variable of this switch instruction.
     *
     * @param key  the key variable to set
     */
    public void setKey(Var key) {
        this.key = key;
    }

    /**
     * Returns the key variable of this switch instruction.
     *
     * @return key  the key variable of this switch instruction
     */
    public Var getKey() {
        return this.key;
    }


    /**
     * Sets the target of this switch instruction.
     *
     * @param target  the target to set
     */
    public void setTarget(Map<Integer, Integer> target) {
        this.target = target;
    }


    /**
     * Returns the target of this switch instruction.
     *
     * @return target  the target of this switch instruction
     */
    public Map<Integer, Integer> getTarget() {
        return this.target;
    }


    /**
     * Sets the default target of this switch instruction.
     *
     * @param defaultTarget  the default target to set
     */
    public void setDefaultTarget(int defaultTarget) {
        this.defaultTarget = defaultTarget;
    }


    /**
     * Returns the default target of this switch instruction.
     *
     * @return defaultTarget  the default target of this switch instruction
     */
    public int getDefaultTarget() {
        return defaultTarget;
    }
}
