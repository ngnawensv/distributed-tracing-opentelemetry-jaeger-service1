package cm.belrose;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/service1")
@Slf4j
@RequiredArgsConstructor
public class PostRestClientController {

    private final RestClient restClient;

    @Value("${spring.application.name}")
    private String applicationName;


    @GetMapping("/postsRestClient")
    public ResponseEntity<List<Post>> getPosts1() {
        List<Post> posts = restClient.get()
                .uri("/service2/postsRestClient")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});

        return ResponseEntity.ok(posts);
    }
}