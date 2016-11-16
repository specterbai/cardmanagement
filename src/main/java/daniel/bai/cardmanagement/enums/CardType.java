package daniel.bai.cardmanagement.enums;

/**
 * Created by sisuser on 11/15/16.
 */
public enum CardType {
    CREATURE("Creature"),
    ARTIFACT("Artifact"),
    ENCHANTMENT("Enchantment"),
    INSTANT("Instant"),
    SOCCERY("Soccery"),
    LAND("Land"),
    PLANESWALKER("Planeswalker"),
    TRIBAL("Tribal"),
    VANGUARD("Vanguard"),
    PHENOMENON("Phenomenon"),
    CONSPIRACY("Conspiracy"),
    PLANE("Plane"),
    SCHEME("Scheme");

    final String cardType;

    CardType(String cardType){this.cardType = cardType;}

    public String getCardType() {return cardType;}
}
