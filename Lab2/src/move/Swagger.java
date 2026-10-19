package move;

import ru.ifmo.se.pokemon.*;


public final class Swagger extends StatusMove{
    //alldouble: power, acc
    public Swagger(){
        super(Type.NORMAL,0,0.85);

    }

    @Override protected void applyOppEffects(Pokemon p) {

        Effect.confuse(p);
        p.setMod(Stat.ATTACK,+2);
    }


    @Override protected String describe() {

        return "применяет нормальную атаку Swagger";
    }
}