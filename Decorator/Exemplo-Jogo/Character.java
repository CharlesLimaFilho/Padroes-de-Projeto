public class Character implements MagicAbility {
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void magicAttack(Character target) {
        int damage = attackPower * 2;
        target.takeDamage(damage);
        System.out.println(name + " performed a magic attack on " + target.getName() + " for " + damage + " damage.");
    }

    @Override
    public void specialAttack(Character target) {
        int damage = attackPower * 3;
        target.takeDamage(damage);
        System.out.println(name + " performed a special attack on " + target.getName() + " for " + damage + " damage.");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

}