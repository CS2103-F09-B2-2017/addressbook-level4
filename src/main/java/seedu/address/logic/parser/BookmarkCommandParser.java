package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.BookmarkCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.tag.Tag;

/**
 * Parses input arguments and creates a new BookmarkCommand object
 */
public class BookmarkCommandParser implements Parser<BookmarkCommand> {

    private final String bookmarkTag = "Bookmarked";

    /**
     * Parses the given {@code String} of arguments in the context of the BookmarkCommand
     * and returns an BookmarkCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public BookmarkCommand parse(String args) throws ParseException {
        try {
            Tag bookmark = new Tag (bookmarkTag);
            Index index = ParserUtil.parseIndex(args);

            return new BookmarkCommand(index, bookmark);
        } catch (IllegalValueException ive) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, BookmarkCommand.MESSAGE_USAGE));
        }
    }

}

