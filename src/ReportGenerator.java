public class ReportGenerator {

    public void generatePdfReport () {
        System.out.println("Generando el reporte de PDF");
    }

    public void generateHtmlReport () {
        System.out.println("Generando el reporte de HTML");
    }

    public void generateExcelReport () {
        System.out.println("Generando el reporte de Excel");
    }

    public static void main(String[] args) {

        ReportGenerator generator = new ReportGenerator();

        generator.generateExcelReport();
        generator.generateHtmlReport();
        generator.generatePdfReport();
    }
}
