package async;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by sourindra.chatterji on 26/01/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class User {
    private String name;
    private String blog;

    @Override
    public String toString() {
        return "[name: " + name + ", blog: " + blog + "]";
    }
}
