package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest {

/*
    @Autowired
    private MockMvc mockMvc;
*/

    private final MyService myService = new MyService();


    @Test
    void sayHello_shouldReturnHelloWorld() {
        String result = myService.sayHello();
        assertThat(result).isEqualTo("Hello, World!");
    }


/*
    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/demo/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }
*/

}