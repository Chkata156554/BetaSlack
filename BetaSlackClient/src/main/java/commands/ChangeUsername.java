package commands;

import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ChangeUsername extends ChatCommand {
    @Parameter(required = true)
    private String newUsername;
}
