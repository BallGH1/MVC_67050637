package View;

import java.util.List;
import Model.Request;

public class DashboardView {
    public void show(List<Request> requests) {

        System.out.println("\n--- Request Dashboard ---");

        for (Request r : requests) {
            System.out.println(r.getId()+ " | "+ r.getRequester().getName()+ " -> "+ r.getTarget().getName()+ " | "+ r.getNewrole()+ " | "+ r.getStatus()
            );
        }
    }
}