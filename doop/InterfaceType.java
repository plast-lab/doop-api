package doop;

/**
 *
 * @author anantoni
 */
public class InterfaceType extends ReferenceType {

    /** Constructs an interface type. */
    public InterfaceType() {
        super();
        this();
    }


    /** Constructs an interface type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of this interface type
     */
    public InterfaceType(String fullyQualifiedName) {
        super(fullyQualifiedName);
        this();
    }
}
