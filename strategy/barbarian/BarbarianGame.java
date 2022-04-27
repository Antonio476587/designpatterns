package poo.strategy.barbarian;

public class BarbarianGame {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        Character queen = new Queen();
        queen.fight();
        Character troll = new Troll();
        troll.fight();
        Character knight = new Knight();
        knight.fight();
    }
}