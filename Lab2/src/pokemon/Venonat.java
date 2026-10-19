package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Venonat extends Pokemon{

    public Venonat(String name, int level){
        super(name, level);
        setType(Type.BUG,Type.POISON);
        //alldouble: hp,att,def,spatt,spdef,speed
        setStats(60,55,50,40,55,45);
        this.addMove(new DoubleTeam());
        this.addMove(new Swagger());
        this.addMove(new Overheat());
        this.addMove(new Peck());
    }

}