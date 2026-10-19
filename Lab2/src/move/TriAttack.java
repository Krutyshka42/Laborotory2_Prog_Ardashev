package move;

import ru.ifmo.se.pokemon.*;


public final class TriAttack extends SpecialMove{
    //alldouble: power, acc
    public TriAttack(){
        super(Type.NORMAL,80,1.0);

    }

    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            final int chance = (int) (Math.random()*3);
            switch (chance){
                case 0:
                    Effect.paralyze(p);
                    break;
                case 1:
                    Effect.freeze(p);
                    break;
                case 2:
                    Effect.burn(p);
                    break;
            }
        }
    }

    @Override protected String describe() {

        return "применяет нормальную специальную атаку Tri Attack";
    }
}
