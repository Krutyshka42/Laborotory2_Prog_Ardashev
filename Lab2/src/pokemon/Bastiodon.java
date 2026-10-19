package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Bastiodon extends Pokemon{

    public Bastiodon(String name, int level){
        super(name, level);
        setType(Type.ROCK,Type.STEEL);
        //alldouble: hp,att,def,spatt,spdef,speed
        setStats(60,52,168,47,138,30);
        this.addMove(new ThunderWave());
        this.addMove(new Thunder());
        this.addMove(new Thunderbolt());
        this.addMove(new TriAttack());
    }

}