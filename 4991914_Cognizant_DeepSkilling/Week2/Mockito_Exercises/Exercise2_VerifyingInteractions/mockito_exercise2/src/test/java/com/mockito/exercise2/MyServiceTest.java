package com.mockito.exercise2;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        //Create mock object
        ExternalAPI mockApi = mock(ExternalAPI.class);

        //Inject mock into the service
        MyService service = new MyService(mockApi);

        //Call method with mock interaction
        service.fetchData();

        //Verify that the method was called
        verify(mockApi).getData(); // ✅ Test passes if this method was called
    }
}
