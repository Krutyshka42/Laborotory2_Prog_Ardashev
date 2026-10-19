package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Poliwrath extends Poliwhirl{

    public Poliwrath(String name, int level){
        super(name, level);
        addType(Type.FIGHTING);
        //alldouble: hp,att,def,spatt,spdef,speed
        setStats(90,95,95,70,90,70);
        this.addMove(new Flamethrower());
        this.addMove(new MuddyWater());
        //Overheat и Rest достаются от Poliwhirl
    }

}