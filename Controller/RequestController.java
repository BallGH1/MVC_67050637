package Controller;
import Model.*;
public class RequestController {
    private RequestList requestList;
    public RequestController(RequestList requestList) {
        this.requestList = requestList;
    }

    public boolean createRequest(String id ,Member requester,Member target,String newRole) {
        if (requestList.getRequest_target(target) != null) {
             return false;
    }
        Request  request = new Request(id, requester, target, newRole) ;
        requestList.addRequest(request);
        return true;
    }

    public void voteRequest( Member member,String requestId,String isApprove) {
        Request request = requestList.getRequestById(requestId);
        if (request == null) {
            System.out.println("Request not found.");
            return;
        }
        if (!request.getStatus().equals("PENDING")) {
            System.out.println("Request is not pending.");
            return;
        }

        if (request.getRequester().equals(member)) {
            System.out.println("Requester cannot vote.");
            return;
        }
        request.addvote(member, isApprove);
        System.out.println("Vote added");
    }
    public void cancelRequest(Member member,String requestId) {
        Request request = requestList.getRequestById(requestId);
        if (request == null) {
            System.out.println("Request not found");
            return;
        }
        if (!request.getTarget().equals(member)) {
            System.out.println("cannot cancel this request");
            return;
        }
        if (!request.getStatus().equals("PENDING")) {
            System.out.println("Cannot cancel this request.");
            return;
        }
        request.setStatus("CANCELLED");

        System.out.println("Request cancelled.");
    }
}