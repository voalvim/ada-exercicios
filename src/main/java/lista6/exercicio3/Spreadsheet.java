package lista6.exercicio3;

public sealed class Spreadsheet extends Document permits ExcelSheet, GoogleSheet {
    public void printDocument() {
        System.out.println("Printing spreadsheet...");
    }
}
