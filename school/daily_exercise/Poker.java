import java.util.ArrayList;
import java.util.List;

public class Poker {
    private Deck deckA = new Deck();
    private Deck deckB = new Deck();
    private Deck deckC = new Deck();

    @Override
    public String toString() {
        return "deckA=\n" + deckA + "\n\ndeckB=\n" + deckB + "\n\ndeckC=\n" + deckC;
    }

    void deal() {
        deckA.reset();
        deckB.reset();
        deckC.reset();
        int n = 54;
        while (n-- != 0) {
            Flush flush = Flush.class.getEnumConstants()[((int) (Math.random() * 5))];
            int num = (int) (Math.random() * 13 + 1);
            if (!deckA.contain(flush, num) && !deckB.contain(flush, num) && !deckC.contain(flush, num)) {
                if (flush.compareTo(Flush.JOKER) == 0) {
                    if (num > 7) {
                        num = 1;
                    } else {
                        num = 0;
                    }
                }
                deckA.add(new Card(flush, num));
            }
            if (!deckA.contain(flush, num) && !deckB.contain(flush, num) && !deckC.contain(flush, num)) {
                if (flush.compareTo(Flush.JOKER) == 0) {
                    if (num > 7) {
                        num = 1;
                    } else {
                        num = 0;
                    }
                }
                deckB.add(new Card(flush, num));
            }
            if (!deckA.contain(flush, num) && !deckB.contain(flush, num) && !deckC.contain(flush, num)) {
                if (flush.compareTo(Flush.JOKER) == 0) {
                    if (num > 7) {
                        num = 1;
                    } else {
                        num = 0;
                    }
                }
                deckC.add(new Card(flush, num));
            }
        }
    }

    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.deal();
        System.out.println(poker);
    }
}

class Card {
    public Card(Flush flush, int number) {
        this.flush = flush;
        this.number = number;
    }

    private Flush flush;
    private int number;

    @Override
    public String toString() {
        return "[" + flush + "," + number + "]";
    }
}

enum Flush {
    HEART, SPADE, DIAMOND, CLUB, JOKER;
}

class Deck {
    private List<Card> cards = new ArrayList<>();

    public boolean add(Card card) {
        if (cards.size() >= 18) {
            return false;
        } else {
            cards.add(card);
            return false;
        }
    }

    public boolean add(Flush flush, int num) {
        if (cards.size() >= 18) {
            return false;
        } else {
            cards.add(new Card(flush, num));
            return true;
        }
    }

    public boolean contain(Flush flush, int num) {
        return cards.contains(new Card(flush, num));
    }

    public boolean isFull() {
        return cards.size() == 18;
    }

    public void reset() {
        cards.clear();
    }

    @Override
    public String toString() {
        return "[" + cards + "]";
    }

}