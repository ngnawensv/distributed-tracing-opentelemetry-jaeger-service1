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
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/service1")
@Slf4j
@RequiredArgsConstructor
public class PostWebClientController {

    private final WebClient webClient;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/postsWebClient")
    public ResponseEntity<List<Post>> getPostsWebClient() {
            List<Post> posts = webClient.get()
                    .uri("/service2/postsWebClient")
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<Post>>() {})
                    .block(); // Blocking call for synchronous endpoint
            return ResponseEntity.ok(posts);
    }
}