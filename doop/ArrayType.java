package doop;

/**
 *
 * @author anantoni
 */
public class ArrayType extends ReferenceType {

    /** Constructs an array type. */
    public ArrayType() {
        super();
        this();
    }


    /** Constructs an array type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of this array type
     */
    public ArrayType(String fullyQualifiedName) {
        super(fullyQualifiedName);
        this();
    }
}
