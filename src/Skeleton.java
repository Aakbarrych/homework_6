public class Skeleton extends Boss{
    private int amountOfArrows;


    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }


    public String printInfo(){
        return "Skeleton's health = " + this.getHealth() + ";" + " Skeleton's damage = " + this.getDamage() + ";" + " Weapon name " + this.getWeapon().getWeaponName() + "; " + "Type of Skeleton's weapon = " +
                this.getWeapon().getSuperLegs()+ "; " + " Number Of Arrow = " + amountOfArrows;

    }
}
