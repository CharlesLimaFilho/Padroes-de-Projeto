public class FireMagic extends MagicAbilityDecorator {
    public FireMagic(MagicAbility decoratedPath) {
        super(decoratedPath);
    }

    @Override
    public void magicAttack(Character target) {
        int damage = decoratedPath.getAttackPower() * 2 + 10; // Fire magic attack adds extra damage
        target.takeDamage(damage);
        System.out.println(decoratedPath.getName() + " performed a fire magic attack on " + target.getName() + " for " + damage + " damage.");
    }

    @Override
    public void specialAttack(Character target) {
        int damage = decoratedPath.getAttackPower() * 3 + 20; // Fire special attack adds even more damage
        target.takeDamage(damage);
        System.out.println(decoratedPath.getName() + " performed a fire special attack on " + target.getName() + " for " + damage + " damage.");
    }
    
}
