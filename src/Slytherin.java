public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefullnes;
    private int lustForPower;

    public Slytherin(String name, int thePowerOfMagic, int actionDistance, int cunning, int determination, int ambition,
                     int resourcefullnes, int lustForPower) {
        super(name, thePowerOfMagic, actionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefullnes = resourcefullnes;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefullnes() {
        return resourcefullnes;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void printAbilityAll() {
        System.out.println(getName() + "; сила магии " + this.getThePowerOfMagic() + "; расстояние трансгрессии "
                + this.getActionDistance() + " хитрость " + getCunning() + "; решительность " + getDetermination() + "; амбициозность "
                + getAmbition() + "; находчивость " + getResourcefullnes() + "; жажда власти " + getLustForPower());
    }

    public void compareStFaculty(Slytherin st) {
        int sum = st.getCunning() + st.getDetermination() + st.getAmbition() + st.getResourcefullnes() + st.getLustForPower();
        int sum2 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefullnes() + this.getLustForPower();
        if (sum > sum2) {
            System.out.println(st.getName() + " лучший Слизаринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Слизаринец, чем " + st.getName());
        }
    }
}
