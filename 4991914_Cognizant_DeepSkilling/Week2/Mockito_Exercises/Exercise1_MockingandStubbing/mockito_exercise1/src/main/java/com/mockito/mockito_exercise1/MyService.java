package com.mockito.mockito_exercise1;


public class MyService {
    private ExternalAPI externalApi;

    public MyService(ExternalAPI externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}

