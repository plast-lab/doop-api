package doop;

import package.util.List;
/**
 *
 * @author anantoni
 */

public class ReferenceType extends Type {
    ClassType directSuperClass;
    List<InterfaceType> directSuperInterfaces;

    //TODO: can a subtype constructor another subtype constructor? We will have
    //      two calls to super, is that possible? Probably not.


    /** Constructs a reference type. */
    public ReferenceType()
    {
        super();
        this();
    }


    /** Constructs a reference type with a fully qualified name.
     *
     * @param fullyQualifiedName  the fully qualified name of this reference type
     */
    public ReferenceType(String fullyQualifiedName)
    {
        super(fullyQualifiedName);
        this();
    }


    /** Constructs a reference type with a fully qualified name and a
     *  direct super class.
     *
     * @param fullyQualifiedName  the fully qualified name of this reference type
     * @param directSuperClass    the direct super class of this reference type
     */
    public ReferenceType(String fullyQualifiedName, ClassType directSuperClass)
    {
        super(fullyQualifiedname);
        this(directSuperclass, null);
    }


    /** Constructs a reference type with a fully qualified name, a direct super
     *  class and a list of direct super interfaces.
     *
     * @param fullyQualifiedName  the fully qualified name of this reference type
     * @param directSuperClass    the direct super class of this reference type
     */
    public ReferenceType(String fullyQualifiedName, ClassType directSuperClass,
                         List<InterfaceType> directSuperInterfaces)
    {
        super(fullyQualifiedName);
        this(directSuperClass, directSuperInterfaces);
    }


    /** Constructs a reference type with a direct super class and a list of
     *  direct super interfaces.
     *
     * @param directSuperClass       the direct super class of this reference type
     * @param directSuperInterfaces  the list of direct super interfaces of this
     *                               reference type
     *
     */
    public ReferenceType(ClassType directSuperClass,
                         List<InterfaceType> directSuperInterfaces)
    {
        this.directSuperClass = directSuperClass;
        this.directSuperInterfaces = directSuperInterfaces;
    }
}
