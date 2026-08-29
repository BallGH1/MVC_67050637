package Model;

import java.util.ArrayList;
import java.util.List;

public class RequestList {
    private List<Request> requestList;

    public RequestList() {
        requestList = new ArrayList<>();
    }
    public void addRequest(Request request) {
        requestList.add(request);
    }
    public List<Request> getAllRequests() {
        return requestList;
    }
    public Request getRequest_target(Member target) {

        for (Request request : requestList) {

            if (request.getTarget().equals(target)&& request.getStatus().equals("PENDING")) {
                return request;
            }
        }
        return null;
    }
    public List<Request> getRequest(String status) {
        List<Request> result = new ArrayList<>();
        for (Request request : requestList) {

            if (request.getStatus().equals(status)) {
                result.add(request);
            }
        }
        return result;
    }
    public Request getRequestById(String id) {
        for (Request request : requestList) {
            if (request.getId().equals(id)) {
                return request;
            }
        }
        return null;
    }
}