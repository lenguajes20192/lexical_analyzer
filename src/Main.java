import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {

    static String[] resWords = new String[]{ "af", "body", "cap", "destroy", "end", "external", "fa", "fi", "get", "getarg",
                                      "global", "if", "import", "int", "mod", "new", "op", "procedure", "process", "read",
                                      "real", "ref", "res", "resource", "scanf", "sem", "sprintf", "stop",
                                      "to", "val", "var", "write", "writes"};

    static int delta(int newState, char c){

        //int newState = -1;

        switch (newState) {
            case -1:
                if (c == '+') newState = 1;
                else if (c >= '0' && c <= '9') newState = 4;
                else if (c == '-') newState = 5;
                else if (c == '.') newState = 11;
                else if (c == ';') newState = 12;
                else if (c == ')') newState = 13;
                else if (c == '(') newState = 14;
                else if (c == ':') newState = 15;
                else if (c == '=') newState = 18;
                else if (c == '[') newState = 19;
                else if (c == ']') newState = 22;
                else if (c == '<') newState = 23;
                else if (c == '>') newState = 26;
                else if (c == '{') newState = 29;
                else if (c == '}') newState = 30;
                else if (c == '&') newState = 33;
                else newState = -1;
               //System.out.println("hello" + newState);
                break;

            case 1:
                if (c == '+') newState = 2;
                else newState = 3;
                break;

            case 4:
                if (c >= '0' && c <= '9') newState = 4;
                else if (c == '.') newState = 7;
                else newState = 6;
                break;

            case 5:
                if (c >= '0' && c <= '9') newState = 4;
                else newState = 10;
                break;

            case 7:
                if(c >= '0' && c <= '9') newState = 8;
                else newState = -1;
                break;

            case 8:
                if(c >= '0' && c <= '9') newState = 8;
                else newState = 9;
                break;

            case 15:
                if(c == '=') newState = 16;
                else newState = 17;
                break;

            case 16:
                if(c == ':') newState = 31;
                else newState = 32;

            case 19:
                if(c == ']') newState = 20;
                else newState = 21;
                break;

            case 23:
                if(c == '=') newState = 24;
                else newState = 25;
                break;

            case 26:
                if(c == '=') newState = 27;
                else newState = 28;
                break;

            case 2: // incremento
            case 3: //suma
            case 6: //integer
            case 9: //real
            case 10: // tk ejecuta
            case 11: // tk punto
            case 12: // tkpuntocoma
            case 13: //tk par derecho
            case 14: // tk par izquierdo
            case 17: // tk dos puntos
            case 18: // tk igual
            case 20: // tk separa
            case 21: // tk cor izq
            case 22: // tk cor der
            case 24: //tk menor igual
            case 25: //tk menor
            case 27: // tk mayor igual
            case 28: // tk mayor
            case 29: // tk llave izq
            case 30: // tk llave der
            case 31: //tk swap
            case 32: //tk asigna
            case 33: //tk and
                newState = -1;
                break;

        }
        return newState;
    }

    public static void main(String[] args) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "test2.txt"));
            String line = reader.readLine();
            int row = 0;
            while (line != null) {
                row++;
                if(!line.contains("#")) {
                    String[] arrOfStr = line.split("");
                    //System.out.println(Arrays.toString(arrOfStr));
                    //System.out.println(row);
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
