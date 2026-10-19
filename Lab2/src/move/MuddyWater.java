package move;

import ru.ifmo.se.pokemon.*;

public final class MuddyWater extends SpecialMove {

    public MuddyWater(){
        //alldouble: power, acc
        super(Type.WATER,90,0.85);
    }

    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            p.setMod(Stat.ACCURACY,-1);
        }
    }
    @Override protected String describe() {

        return "применяет водную специальную атаку Muddy Water";
    }

}