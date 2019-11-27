import java.io.PrintWriter;

public class MainClassMaker extends NoteMaker{
    private String fileName="CalculatorMaker.java";
    public void save(PrintWriter pw){
        pw.println("public class CalculatorMaker {\n");
        pw.println("\tpublic static void main(String[] args) {");
        pw.println("\t\tprivate int score;");
        pw.println("\t\tCount addition;");
        pw.println("\t\taddition = new Addition();");
        pw.println("\t\tscore = addition.count(5,5)");

        pw.println("\t}");
        pw.println("}");
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
