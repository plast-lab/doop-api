package doop;

/**
 *
 * @author anantoni
 */
public class Type
{
    private String fullyQualifiedName;

    /** Constructs a type. */
    public Type()
    {
        this();
    }


    /**
     * Constructs a type with fully a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of the type
     */
    public Type(String fullyQualifiedName)
    {
        this.fullyQualifiedName = fullyQualifiedName;
    }


    /*
     * Sets the fully qualified name of this type.
     *
     * @param fullyQualifiedName  the fully qualified name to set
     */
    public void setFullyQalifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }


    /*
     * Returns the fully qualified name of this type.
     *
     * @return fullyQualifiedName  the fully qualified name of this type
     */
    public String getFullyQualifiedName() {
        return this.fullyQualifiedName;
    }

}
