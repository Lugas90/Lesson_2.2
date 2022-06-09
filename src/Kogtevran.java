public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Kogtevran(String name, int thePowerOfMagic, int actionDistance, int mind, int wisdom, int wit, int creation){
        super(name, thePowerOfMagic, actionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    public int getMind() {
        return mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getWit() {
        return wit;
    }
    public int getCreation() {
        return creation;
    }
    public void printAbilityAll (){
        System.out.println(getName() + "; сила магии " + this.getThePowerOfMagic() + "; расстояние трансгрессии "
                + this.getActionDistance() +"; ум " + mind + "; мудрость " + wisdom +
                "; остроумие " + wit + "; творчество " + creation);
    }

    public void compareStFaculty(Kogtevran st) {
        int sum = st.getMind() + st.getWisdom() + st.getWit() + st.getCreation();
        int sum2 = this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        if (sum > sum2) {
            System.out.println(st.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + st.getName());
        }
    }
}
