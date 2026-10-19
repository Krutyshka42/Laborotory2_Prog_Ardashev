package move;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove{

    public Rest(){
        //alldouble: power, acc
        super(Type.PSYCHIC,0,1);
    }

    @Override protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override protected void applySelfEffects(Pokemon p){
        //Восстановление HP до полного
        double lost_hp = p.getStat(Stat.HP)-p.getHP();
        p.setMod(Stat.HP,(int) -lost_hp);
        //Покемон засыпает на 2 хода: 1 из трёх тратится в момент текущего хода и остаются 2
        Effect sleep_2_turns = new Effect().turns(3).condition(Status.SLEEP).attack(0);
        p.setCondition(sleep_2_turns);

    }

    @Override protected String describe(){
        return "применяет психическую атаку Rest";
    }
}