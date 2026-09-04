public class WaterMagic extends MagicAbilityDecorator {
    public WaterMagic(MagicAbility decoratedPath) {
        super(decoratedPath);
    }

    @Override
    public void magicAttack(Character target) {
        int damage = decoratedPath.getAttackPower() * 2 + 5; // Water magic attack adds extra damage
        target.takeDamage(damage);
        System.out.println(decoratedPath.getName() + " performed a water magic attack on " + target.getName() + " for " + damage + " damage.");
    }

    @Override
    public void specialAttack(Character target) {
        int damage = decoratedPath.getAttackPower() * 3 + 15; // Water special attack adds even more damage
        target.takeDamage(damage);
        System.out.println(decoratedPath.getName() + " performed a water special attack on " + target.getName() + " for " + damage + " damage.");
    }
    
}
