import Controller.*;
import Model.*;
import View.MemberView;

import java.util.List;

public class app {

    public static void main(String[] args) {
        Member M1 = new Member("M01", "คุยกันได้", "PRODUCER", true);
        Member M2 = new Member("M02", "ใบเสร็จอยู่ไหน", "FINANCE", true);
        Member M3 = new Member("M03", "ตัดคลิปก่อน", "EDITOR", true);
        Member M4 = new Member("M04", "เพื่อนกันตลอดไป", "CREATOR", true);
        Member M5 = new Member("M05", "อ่านแชตย้อนหลัง", "CREATOR", true);

        Request r1 = new Request("C01", M1, M2, "EDITOR");
        Request r2 = new Request("C02", M2, M3, "EDITOR");
        Request r3 = new Request("C03", M3, M4, "EDITOR");
        Request r4 = new Request("C04", M4, M5, "EDITOR");

        r1.addvote(M3, "APPROVE");
        r2.addvote(M4, "REJECT");
        r4.addvote(M1, "APPROVE");

        RequestList requestList = new RequestList();

        requestList.addRequest(r1);
        requestList.addRequest(r2);
        requestList.addRequest(r3);
        requestList.addRequest(r4);

        RequestController controller = new RequestController(requestList);
        MemberView memberView = new MemberView(controller);

        memberView.start(List.of(M1, M2, M3, M4, M5)
        );
    }
}