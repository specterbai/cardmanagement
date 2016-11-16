package daniel.bai.cardmanagement.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by daniel bai on 11/15/16.
 */
public class Transaction {
    long transactionId;
    Date date;
    String comments;
    List<CardChange> cardChanges;
}
