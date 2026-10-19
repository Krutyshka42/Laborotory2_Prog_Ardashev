package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Seadra extends Pokemon{

    public Seadra(String name, int level){
        super(name, level);
        setType(Type.WATER);
        //alldouble: hp,att,def,spatt,spdef,speed
        setStats(55,65,95,95,45,85);
        this.addMove(new DoubleTeam());
        this.addMove(new Swagger());
        this.addMove(new Overheat());
    }

}