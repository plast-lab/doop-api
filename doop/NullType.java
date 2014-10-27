package doop;

/**
 *
 * @author anantoni
 */
public class NullType extends ReferenceType {

    /** Constructs a NullType. */
    //TODO: does this make sense or NullType should have a default fqn?
    public NullType() {
        super();
        this();
    }


    /** Constructs a null type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of this null type
     */
    public NullType(String fullyQualifiedName) {
        super(fullyQualifiedName);
        this();
    }
}
