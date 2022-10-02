package au.com.newscorp.interview.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Configuration
public class FirebaseAuthConfig {

    @Value("classpath:service-account.json")
    Resource serviceAccount;

    @Bean
    FirebaseAuth firebaseAuth() throws IOException {
        var options = FirebaseOptions.builder().setCredentials(GoogleCredentials.fromStream(serviceAccount.getInputStream())).build();
        var firebaseApp = FirebaseApp.initializeApp(options);
        return FirebaseAuth.getInstance(firebaseApp);
    }

    @Bean
    public RestTemplate restTemplate() { return new RestTemplate(); }
  
}