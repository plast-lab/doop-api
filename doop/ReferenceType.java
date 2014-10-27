package doop;

/**
 *
 * @author anantoni
 */

public class ReferenceType extends Type {

    /** Constructs a reference type. */
    public ReferenceType() {
        super();
        this();
    }


    /** Constructs a reference type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of this reference type
     */
    public ReferenceType(String fullyQualifiedName) {
        super(fullyQualifiedName);
        this();
    }
}
