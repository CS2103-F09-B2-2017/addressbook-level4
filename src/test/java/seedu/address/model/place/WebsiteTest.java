package seedu.address.model.place;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
//@@author aungmyin23
public class WebsiteTest {

    @Test
    public void isValidWebsite() {
        // blank website
        assertFalse(Website.isValidWebsite("")); // empty string
        assertFalse(Website.isValidWebsite(" ")); // spaces only

        // invalid website
        assertFalse(Website.isValidWebsite("peterjackexample")); // missing .com part
        assertFalse(Website.isValidWebsite(".com")); // domain name missing
        assertFalse(Website.isValidWebsite("1232430982")); // no digits

        // valid website
        assertTrue(Website.isValidWebsite("www.example.com")); //full address with www
        assertTrue(Website.isValidWebsite("example.com")); //address without www .
    }
}
