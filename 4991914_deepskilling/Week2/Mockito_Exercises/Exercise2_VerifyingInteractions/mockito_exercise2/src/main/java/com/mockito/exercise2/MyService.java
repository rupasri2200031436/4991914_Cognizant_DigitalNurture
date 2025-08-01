package com.mockito.exercise2;
public class MyService {

    private ExternalAPI api;

    public MyService(ExternalAPI api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData(); // This will be mocked in the test
    }
}

