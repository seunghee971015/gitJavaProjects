package com.kh.member;

import java.util.Scanner;

public class MemberMenu {
    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public MemberMenu() {
    }

    public void mainMenu() {
        while (true) {
            System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
            System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

            if (mc.existMemberNum() >= 2)
                System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
            else
                System.out.println("1. 새 회원 등록");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAll();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴 번호입니다. 다시 입력하세요.");
            }
        }
    }

    public void insertMember() {
        System.out.println("새 회원을 등록합니다.");

        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("비밀번호: ");
        String password = sc.nextLine();
        System.out.print("이메일: ");
        String email = sc.nextLine();
        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        mc.insertMember(id, name, password, email, gender, age);
    }

    public void searchMember() {
        System.out.println("1. 아이디로 검색하기");
        System.out.println("2. 이름으로 검색하기");
        System.out.println("3. 이메일로 검색하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                searchId();
                break;
            case 2:
                searchName();
                break;
            case 3:
                searchEmail();
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.\n");
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }

    public void searchId() {
        System.out.print("검색할 아이디: ");
        String id = sc.nextLine();
        String result = mc.searchId(id);
        System.out.println(result);
    }

    public void searchName() {
        System.out.print("검색할 이름: ");
        String name = sc.nextLine();
        Member[] result = mc.searchName(name);
        if (result == null) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Member member : result) {
                System.out.println(member.inform());
            }
        }
    }

    public void searchEmail() {
        System.out.print("검색할 이메일: ");
        String email = sc.nextLine();
        Member[] result = mc.searchEmail(email);
        if (result == null) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Member member : result) {
                System.out.println(member.inform());
            }
        }
    }

    public void updateMember() {
        System.out.println("1. 비밀번호 수정하기");
        System.out.println("2. 이름 수정하기");
        System.out.println("3. 이메일 수정하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("수정할 회원의 아이디: ");
        String id = sc.nextLine();

        switch (choice) {
            case 1:
                updatePassword(id);
                break;
            case 2:
                updateName(id);
                break;
            case 3:
                updateEmail(id);
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.\n");
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }

    public void updatePassword(String id) {
        System.out.print("수정할 비밀번호: ");
        String password = sc.nextLine();
        boolean success = mc.updatePassword(id, password);
        if (success) {
            System.out.println("비밀번호가 수정되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }

    public void updateName(String id) {
        System.out.print("수정할 이름: ");
        String name = sc.nextLine();
        boolean success = mc.updateName(id, name);
        if (success) {
            System.out.println("이름이 수정되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }

    public void updateEmail(String id) {
        System.out.print("수정할 이메일: ");
        String email = sc.nextLine();
        boolean success = mc.updateEmail(id, email);
        if (success) {
            System.out.println("이메일이 수정되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }

    public void deleteMember() {
        System.out.println("1. 특정 회원 삭제하기");
        System.out.println("2. 모든 회원 삭제하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                deleteOne();
                break;
            case 2:
                deleteAll();
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.\n");
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다.");
        }
    }

    public void deleteOne() {
        System.out.print("삭제할 회원의 아이디: ");
        String id = sc.nextLine();
        boolean success = mc.delete(id);
        if (success) {
            System.out.println("성공적으로 삭제하였습니다.");
        } else { System.out.println("존재하지 않는 아이디입니다.");
        }
    }

    public void deleteAll() {
        mc.delete();
        System.out.println("모든 회원이 삭제되었습니다.");
    }

    public void printAll() {
        Member[] members = mc.printAll();
        if (members == null || members.length == 0) {
            System.out.println("저장된 회원이 없습니다.");
        } else {
            for (Member member : members) {
                if(member == null)
                    continue;
                System.out.println(member.inform());
            }
        }
    }

    public static void main(String[] args) {
        new MemberMenu();
    }
}
