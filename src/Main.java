//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // exercise 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);

        // exercise 2
        var add = 4;
        dog = dog + add;
        cat = cat + add;
        paper = paper + add;
        System.out.println(dog + ", " + cat + ", " + paper);

        // exercise 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + ", " + cat + ", " + paper);

        // exercise 4
        var friend = 4;
        System.out.print(friend + " ");
        friend = friend + 2;
        System.out.print(friend + " ");
        friend = friend / 7;
        System.out.println(friend + " ");

        // exercise 5
        var frog = 3.5;
        System.out.print(frog + " ");
        frog = frog * 10;
        System.out.print(frog + " ");
        frog = frog / 7;
        System.out.print(frog + " ");
        frog = frog + 4;
        System.out.println(frog + " ");

        // exercise 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.print(firstBoxer + secondBoxer + " ");
        System.out.println(secondBoxer - firstBoxer);

        // exercise 7
        System.out.println(secondBoxer % firstBoxer);

        //exercise 8
        var timeJob = 640;
        var timeEmployee = 8;
        var allEmployee = timeJob / timeEmployee;
        System.out.println("Всего работников в компании " + allEmployee + " человек».");
        allEmployee = allEmployee + 94;
        timeJob = allEmployee * timeEmployee;
        System.out.println("Если в компании работает " + allEmployee + " человек, то всего " + timeJob +" часов" +
                " работы может быть поделено между сотрудниками");


    }
}