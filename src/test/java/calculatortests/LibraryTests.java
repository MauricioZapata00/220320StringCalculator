package calculatortests;

import application.Library;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class LibraryTests {

    @Test
    public void testSomeLibraryMethod(){
        Library library = new Library();
        assertTrue ("someLibraryMethod should return 'true'", library.someLibraryMethod());
    }
}
