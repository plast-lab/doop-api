package doop;

/**
 *
 * @author
 * anantoni
 */
public class FieldSignature {
    String value = null;
    Type declaringClass = null;
    SimpleName  simpleName = null;
    Type type = null;
    Modifier modifier = null;

    public FieldSignature(String value,
                          Type declaringClass,
                          SimpleNameRef simplename,
                          Modifier modifier,
                          Type type) {

        this.value = value;
        this.declaringClass = declaringClass;
        this.simplename = simplename;
        this.type = type;
        this.modifier = modifier;
    }

    public void setDeclaringClass(Type declaringClass) {
        this.declaringClass = declaringClass;
    }

    public Type getDeclaringClass() {
        return this.declaringClass;
    }

    public void setSimpleName(SimpleName simpleName) {
        this.simpleName = simpleName;
    }

    public SimpleName getSimpleNameRef() {
        return this.simplename;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }

    public Modifier getModifier() {
        return this.modifier;
    }
}
