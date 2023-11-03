package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Changes the remark of an existing person in the address book.
 */
public class ThemeCommand extends Command {

    public static final String COMMAND_WORD = "theme";
    public static final String LIGHT_THEME = "LightTheme.css";
    public static final String DARK_THEME = "DarkTheme.css";

    public static final String MESSAGE_TOGGLE_SUCCESS = "Theme toggled to %s";

    @Override
    public CommandResult execute(Model model) {
        String newTheme = model.toggleTheme();
        String successMessage = String.format(MESSAGE_TOGGLE_SUCCESS, newTheme.equals(LIGHT_THEME) ? "light" : "dark");
        return new CommandResult(successMessage);
    }
}
