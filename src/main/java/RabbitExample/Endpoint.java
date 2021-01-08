package RabbitExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class Endpoint {
    private final MyService service;

    public Endpoint(final MyService service) {
        this.service = service;
    }

    @GetMapping("test")
    private ResponseEntity<Boolean> test() throws IOException {
        service.sendMessage();
        return new ResponseEntity<>(true, null, HttpStatus.OK);
    }
}
