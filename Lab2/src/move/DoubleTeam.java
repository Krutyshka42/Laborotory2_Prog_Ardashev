package move;

import ru.ifmo.se.pokemon.*;

public final class DoubleTeam extends StatusMove{

    public DoubleTeam(){
        //alldouble: power, acc
        super(Type.NORMAL,0,1);
    }

    @Override protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }


    @Override protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, +1);
    }

    @Override protected String describe(){
        return "применяет нормальную атаку Double Team";
    }
}
