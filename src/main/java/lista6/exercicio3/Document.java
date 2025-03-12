package lista6.exercicio3;

public sealed class Document permits PDFDocument, WordDocument, Spreadsheet {
    public void printDocument() {
        System.out.println("Printing document...");
    }
}
