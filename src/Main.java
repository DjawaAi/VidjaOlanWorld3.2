public class Main {
    public static void main(String[] args) {
        //Задание №1.
    byte b = -12;
    int a = 49800;
    short g = 26648;
    long rF = -74653L;
    float d = 674.875f;
    double hF = -4545.64556;
    System.out.println("Значение переменной b с типом byte равно " +b);
    System.out.println("Значение переменной a с типом int равно " +a);
    System.out.println("Значение переменной g с типом short равно " +g);
    System.out.println("Значение переменной rF с типом long равно " +rF);
    System.out.println("Значения переменных d с типом float равно " +d+ " и hF с типом double равна " +hF);
        //Задание №2.
    float d2 = 27.12f;
    long r2 = 987678965549L;
    double h2 = 2.786;
    short g2 = 569;
    short j = -159;
    int aI = 27897;
    byte bB = 67;
    System.out.println(d2+", " +r2+ ", " +h2+ ", " +g2+", " +j+", " +aI+", " +bB);
        //Задание №3.
    byte людмилаПав = 23; //ученика
    byte аннаСерг = 27;  //ученика
    byte екатеринаАнд = 30; //ученика
    short totalNumber = 480; //листов
    short sheetsStudent = (short) (totalNumber / (людмилаПав + аннаСерг + екатеринаАнд));
    System.out.println("На каждого ученика рассчитано " +sheetsStudent+ " листов бумаги.");
        //Задание №4.
    byte bottle = 16; //бутылок
    byte time = 2; // время
    byte bottOneMinute = (byte) (bottle / time); //бутылок за одну минуту
        System.out.println("За 1 минуту машина произвела " +bottOneMinute+ " штук бутылок.");
    short bottleMinute20 = (short)(bottOneMinute * 20); //бутылок за 20 минут
        System.out.println("За 20 минут машина произвела " +bottleMinute20+ " штук бутылок.");
    short bottleOneDay = (short) (bottleMinute20 * 3 * 24); //бутылок за сутки
        System.out.println("За 1 сутки машина произвела " +bottleOneDay+ " штук бутылок.");
    int bottleThreeDay = (int) (bottleOneDay * 3); //бутылок в 3 дня
        System.out.println("За 3 дня машина произвела " +bottleThreeDay+ " штук бутылок.");
    int bottleOneMonth = (int)(bottleThreeDay * 10); //бутылок в месяц
        System.out.println("За 1 месяц машина произвела " +bottleOneMonth+ " штук бутылок.");
        //Задание №5.
    byte totalCansPaints = 120;
    byte cansWhiteClass = 2;
    byte cansBrownClass = 4;
    byte numberClasses = (byte)(totalCansPaints / (cansWhiteClass + cansBrownClass)); //2*X + 4*X = 120 ==>> X = 120/6
    byte totalWhiteCans = (byte)(numberClasses * cansWhiteClass);
    byte totalBrownCans = (byte) (numberClasses * cansBrownClass);
    System.out.println("В школе, где " +numberClasses+ " классов, нужно " +totalWhiteCans+ " банок белой краски и " +totalBrownCans+ " банок коричневой краски." );
        //Задание №6
    short numberBananas = 5; //штук
    short weightBanana = 80; //грамм
    short volumeMilk = 200; //мл.
    short weight100mlMilk = 105; //г.
    short numberIceCream = 2;
    short weightIceCream = 100; //г.
    short numberEggs = 4;
    short weightEggs = 70; //г.
    short cocktailGrams = (short) (numberBananas * weightBanana + volumeMilk / 100 * weight100mlMilk +
            numberIceCream * weightIceCream + numberEggs * weightEggs);
    float cocktailKg = (float) cocktailGrams / 1000;
    System.out.println("Вес спортзавтрака " +cocktailGrams+ " грамма");
    System.out.println("Вес спортзавтрака " +cocktailKg+ " кг.");
        //Задание №7
    short loseWeight = 7; // кг
    short loseWeightDayMin = 250; //грамм в день
    short loseWeightDayMax = 500; //гр. в день
    short numberDaysDietMin = (short) (loseWeight * 1000 / loseWeightDayMin);
    short numberDaysDietMax = (short) (loseWeight * 1000 / loseWeightDayMax);
    short numberDaysDietAverage = (short) ((numberDaysDietMax + numberDaysDietMin) / 2);
    System.out.println(numberDaysDietMin+ " дней уйдет на похудение");
    System.out.println(numberDaysDietMax+ " дней уйдет на похудение в ускореном темпе");
    System.out.println(numberDaysDietAverage+ " дней уйдет на похудение в среднем");
        //Задание №8
    int машаЗп = 67760;
    int денисЗп = 83690;
    int кристинаЗп = 76230;
    byte индексация = 10; //%
    float проиндекМашаЗп = (float) (машаЗп *  (1 +(float) индексация / 100));
    float годовойПриростМ  = проиндекМашаЗп * 12 - машаЗп * 12;
    System.out.println("Проиндексированая зарплата Маши выходит " +проиндекМашаЗп+ " рублей. Годовой доход вырос на " +годовойПриростМ+ " рублей");
    float проиндекДенисЗп = (float) (денисЗп *  (1 +(float) индексация / 100));
    float годовойПриростД  = проиндекДенисЗп * 12 - денисЗп * 12;
    System.out.println("Проиндексированая зарплата Дениса выходит " +проиндекДенисЗп+ " рублей. Годовой доход вырос на " +годовойПриростД+ " рублей");
    float проиндекКристинаЗп = (float) (кристинаЗп *  (1 +(float) индексация / 100));
    float годовойПриростК  = проиндекКристинаЗп * 12 - кристинаЗп * 12;
    System.out.println("Проиндексированая зарплата Кристины выходит " +проиндекКристинаЗп+ " рублей. Годовой доход вырос на " +годовойПриростК+ " рублей");
    }
}
