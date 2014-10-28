package doop;

/**
 *
 * @author anantoni
 */
public class MethodSignature {
    private String refmode = null;
    private Type type = null;
    private String simpleName = null;
    private MethodDescriptor descriptor = null;


    /** Constructs a method signature. */
    public MethodSignature()
    {
        this();
    }


    /**
     * Constructs a method signature with a refmode.
     *
     * @param refmode  the refmode of this method signature
     */
    public MethodSignature(String refmode)
    {
        this(refmode, null);
    }


    /**
     * Constructs a method signature with a refmode and a type
     *
     * @param refmode  the refmode of this method signature
     * @param type     the type of this method signature
     */
    public MethodSignature(String refmode, Type type) {
        this(refmode, type, null);
    }


    /**
     * Constructs a method signature with a refmode, a type and a simple name.
     *
     * @param refmode     the refmode of this method signature
     * @param type        the type of this method signature
     * @param simpleName  the simple name of this method signature
     */
    public MethodSignature(String refmode, Type type, String simpleName)
    {
        this(refmode, type, simpleName, null);
    }

    /**
     * Constructs a method signature with a refmode and a type.
     *
     * @param refmode     the refmode of this method signature
     * @param type        the type of this method signature
     * @param simpleName  the simple name of this method signature
     * @param descriptor  the descriptor of this method signature
     */

    public MethodSignature(String refmode, Type type, String simpleName,
                           MethodDescriptor descriptor)
    {
        this.refmode = refmode;
        this.type = type;
        this.simpleName = simpleName;
        this.descriptor = descriptor;
    }


    /**
     * Sets the refmode of this method signature.
     *
     * @param refmode  the refmode to set
     */
    public void setRefmode(String refmode) {
        this.refmode = refmode;
    }


    /**
     * Returns the refmode of this method signature.
     *
     * @return  the refmode of this method signature
     */
    public String getRefmode() {
        return this.refmode;
    }


    /**
     * Sets the type of this method signature.
     *
     * @param type  the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }


    /**
     * Returns the type of this method signature.
     *
     * @return  the type of this method signature
     */
    public Type getType() {
        return this.type;
    }


    /**
     * Sets the simple name of this method signature.
     *
     * @param simpleName  the simple name to set
     */
    public void setSimpleName(SimpleName simpleName) {
        this.simpleName = simpleName;
    }


    /**
     * Returns the simple name of this method signature.
     *
     * @return  the simple name of this method signature
     */
    public SimpleName getSimpleName() {
        return this.simpleName;
    }


    /**
     * Sets the method descriptor of this method signature.
     *
     * @param descriptor  the method descriptor to set
     */
    public void setMethodDescriptor(MethodDescriptor descriptor) {
        this.descriptor = descriptor;
    }


    /**
     * Returns the method descriptor of this method siganture.
     *
     * @return descriptor  the method descriptor of this method signature
     */
    public MethodDescriptor getMethoDescriptor() {
        return this.descriptor;
    }
}
