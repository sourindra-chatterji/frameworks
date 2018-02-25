package async;

import com.google.common.util.concurrent.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * Created by sourindra.chatterji on 26/01/18.
 */
@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final GitHubLookupService gitHubLookupService;

    public AppRunner(GitHubLookupService gitHubLookupService) {
        this.gitHubLookupService = gitHubLookupService;
    }

    @Override
    public void run(String... strings) throws Exception {
        // Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
        CompletableFuture<User>[] completableFutures = new CompletableFuture[100];
        RateLimiter rateLimiter = RateLimiter.create(10);
        for (int i = 0; i < 100; i++) {
            rateLimiter.acquire();
            long start1 = System.currentTimeMillis();
            CompletableFuture<User> page1 = gitHubLookupService.findUser("PivotalSoftware");
            logger.info("page1 time: " + (System.currentTimeMillis() - start1));

            completableFutures[i] = page1;
            logger.info("count: {}", i);
        }
        // Wait until they are all done
        CompletableFuture.allOf(completableFutures).join();

        // Print results, including elapsed time
        logger.info("Elapsed time: " + (System.currentTimeMillis() - start));

    }
}
