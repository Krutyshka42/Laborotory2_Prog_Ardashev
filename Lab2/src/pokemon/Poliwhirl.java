package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Poliwhirl extends Pokemon{

    public Poliwhirl(String name, int level){
        super(name, level);
        setType(Type.WATER);
        //alldouble: hp,att,def,spatt,spdef,speed
        setStats(65,65,65,50,50,90);
        this.addMove(new Overheat());
        this.addMove(new Rest());
    }

}