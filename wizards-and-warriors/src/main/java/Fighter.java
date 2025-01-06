
class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {


    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter {
    private boolean isSpellPrepared = false;

    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        isSpellPrepared = true;
    }

    
    @Override
    public boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (isSpellPrepared) {
            return 12;
        }
        return 3;
    }
}
