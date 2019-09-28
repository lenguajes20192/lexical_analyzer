public class Token {

    public int row;
    public int column;
    public String lexeme;


    public Token(String lexemeValue, int rowValue, int columnValue){
        lexeme = lexemeValue;
        row = rowValue;
        column = columnValue;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }
}

