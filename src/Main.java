public class Main {
    public static void main(String[] args) {

        //Task 1
        byte ironMan = 100;
        short captainAmerica = 1000;
        int thor = 1000000000;
        long doctorStrange = 777777777L;
        float vandaMaximoff = 33.3F;
        double vision = 66.666666666;
        System.out.println("Значение переменной ironMan с типом byte равно " + ironMan);
        System.out.println("Значение переменной captainAmerica с типом short равно " + captainAmerica);
        System.out.println("Значение переменной thor с типом int равно " + thor);
        System.out.println("Значение переменной doctorStrange с типом long равно " + doctorStrange);
        System.out.println("Значение переменной vandaMaximoff с типом float равно " + vandaMaximoff);
        System.out.println("Значение переменной vision с типом double равно " + vision);

        //Task 2
        float f = 27.12F;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        short x = -159;
        short y = 27897;
        byte b = 67;

        //Task 3
        byte lyudmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        short totalPaper = 480;
        short paper = (short) (totalPaper / (lyudmilaP + annaS + ekaterinaA));
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги.");

        //Task 4
        //Variant 1
        int performance = 16;
        int machinePerformance = performance / 2;
        int twentyMinutes = machinePerformance * 20;
        int threeDays = machinePerformance * 60 * 24 * 3;
        int month = machinePerformance * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month + " штук бутылок.");

        //Variant 2
        int bottlePerformance = 16;
        int twentyM = bottlePerformance * 10;
        int threeD = bottlePerformance * 30 * 24 * 3;
        int month1 = bottlePerformance * 30 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + twentyM + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeD + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month1 + " штук бутылок.");

        //Task 5
        byte whiteColorJar = 2;
        byte brownColorJar = 4;
        byte totalJar = 120;
        byte classRooms = (byte) (totalJar / (whiteColorJar + brownColorJar));
        byte totalWhiteColorJar = (byte) (whiteColorJar * classRooms);
        byte totalBrownColorJar = (byte) (brownColorJar * classRooms);
        System.out.println("В школе, где " + classRooms + " классов, нужно " + totalWhiteColorJar + " банок белой краски и " + totalBrownColorJar + " банок коричневой краски.");

        //Task 6
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        bananas = bananas * 80;
        milk = milk / 100 * 105;
        iceCream = iceCream * 100;
        eggs = eggs * 70;
        int totalWeightInGrams = bananas + milk + iceCream + eggs;
        double totalWeightInKg = totalWeightInGrams / 1000.00;
        System.out.println("Вес блюда после изготовления составил " + totalWeightInGrams + " грамм, или " + totalWeightInKg + " кг.");

        //Task 7
        short dietOne = 250;
        short dietTwo = 500;
        short needLooseWeight = 7000;
        short totalSlimmingDietOne = (short) (needLooseWeight / dietOne);
        short totalSlimmingDietTwo = (short) (needLooseWeight / dietTwo);
        short averageSlimmingDays = (short) ((totalSlimmingDietOne + totalSlimmingDietTwo) / 2);
        System.out.println("При диете № 1, вы будете худеть " + totalSlimmingDietOne + " дней,");
        System.out.println("При диете № 2, вы будете худеть " + totalSlimmingDietTwo + " дней.");
        System.out.println("В среднем, вы похудеете за " + averageSlimmingDays + " дней.");

        //Task 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int annualIncomeMasha = salaryMasha * 12;
        int annualIncomeDenis = salaryDenis * 12;
        int annualIncomeKristina = salaryKristina * 12;
        int salaryMashaAfterUpsurge = (salaryMasha) + ((salaryMasha / 100) * 10);
        int salaryDenisAfterUpsurge = (salaryDenis) + ((salaryDenis / 100) * 10);
        int salaryKristinaAfterUpsurge = (salaryKristina) + ((salaryKristina / 100) * 10);
        int newAnnualIncomeMasha = salaryMashaAfterUpsurge * 12;
        int newAnnualIncomeDenis = salaryDenisAfterUpsurge * 12;
        int newAnnualIncomeKristina = salaryKristinaAfterUpsurge * 12;
        int differenceIncomeMasha = newAnnualIncomeMasha - annualIncomeMasha;
        int differenceIncomeDenis = newAnnualIncomeDenis - annualIncomeDenis;
        int differenceIncomeKristina = newAnnualIncomeKristina - annualIncomeKristina;
        System.out.println("После повышения, Маша стала получать " + salaryMashaAfterUpsurge + " рублей, и ее годовой доход вырос на " + differenceIncomeMasha + " рублей.");
        System.out.println("После повышения, Денис стал получать " + salaryDenisAfterUpsurge + " рублей, и его годовой доход вырос на " + differenceIncomeDenis + " рублей.");
        System.out.println("После повышения, Кристина стала получать " + salaryKristinaAfterUpsurge + " рублей, и ее годовой доход вырос на " + differenceIncomeKristina + " рублей.");
        System.out.println("Начальник - молодец!");
    }
}