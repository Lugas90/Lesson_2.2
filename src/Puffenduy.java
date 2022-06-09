public class Puffenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffenduy (String name, int thePowerOfMagic, int actionDistance, int industriousness, int loyalty, int honesty){
        super(name, thePowerOfMagic, actionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void printAbilityAll (){
        System.out.println(getName() + "; сила магии " + this.getThePowerOfMagic() + "; расстояние трансгрессии "
                + this.getActionDistance() +"; трудолюбие " + getIndustriousness() + "; верность " + getLoyalty() +
                "; честность " + getHonesty());
    }

    public void compareStFaculty(Puffenduy st) {
        int sum = st.getIndustriousness() + st.getLoyalty() + st.getHonesty();
        int sum2 = this.getIndustriousness() + this.getLoyalty() + this.getHonesty();
        if (sum > sum2) {
            System.out.println(st.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + st.getName());
        }
    }
}
