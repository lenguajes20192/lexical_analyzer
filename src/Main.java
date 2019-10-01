import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main{

    private static final String REGEX = "\\bwrite\\b";
    private static final String REGEX2 = "\\bwrites\\b";
    private static final String INPUT = "cat cat cat writes cat";

    //   \[[^\[]*\] regex for tk separa
    // "[a-zA-Z]+[0-9]*" identifiers
    // "[+]{2}" incremento

    static void match(String cadena){
        String[] arr = new String[]{"\\baf\\b", "\\bbody\\b", "\\bcap\\b", "\\bdestroy\\b", "\\bend\\b", "\\bexternal\\b",
                "\\bfa\\b", "\\bfi\\b", "\\bget\\b", "\\bgetarg\\b", "\\bglobal\\b", "\\bif\\b",
                "\\bimport\\b”", "\\bint\\b", "\\bmod\\b", "\\bnew\\b", "\\bop\\b", "\\bprocedure\\b",
                "\\bprocess\\b", "\\bread\\b", "\\breal\\b", "\\bref\\b", "\\bres\\b", "\\bresource\\b",
                "\\bscanf\\b", "\\bsem\\b", "\\bsprintf\\b", "\\bstop\\b", "\\bto\\b", "\\btrue\\b",
                "\\bval\\b", "\\bvar\\b", "\\bwrite\\b", "\\bwrites\\b", "[()&{};]","\\[[^\\[]*\\]",
                "[+]{2}", "(\\d)+[.](\\d)+", "(\\d)+[.]\\B","[a-zA-Z]+[0-9]*"};
        //System.out.println(cadena);

        for(int i = 0; i< arr.length;i++){
            Pattern p = Pattern.compile(arr[i]);
            Matcher m = p.matcher(cadena);
            while(m.find()) {
                System.out.println(cadena.substring(m.start(), m.end()));
                //System.out.println(p.pattern());// get a matcher object
                //System.out.println("start(): " + m.start());
                //System.out.println("end(): " + m.end());

            }

            //System.out.println("No match");
        }
    }

    public static void main( String args[] ) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "test2.txt"));
            String line = reader.readLine();
            int row = 0;
            while (line != null) {
                match(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}