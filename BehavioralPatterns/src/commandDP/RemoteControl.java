package commandDP;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl
{
    private List<ICommand> commands;

    public RemoteControl()
    {
        commands = new ArrayList<ICommand>();
    }

    public void AddCommand(ICommand command)
    {
        commands.add(command);
    }

    public void ExecuteCommands()
    {
        for (ICommand command : commands)
        {
            command.Move();
        }

        commands.clear();
    }
}
