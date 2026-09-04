public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 100, 10);
        Character enemy = new Character("Enemy", 100, 8);

        // Hero uses FireMagic
        MagicAbility fireMagic = new FireMagic(hero);
        
        // Hero performs magic attack on enemy
        fireMagic.magicAttack(enemy);
        System.out.println("Enemy's health after magic attack: " + enemy.getHealth());

        // Hero performs special attack on enemy
        fireMagic.specialAttack(enemy);
        System.out.println("Enemy's health after special attack: " + enemy.getHealth());

        // Enemy attacks hero
        enemy.magicAttack(hero);
        System.out.println("Hero's health after enemy's magic attack: " + hero.getHealth());

        // Hero uses WaterMagic
        MagicAbility waterMagic = new WaterMagic(hero);
        waterMagic.magicAttack(enemy);
        System.out.println("Enemy's health after water magic attack: " + enemy.getHealth());
    }
}
