package move;

import ru.ifmo.se.pokemon.*;

public final class Flamethrower extends SpecialMove {

    public Flamethrower(){
        //alldouble: power, acc
        super(Type.FIRE,90,1);
    }

    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.burn(p);
        }
    }
    @Override protected String describe() {

        return "применяет огненную специальную атаку Flamethrower";
    }

}