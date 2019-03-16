package ru.nwth.routing;

import org.apache.camel.CamelContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoutingApplicationTests {

    @Autowired
    CamelContext camelContext;

    @Test
    public void contextLoads() {
        List<String> componentNames = camelContext.getComponentNames();
        for (int i = 0; i < componentNames.size(); i++) {
            System.out.println("! "+componentNames.get(i));
        }
    }

}
