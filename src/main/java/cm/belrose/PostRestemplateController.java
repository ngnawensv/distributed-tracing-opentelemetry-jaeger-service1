package cm.belrose;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/service1")
@Slf4j
@RequiredArgsConstructor
public class PostRestemplateController {

    private final RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts() {
        var response = restTemplate.exchange(
                "http://localhost:8081/service2/posts",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Post>>() {
                }
        );
        return ResponseEntity.ok(response.getBody());
    }
}