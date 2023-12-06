import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class AlternatingCharactersResult {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int alternatingCharacters(String s) {
        return alternatingCharactersRec(s.toCharArray(), 0, 0);
    }

    private static int alternatingCharactersRec(char[] s, int i, int deletions) {
        if(i + 1 == s.length) return deletions;

        if(s[i] == s[i + 1]) return alternatingCharactersRec(s, i + 1, deletions + 1);
        else return alternatingCharactersRec(s, i + 1, deletions);
    }

}

public class AlternatingCharactersSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = AlternatingCharactersResult.alternatingCharacters(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
