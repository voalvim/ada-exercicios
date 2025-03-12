package lista6.exercicio3;

public final class PDFDocument extends Document {
    public void printDocument() {
        System.out.println("Printing PDF document...");
    }
    static PDFDocument generatePDF() {
        return new PDFDocument();
    }
}
