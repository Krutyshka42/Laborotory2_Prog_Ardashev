package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Nidoqueen extends Pokemon{

    public Nidoqueen(String name, int level){
        super(name, level);
        setType(Type.POISON,Type.GROUND);
        //alldouble: hp,att,def,spatt,spdef,speed
        setStats(90,92,87,75,85,76);
        this.addMove(new Overheat());
        this.addMove(new Rest());
        this.addMove(new Flamethrower());
    }

}