package com.kh.friend;

public class MainStart {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-2333-5554");
		frns[cnt++] = new UnivFriend("LEE", "Electronics", "010-2622-5120");
		frns[cnt++] = new CompFriend("LEE", "R&D 1", "010-9855-6562");
		frns[cnt++] = new CompFriend("LEE", "R&D 2", "010-1213-5556");
		
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo();
			System.out.println();
		}

	}

}

