import java.time.LocalDate;

public class Main {
    public static String checkLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            return year + " год — високосный год";
        } else {
            return year + " год — невисокосный год";
        }
    }//the method for task 1

    public static int getClientOS(String name) {
        if (name.equals("IOS")) {
            return 0;
        } else if (name.equals("Android")) {
            return 1;
        } else {
            return 2;
        }
    }//the method for task 2

    public static String checkClientOSAndCurrentYearForInstallApp(int clientOS, int currentYear) {

        if (clientOS == 0 && currentYear >= 2015) {
            return "Установите обычную версию приложения для OIS по ссылке";
        } else if (clientOS == 1 && currentYear >= 2015) {
            return "Установите обычную версию приложения для Android по ссылке";
        }
        if (clientOS == 0) {
            return "Установите облегченную версию приложения для OIS по ссылке";
        } else if (clientOS == 1) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        return "Для данной OIS приложение отсутствует";
    }//the method for task 2

    public static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }//the method for task 3

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        String s = checkLeapYear(year);
        System.out.println(s);
        System.out.println("Задача 2");
        String nameClientOS = "IOS";
        int clientOS = getClientOS(nameClientOS);
        int currentYear = LocalDate.now().getYear();
        String installApp = checkClientOSAndCurrentYearForInstallApp(clientOS, currentYear);
        System.out.println(installApp);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }
}