import java.io.PrintWriter;

public class SubtractionMaker extends NoteMaker {
    private String fileName="Subtraction.java";

    public void save(PrintWriter pw){
        pw.println("public class Subtraction extends Count{\n");
        pw.println("\tpublic double count(int a, int b){");
        pw.println("\t if(a>b) count(b,a)");

        for(int i=0;i<=maxNumber; i++){
            for(int w=0;w<=maxNumber; w++){
                int g=i-w;
                pw.println("\t\t else if(a="+i+" && b="+w+") return "+g+";");
            }
        }
        pw.println("\telse{\t\tSystem.out.println(\"the number is too big\");");
        pw.println();
        pw.println("\t\treturn 0 \n\t\t}");
        pw.println("\t}");
        pw.println("}");
    }
    @Override
    public String getFileName() {
        return fileName;
    }
}
