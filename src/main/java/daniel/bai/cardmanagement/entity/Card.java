package daniel.bai.cardmanagement.entity;

import daniel.bai.cardmanagement.enums.CardType;
import daniel.bai.cardmanagement.enums.Rarity;
import daniel.bai.cardmanagement.enums.SuperType;

import java.util.List;

/**
 * Created by daniel bai on 11/15/16.
 */
public class Card {
    String cardName;
    Expansion expansion;
    int collectNo;
    Rarity rarity;
    String imageUrl;
    String oracleText;
    List<SuperType> superTypeList;
    List<String> subTypeList;
    List<CardType> cardTypeList;
}
