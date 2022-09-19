public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Boss health = " + getHealth() +
                "; Boss damage = " + getDamage() +
                "; Weapon name " + getWeapon().getWeaponName()  +
                "; Type of Boss's weapon = " + getWeapon().getSuperLegs();
    }



}
