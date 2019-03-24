package commands;

import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Login extends ChatCommand {
    @Parameter (names = {"-u","--username"}, description = "Connection username", required = true)
    private String username;

    @Parameter (names = {"-p","--password"}, description = "Connection password", required = true, password = true)
    private String password;

}
