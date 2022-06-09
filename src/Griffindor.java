public class Griffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Griffindor (String name, int thePowerOfMagic, int actionDistance, int nobility, int honour, int bravery ){
        super(name, thePowerOfMagic, actionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
    public int getNobility (){
        return nobility;
    }
    public int getHonour (){
        return honour;
    }
    public int getBravery (){
        return bravery;
    }
    public void printAbilityAll (){
        System.out.println(getName() + "; сила магии " + this.getThePowerOfMagic() + "; расстояние трансгрессии "
                + this.getActionDistance() + "; благородство " + getNobility() + "; честь "
                + getHonour() + "; храбрость " + getBravery());
    }

    public void compareStFaculty (Griffindor st){
        int sum = st.getNobility() + st.getHonour() + st.getBravery();
        int sum2 = this.getNobility() + this.getHonour() + this.getBravery();
        if (sum > sum2){
            System.out.println(st.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + st.getName());
        }

    }


}
