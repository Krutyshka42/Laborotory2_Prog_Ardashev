package move;

import ru.ifmo.se.pokemon.*;

public final class Peck extends PhysicalMove{

    public Peck(){
        //alldouble: power, acc
        super(Type.FLYING,35,1);
    }

    @Override protected String describe(){
        return "применяет летучую физическую атаку Peck";
    }
}
