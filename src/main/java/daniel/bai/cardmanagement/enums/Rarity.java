package daniel.bai.cardmanagement.enums;

/**
 * Created by daniel bai on 11/15/16.
 */
public enum Rarity {
    COMMON("Common"),
    UNCOMMON("Uncommon"),
    RARE("Rare"),
    MYTHIC("Mythic Rare");

    final String rarity;

    Rarity(String rarity){this.rarity = rarity;}

    public String getRarity() {return rarity;}
}
