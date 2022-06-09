public class Hogwarts {
    private String name;
    private int thePowerOfMagic;
    private int actionDistance;
    public Hogwarts (String name, int thePowerOfMagic, int actionDistance){
        this.name = name;
        this.thePowerOfMagic = thePowerOfMagic;
        this.actionDistance = actionDistance;
    }
    public String getName() {
        return name;
    }
    public int getThePowerOfMagic (){
        return thePowerOfMagic;
    }
    public int getActionDistance (){
        return actionDistance;
    }
    public void printAbilityAll (){
        System.out.println(getName() + "; сила магии " + this.getThePowerOfMagic() +
                "; расстояние трансгрессии " + this.getActionDistance());
    }

    public void compareStPower(Hogwarts st){
        int sum = st.getThePowerOfMagic() + st.getActionDistance();
        int sum2 = this.getThePowerOfMagic() + this.getActionDistance();

        if (sum > sum2){
            System.out.println(st.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + st.getName());
        }
    }
}
