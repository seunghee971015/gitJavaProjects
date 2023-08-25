package com.kh.member;

public class MemberController {
    private Member[] m = new Member[SIZE];
    private static final int SIZE = 2;

    public int existMemberNum() {
        int count = 0;
        for (Member member : m) {
            if (member != null) {
                count++;
            }
        }
        return count;
    }

    public boolean checkId(String inputId) {
        for (Member member : m) {
            if (member != null && member.getId().equals(inputId)) {
                return true;
            }
        }
        return false;
    }

    public void insertMember(String id, String name, String password, String email, char gender, int age) {
        if (existMemberNum() >= SIZE) {
            System.out.println("최대 등록 가능한 회원 수는 " + SIZE + "명입니다.");
            return;
        }

        if (checkId(id)) {
            System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
            return;
        }

        for (int i = 0; i < SIZE; i++) {
            if (m[i] == null) {
                m[i] = new Member(id, name, password, email, gender, age);
                return;
            }
        }
    }

    public String searchId(String id) {
        for (Member member : m) {
            if (member != null && member.getId().equals(id)) {
                return member.inform();
            }
        }
        return "존재하지 않는 아이디입니다.";
    }

    public Member[] searchName(String name) {
        int count = 0;
        for (Member member : m) {
            if (member != null && member.getName().equals(name)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Member[] result = new Member[count];
        int index = 0;
        for (Member member : m) {
            if (member != null && member.getName().equals(name)) {
                result[index++] = member;
            }
        }
        return result;
    }

    public Member[] searchEmail(String email) {
        int count = 0;
        for (Member member : m) {
            if (member != null && member.getEmail().equals(email)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Member[] result = new Member[count];
        int index = 0;
        for (Member member : m) {
            if (member != null && member.getEmail().equals(email)) {
                result[index++] = member;
            }
        }
        return result;
    }

    public boolean updatePassword(String id, String password) {
        for (Member member : m) {
            if (member != null && member.getId().equals(id)) {
                member.setPassword(password);
                return true;
            }
        }
        return false;
    }

    public boolean updateName(String id, String name) {
        for (Member member : m) {
            if (member != null && member.getId().equals(id)) {
                member.setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        for (Member member : m) {
            if (member != null && member.getId().equals(id)) {
                member.setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < SIZE; i++) {
            if (m[i] != null && m[i].getId().equals(id)) {
                m[i] = null;
                return true;
            }
        }
        return false;
    }

    public void delete() {
        m = new Member[SIZE];
    }

    public Member[] printAll() {
        return m;
    }
}