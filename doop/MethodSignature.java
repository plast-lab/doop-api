package doop;
/**
 *
 * @author anantoni
 */
public class MethodSignature {
    private String value = null;
    private Type type = null;
    private Simplename simpleName = null;
    private MethodDescriptor descriptor = null;


    public MethodSignatureRef(String value, Type type, SimpleName simpleName,
                              MethodDescriptor descriptor) {
        this.value = value;
        this.type = type;
        this.simpleName = simpleName;
        this.descriptor = descriptor;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public void setSimpleName(SimpleName simpleName) {
        this.simpleName = simpleName;
    }

    public SimpleName getSimpleName() {
        return this.simpleName;
    }

    public void setMethodDescriptor(MethodDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    public MethodDescriptor getMethoDescripotr() {
        return this.descriptor;
    }
}
