public class Main {
    public static void main(String[] args) {

        Griffindor garry = new Griffindor("Гарри Поттер", 20, 40, 42, 60, 54);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 25, 30, 35, 48, 52);
        Griffindor ron = new Griffindor("Рон Уизли", 10, 12, 20, 32, 40);

        Slytherin drako = new Slytherin("Драко Малфой", 19, 20, 26, 20, 48, 35, 53);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 14, 17, 24, 35, 38, 31, 42);
        Slytherin gregory = new Slytherin("Грегори Гойл", 16, 21, 35, 25, 29, 36, 31);

        Puffenduy zakhariya = new Puffenduy("Захария Смит", 18, 23, 21, 25, 39);
        Puffenduy sedrick = new Puffenduy("Седрик Диггори", 14, 21, 26, 36, 40);
        Puffenduy jastin = new Puffenduy("Джастин Финч-Флетчли", 20, 25, 40, 36, 30);

        Kogtevran chzhou = new Kogtevran("Чжоу Чанг", 16, 23, 32, 41, 26, 29);
        Kogtevran padma = new Kogtevran("Падма Патил", 16, 21, 30, 34, 35, 40);
        Kogtevran marcus = new Kogtevran("Маркус Белби", 18, 23, 36, 29, 45, 32);

        drako.printAbilityAll();
        marcus.printAbilityAll();
        ron.printAbilityAll();
        graham.printAbilityAll();
        zakhariya.compareStPower(padma);
        germiona.compareStFaculty(garry);

    }
}