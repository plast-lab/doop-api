package doop;

/**
 *
 * @author
 * anantoni
 */
public class Var {
    private String value = null;
    private Type type = null;
    private MethodSignature declaringMethod = null;
    private String name = null;

    public Var(String value, Type type, MethodSignature declaringMethod, String name) {
        this.value = value;
        this.type = type;
        this.declaringMethod = declaringMethod;
        this.name = name;
    }

    public void setDeclaringMethod(MethodSignature declaringMethod) {
        this.declaringMethod = declaringMethod;
    }

    public MethodSignature getDeclaringMethod() {
        return this.declaringMethod;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setDeclaringMethod(MethodSignature declaringMethod) {
        this.declaringMethod = declaringMethod;
    }

    public MethodSignature getDeclaringMethod() {
        return this.declaringMethod;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
