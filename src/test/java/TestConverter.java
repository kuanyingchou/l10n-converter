import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

public class TestConverter {

  @Test
  public void testBasic() throws IOException {

    // assertEquals("hello", new Converter().toString(), "hello");

    final String input = 
      "key,android,ios,en,zh\r\nhello,hello,,hello,你好\r\n!@#$\r\nworld,,world,world,世界";

    String output = null;
    try {
      output = Converter.convert(input);
    } catch(Exception e) {
      e.printStackTrace();
    }
    final String expectedOutput = "hello - hello\nworld - world\n";

    assertEquals("file", expectedOutput, output);
  }
}
