package org.github.webhook.config;

import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Component
@FieldDefaults(level = PRIVATE)
public class GitHubProperties {

    @Value("${github.webhook-path}")
    String webhookPath;

}
