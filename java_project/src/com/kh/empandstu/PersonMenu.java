package com.kh.empandstu;
import java.util.Scanner;

public class PersonMenu {
    private Scanner sc = new Scanner(System.in);
    private PersonController pc = new PersonController();

    public void mainMenu() {
        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
            System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
            System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
            System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
            System.out.println("1. 학생 메뉴");
            System.out.println("2. 사원 메뉴");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid menu choice. Please try again.");
            }
        }
    }

    public void studentMenu() {
        boolean backToMain = false;
        boolean isAddBlock = false;

        while (!backToMain) {
            isAddBlock = (pc.personCount()[0] >= 3) ? true : false;

            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 보기");
            System.out.println("9. 메인으로");

            if (isAddBlock) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }

            System.out.print("메뉴 번호 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (isAddBlock) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        break;
                    }
                    insertStudent();
                    break;
                case 2:
                    printStudent();
                    break;
                case 9:
                    backToMain = true;
                    break;
                default:
                    System.out.println("Invalid menu choice. Please try again.");
            }
        }
    }

    public void employeeMenu() {
        boolean backToMain = false;
        boolean isAddBlock = false;

        while (!backToMain) {
            isAddBlock = (pc.personCount()[1] >= 10) ? true : false;

            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 보기");
            System.out.println("9. 메인으로");

            if (isAddBlock) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }

            System.out.print("메뉴 번호 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (isAddBlock) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        break;
                    }
                    insertEmployee();
                    break;
                case 2:
                    printEmployee();
                    break;
                case 9:
                    backToMain = true;
                    break;
                default:
                    System.out.println("Invalid menu choice. Please try again.");
            }
        }
    }

    public void insertStudent() {
        if (pc.personCount()[0] >= 3) {
            System.out.println("학생을 더 이상 추가할 수 없습니다.");
            return;
        }

        while (true) {
            System.out.print("학생 이름 : ");
            String name = sc.nextLine();
            System.out.print("학생 나이 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("학생 키 : ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("학생 몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("학생 학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("학생 전공 : ");
            String major = sc.nextLine();

            pc.insertStudent(name, age, height, weight, grade, major);

            if (pc.personCount()[0] >= 3) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
                return;
            }

            System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
            String response = sc.nextLine();
            if (response.equals("n")) {
                break;
            }
        }

        System.out.println("학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
    }
    public void printStudent() {
        Student[] students = pc.printStudent();
        if (students.length == 0) {
            System.out.println("현재 저장된 학생 데이터가 없습니다.");
            return;
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void insertEmployee() {
        if (pc.personCount()[1] >= 10) {
            System.out.println("사원을 더 이상 추가할 수 없습니다.");
            return;
        }
        while (true) {
            System.out.print("사원 이름 : ");
            String name = sc.nextLine();
            System.out.print("사원 나이 : ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("사원 키 : ");
            double height = sc.nextDouble();
            sc.nextLine(); // Consume newline
            System.out.print("사원 몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine(); // Consume newline
            System.out.print("사원 급여 : ");
            int salary = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("사원 부서 : ");
            String dept = sc.nextLine();

            pc.insertEmployee(name, age, height, weight, salary, dept);

            if (pc.personCount()[1] >= 10) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
                return;
            }

            System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
            String response = sc.nextLine();
            if (response.equals("n")) {
                break;
            }
        }
    }

    public void printEmployee() {
        Employee[] employees = pc.printEmployee();
        if (employees.length == 0) {
            System.out.println("현재 저장된 사원 데이터가 없습니다.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
