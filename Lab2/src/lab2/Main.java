package lab2;

import pokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {

        public static void main(String[] args) {
                Battle b = new Battle();
                Pokemon p1 = new Bastiodon("Bastiodon",30);
                Pokemon p2 = new Seadra("Seadra",32);
                Pokemon p3 = new Poliwhirl("Poliwhirl",25);
                Pokemon p4 = new Venonat("Venonat",1);
                Pokemon p5 = new Nidoqueen("Nidoqueen",16);
                Pokemon p6 = new Poliwrath("Poliwrath",25);
                b.addAlly(p1);
                b.addAlly(p2);
                b.addAlly(p3);
                b.addFoe(p6);
                b.addFoe(p5);
                b.addFoe(p4);
                b.go();

        }

}
