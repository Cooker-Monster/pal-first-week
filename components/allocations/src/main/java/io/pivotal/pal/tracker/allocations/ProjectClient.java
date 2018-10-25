package io.pivotal.pal.tracker.allocations;

import org.springframework.web.client.RestOperations;

public class ProjectClient {

    private final RestOperations restOperations;
    private final String registrationServerEndpoint;

    public ProjectClient(RestOperations restOperations, String registrationServerEndpoint) {
        this.restOperations= restOperations;
        this.registrationServerEndpoint = registrationServerEndpoint;
    }

    public ProjectInfo getProject(long projectId) {
        String url = registrationServerEndpoint + "/projects/" + projectId;
        System.out.println("this is the url getting called"+url);
        return restOperations.getForObject(url, ProjectInfo.class);
    }
}
