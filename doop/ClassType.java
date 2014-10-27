package doop;

/**
 *
 * @author anantoni
 */
public class ClassType extends ReferenceType {

    /** Constructs a class type. */
    public ClassType() {
        super();
        this();
    }


    /** Constructs a class type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of this class type
     */
    public ClassType(String fullyQualifiedName) {
        super(fullyQualifiedName);
        this();
    }
}
