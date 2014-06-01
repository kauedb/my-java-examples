package kauedb.nio;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.testng.Assert.assertEquals;

/**
 * User: kauedb
 * Date: 4/22/14
 * Time: 9:02 AM
 */
public class NioTest {

    @Test
    public void LIST_DIRECTORY_CONTENT() throws IOException {

        final Collection<String> files = new ArrayList<>();
        final String dir = "./jdk/7/src/test/resources/listDirectoryContentTest";
        try (final DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dir))){
            for (Path path : directoryStream) {
                files.add(path.getFileName().toString());
            }
        }

        assertEquals(files, Arrays.asList("c.txt", "a.txt", "b.txt"));
    }

}
