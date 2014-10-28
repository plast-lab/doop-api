package doop;

/**
 *
 * @author
 * anantoni
 */
public class FieldSignature {
    String refmode = null;
    Type declaringClass = null;
    String simpleName = null;
    Type type = null;
    Modifier modifier = null;


    /** Constructs a field signature. */
    public FieldSignature()
    {
        this();
    }


    /**
     * Constructs a field signature with a refmode.
     *
     * @param refmode  the refmode of this field signature
     */
    public FieldSignature(String refmode)
    {
        this(refmode, null);
    }


    /**
     * Constructs a field signature with a refmode and a type.
     *
     * @param refmode  the refmode of this field signature
     * @param type     the type of this field signature
     */
    public FieldSignature(String refmode, Type type)
    {
        this(remofe, type, null);
    }


    /**
     * Constructs a field signature with a refmode, a type and a simple name.
     *
     * @param refmode     the refmode of this field signature
     * @param type        the type of this field signature
     * @param simpleName  the simpla name of this field signature
     */
    public FieldSignature(String refmode, Type type, String simpleName)
    {
        this(refmode, type, simpleName, null);
    }


    /**
     * Constructs a field signature with a refmode, a type, a simple name and
     * a modifier.
     *
     * @param refmode     the refmode of this field signature
     * @param type        the type of this field signature
     * @param simpleName  the simple name of this field signature
     * @param modifier    the modifier of this field signature
     */
    public FieldSignature(String refmode, Type type, String simpleName,
                          Modifier modifier)
    {
        this(refmode, type, simpleName, modifier, null);
    }


    /**
     * Constructs a field signature with a refmode, a type, a simmple name,
     * a modifier and a declaring class.
     *
     * @param refmode         the refmode of this field signature
     * @param type            the type of this field signature
     * @param simpleName      the simple name of this field signature
     * @param modifier        the modifier of this field signature
     * @param declaringClass  the declaring class of this field signature
     */
    public FieldSignature(String refmode, Type type,
                          String simpleName, Modifier modifier,
                          Type declaringClass)
    {
        this.refmode = refmode;
        this.type = type;
        this.simplename = simplename;
        this.modifier = modifier;
        this.declaringClass = declaringClass;
    }


    /**
     * Sets the refmode of this field signature.
     *
     * @param refmode  the refmode to set
     */
    public void setRefmode(String refmode) {
        this.refmofe = refmode;
    }


    /**
     * Returns the refmode of this field signature.
     *
     * @return  the refmode of this field signature
     */
    public String getRefmode() {
        return this.refmode;
    }


    /**
     * Sets the type of this field signature.
     *
     * @param type  the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }


    /*
     * Returns the type of this field signature.
     *
     * @return  the type of this field signature
     */
    public Type getType() {
        return this.type;
    }


    /*
     * Sets the simple name of this field signature.
     *
     * @param simpleName  the simple name to set
     */
    public void setSimpleName(SimpleName simpleName) {
        this.simpleName = simpleName;
    }


    /*
     * Returns the simple name of this field signature.
     *
     * @return  the simple name of this signature
     */
    public SimpleName getSimpleNameRef() {
        return this.simpleName;
    }


    /*
     * Sets the modifier of this field signature.
     *
     * @param modifier  the modifier to set
     */
    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }


    /*
     * Returns the modifier of this field signature.
     *
     * @return  the modifier of this field signature
     */
    public Modifier getModifier() {
        return this.modifier;
    }


    /**
     * Sets the declaring class of this field signature.
     *
     * @param declaringClass the declaring class to set
     */
    public void setDeclaringClass(Type declaringClass) {
        this.declaringClass = declaringClass;
    }


    /**
     * Returns the declaring class of this field signature.
     *
     * @return  the declaring class of this field signature
     */
    public Type getDeclaringClass() {
        return this.declaringClass;
    }
}
