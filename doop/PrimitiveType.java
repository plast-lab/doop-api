package doop;

/**
 *
 * @author anantoni
 */
public class PrimitiveType extends Type {

    /** Constructs a primitive type. */
    public PrimitiveType() {
        super();
        this();
    }


    /** Constructs a primitive type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of the primitive type
     */
    public PrimitiveType(String fullyQualifiedName) {
        super(fullyQualifiedName);
        this();
    }
}
