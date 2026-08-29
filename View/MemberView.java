package View;

import java.util.List;
import java.util.Scanner;

import Controller.RequestController;
import Model.Member;

public class MemberView {

    private Scanner sc = new Scanner(System.in);
    private RequestController controller;

    public MemberView(RequestController controller) {
        this.controller = controller;
    }
    
    public Member start(List<Member> members) {
        System.out.println("--- Select User ---");

        for (int i = 0; i < members.size(); i++) {
            System.out.println(
                (i + 1) + ". " + members.get(i).getName()
            );
        }
        System.out.print("Select: ");
        int choice = sc.nextInt();
        if (choice < 1 || choice > members.size()) {
            return null;
        }
        return members.get(choice - 1);
    }

    public int menu() {
        System.out.println("\n--- Menu ----");
        System.out.println("1. Member List");
        System.out.println("2. Create Request");
        System.out.println("3. Request Dashboard");
        System.out.println("4. Manage Request");
        System.out.println("0. Exit");
        System.out.print("Select: ");
        return sc.nextInt();
    }
    public void showMembers(List<Member> members) {
        System.out.println("\n--- Members---");
        for (Member m : members) {
            System.out.println(m.getName() + " | "+ m.getRole() + " | "+ (m.active() ? "Active" : "Inactive")
            );
        }
    }
}