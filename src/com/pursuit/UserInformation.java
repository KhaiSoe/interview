package com.pursuit;

import java.util.List;

public interface UserInformation {
    void userInput();
    List allUserRoutes(String userInput);
    List userRoutesByService(String userInput, List<String> firstRoute, List<String> secondRoute);
}
