public class Main {
    public static void main(String[] args) {

        //Первая задача

        var dog = 8.0;
        var cat = 3.6;
        var peper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);

        //Вторая задача

        dog = dog + 4;
        cat = cat + 4;
        peper = peper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);

        //Третья задача

        dog = dog - 3.5;
        cat = cat - 1.6;
        peper = peper - 7679;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);

        //Четвертая задача

        var friend  = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //Пятая задача

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //Шестая задача

        var firstFigther = 78.2;
        var secondFigther = 82.7;

        var sumWeight = firstFigther + secondFigther;

        System.out.println("Общий вес бойцов составил " + sumWeight + "кг");

        var differenceWeigth1 = secondFigther - firstFigther;
        System.out.println("Разница в весе между бойцами составила " + differenceWeigth1 + "кг");

        var differenceWeigth = sumWeight % firstFigther;
        System.out.println("Разница в весе между бойцами составила " + differenceWeigth + "кг");

        //восьмая задача

        var totalHours = 640;

        var workers = 640 / 8;
        System.out.println("Всего работников в компании " + workers + " человек.");

        var workersB = workers + 94;
        var totalHoursB = totalHours / workersB;

        System.out.println("Если в компании работает " + workersB + " человек, то всего " + totalHoursB + " часов работы может быть поделено между сотрудниками");
    }
}