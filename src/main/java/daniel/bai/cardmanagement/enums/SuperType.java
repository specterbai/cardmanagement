package daniel.bai.cardmanagement.enums;

/**
 * Created by sisuser on 11/15/16.
 */
public enum SuperType {
    WORLD("World"),
    LEGENDARY("Legendary"),
    SNOW("Snow"),
    BASIC("Basic"),
    ONGOING("Ongoing");

    final String superType;

    SuperType(String superType){this.superType = superType;}

    public String getSuperType() {return superType;}
}
