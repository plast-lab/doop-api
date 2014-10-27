package doop;

/**
 *
 * @author anantoni
 */
public class Var {
    private String refmode = null;
    private Type type = null;
    private MethodSignature declaringMethod = null;
    private String name = null;


    /** Constructs a variable **/
    public Var()
    {
        this();
    }


    /**
     * Constructs a variable with a refmode
     *
     * @param refmode  the refmode of this variable
     */
    public Var(String refmode)
    {
        this(refmode, null);
    }


    /**
     * Constructs a variable with a refmode and a name.
     *
     * @param refmode  the refmode of this variable
     * @param name  the name of this variable
     */
    public Var(String refmode, String name)
    {
        this(refmode, name, null);
    }


    /**
     * Constructs a variable with a refmode, name and a type.
     *
     * @param refmode  the refmode of this variable
     * @param name     the name of this variable
     * @param type     the type of this variable
     */
    public Var(String refmode, String name, Type type)
    {
        this(refmode, name, type, null);
    }


    /**
     * Constructs a variable with a refmode, a name, a type and a declaring method.
     *
     * @param refmode          the refmode of this variable
     * @param name             the name of this variable
     * @param type             the type of this variable
     * @param declaringMethod  the declaring method of this variable
     */
    public Var(String refmode, String name,
               Type type, MethodSignature declaringMethod)
    {
        this.refmode = refmode;
        this.type = type;
        this.name = name;
        this.declaringMethod = declaringMethod;
    }


    /**
     * Sets the refmode of this variable.
     *
     * @param refmode  the refmode to set
     */
    public void setRefmode(String refmode) {
        this.refmode = refmode;
    }


    /**
     * Returns the refmode of this variable.
     *
     * @return refmode  the refmode of this variable
     */
    public String getRefmode() {
        return this.refmode;
    }

    /**
     * Sets the declaring method of this variable.
     *
     * @param declaringMethod  the declaring method to set
     */
    public void setDeclaringMethod(MethodSignature declaringMethod) {
        this.declaringMethod = declaringMethod;
    }


    /**
     * Returns the declaring method of this variable.
     *
     * @return declaringMethod  the declaring method of this variable
     */
    public MethodSignature getDeclaringMethod() {
        return this.declaringMethod;
    }


    /**
     * Sets the type of this variable.
     *
     * @param type  the type to set
     *
     */
    public void setType(Type type) {
        this.type = type;
    }


    /**
     * Returns the type of this variable.
     *
     * @return type  the type of this variable
     */
    public Type getType() {
        return type;
    }


    /**
     * Sets the declaring method of this variable.
     *
     * @param declaringMethod  the declaring method to set
     */
    public void setDeclaringMethod(MethodSignature declaringMethod) {
        this.declaringMethod = declaringMethod;
    }


    /**
     * Returns the declaring method of this variable.
     *
     *  @return declaringMethod  the declaring method of this variable
     */

    public MethodSignature getDeclaringMethod() {
        return this.declaringMethod;
    }


    /**
     * Sets the type of this variable.
     *
     * @param type  the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Returns the type of this variable
     *
     * @return type  the type of this variable
     */
    public Type getType() {
        return type;
    }
}
