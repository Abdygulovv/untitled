import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();
        if (month.equalsIgnoreCase("Декабрь")|| month.equalsIgnoreCase("Январь") ||
                month.equalsIgnoreCase("Февраль")) {
            System.out.println("Зима");
        } else if (month.equalsIgnoreCase("Март") || month.equalsIgnoreCase("Апрель") ||
                month.equalsIgnoreCase("Май")) {
            System.out.println("Весна");
        }else if (month.equalsIgnoreCase("Июнь") || month.equalsIgnoreCase("Июль") ||
                month.equalsIgnoreCase("Август")) {
            System.out.println("Лето");
        }else if (month.equalsIgnoreCase("Сентябрь") || month.equalsIgnoreCase("Октябрь") ||
                month.equalsIgnoreCase("Ноябрь")) {
            System.out.println("Осень");
        }else {
            System.out.println("Месяц не существует");
        }{

                System.out.println("-----");

            }
            System.out.print("Введите название месяца: ");
            String month1 = scanner.nextLine();

            switch (month1) {
                case "Декабрь":
                case "Январь":
                case "Февраль":
                    System.out.println("Зима");
                    break;
                case "Март":
                case "Апрель":
                case "Май":
                    System.out.println("Весна");
                    break;
                case "Июнь":
                case "Июль":
                case "Август":
                    System.out.println("Лето");
                    break;
                case "Сентябрь":
                case "Октябрь":
                case "Ноябрь":
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Месяц не существует");
                    break;
            }

        }
    }
