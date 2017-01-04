import org.apache.commons.csv.*;
import java.io.*;

public class Converter {
  public static String convert(String input) throws IOException {
    final Reader in = new StringReader(input);
    final Iterable<CSVRecord> records = CSVFormat.DEFAULT
        .withFirstRecordAsHeader().parse(in);

    final StringBuilder sb = new StringBuilder();
    for (final CSVRecord record : records) {
      if(!record.isConsistent()) continue;
      final String key = record.get("key");
      final String en = record.get("en");
      sb.append(String.format("%s - %s%n", key, en));
    }
    return sb.toString();
  }
  @Override
  public String toString() {
    return "hello";
  }
}
