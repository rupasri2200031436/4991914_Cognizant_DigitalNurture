package com.mockito.mockito_exercises;
import org.junit.jupiter.api.Test;
import com.mockito.mockito_exercise1.ExternalAPI;
import com.mockito.mockito_exercise1.MyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        ExternalAPI mockApi = mock(ExternalAPI.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}

