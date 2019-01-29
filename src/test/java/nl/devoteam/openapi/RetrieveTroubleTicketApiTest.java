package nl.devoteam.openapi;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RetrieveTroubleTicketApiTest {
    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void sayHelloTest() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8083/tmf-api/troubleTicket/v2/troubleTicket/3", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        String s = response.getBody();
        assertThat(s.equals("hello"));

    }
}
