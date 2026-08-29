package View;

import java.util.List;
import java.util.Scanner;
import Model.Member;
import Model.Request;

public class RequestView {

    private Scanner sc = new Scanner(System.in);

    public Member selectTarget(List<Member> members) {

        System.out.println("\nSelect Target ->");

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

    public String selectRole() {
        System.out.println("\n-- Select Role --");
        System.out.println("1. PRODUCER");
        System.out.println("2. EDITOR");
        System.out.println("3. CREATOR");

        System.out.print("Select: ");
        int choice = sc.nextInt();

        if (choice == 1) return "PRODUCER";
        if (choice == 2) return "EDITOR";
        if (choice == 3) return "CREATOR";

        return null;
    }
    public void showRequest(Request r) {
        System.out.println("\n===== Request =====");
        System.out.println("ID       : " + r.getId());
        System.out.println("Requester: " + r.getRequester().getName());
        System.out.println("Target   : " + r.getTarget().getName());
        System.out.println("New Role : " + r.getNewrole());
        System.out.println("Status   : " + r.getStatus());
    }

    public int actionMenu() {
        System.out.println("\n1. Approve");
        System.out.println("2. Reject");
        System.out.println("3. Cancel");
        System.out.println("0. Back");
        System.out.print("Select: ");
        return sc.nextInt();
    }
    public String requestId() {
        System.out.print("Request ID: ");
        return sc.next();
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}