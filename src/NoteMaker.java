import java.io.PrintWriter;

public class NoteMaker {

    public void save(PrintWriter pw){
        pw.println("public abstract class Count{\n");
        pw.println("public abstract double count(int a, int b);\n");
        pw.println("}");
    }

    private String fileName="Count.java";
    int maxNumber =15;

    public String getFileName() {
        return fileName;
    }
}
