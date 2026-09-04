public abstract class MagicAbilityDecorator implements MagicAbility {
    protected MagicAbility decoratedPath;

    public MagicAbilityDecorator(MagicAbility decoratedPath) {
        this.decoratedPath = decoratedPath;
    }

    @Override
    public int getAttackPower() {
        return decoratedPath.getAttackPower();
    }

    @Override
    public String getName() {
        return decoratedPath.getName();
    }

    @Override
    public void magicAttack(Character target) {
        decoratedPath.magicAttack(target);
    }

    @Override
    public void specialAttack(Character target) {
        decoratedPath.specialAttack(target);
    }
    
}
