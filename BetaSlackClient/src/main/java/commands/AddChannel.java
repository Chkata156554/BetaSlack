package commands;

import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class AddChannel extends ChatCommand {
    @Parameter(required = true)
    private String name;
    @Parameter(names = {"--private"})
    private boolean isPrivate;
}
