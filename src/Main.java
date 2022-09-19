public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(700);
        boss.getWeapon().setSuperLegs(WeaponType.AXE);
        System.out.println("Boss's health: " + boss.getHealth()
                + "; Boss's damage: " + boss.getDamage()
                + "; Boss's weapon: " + boss.getWeapon());
        System.out.println(boss.printInfo());

        Skeleton skeletonLarry = new Skeleton();
        skeletonLarry.setHealth(40);
        skeletonLarry.setDamage(7);
        skeletonLarry.setAmountOfArrows(25);
        skeletonLarry.getWeapon().setWeaponName(": Sword");
        skeletonLarry.getWeapon().setSuperLegs(WeaponType.SWORD);
        Skeleton skeletonNick = new Skeleton();
        skeletonNick.setHealth(33);
        skeletonNick.setDamage(10);
        skeletonNick.setAmountOfArrows(20);
        skeletonNick.getWeapon().setWeaponName(": Spear");
        skeletonNick.getWeapon().setSuperLegs(WeaponType.SPEAR);
        System.out.println(skeletonLarry.printInfo());
        System.out.println(skeletonNick.printInfo());


    }
}