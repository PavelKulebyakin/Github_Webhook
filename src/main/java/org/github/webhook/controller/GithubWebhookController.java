package org.github.webhook.controller;

import lombok.RequiredArgsConstructor;
import org.github.webhook.model.Payload;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/github")
public class GithubWebhookController {

    @PostMapping(consumes = "application/json")
    public ResponseEntity<String> handleWebhookPayload(@RequestHeader("X-GitHub-Event") String event, @RequestBody Payload payload) {
        System.out.println(event);
        System.out.println(payload.toString());
        return ResponseEntity.ok().body("Payload received");
    }

}
