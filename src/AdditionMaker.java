import java.io.PrintWriter;

public class AdditionMaker extends NoteMaker {
   private String fileName="Addition.java";

    public void save(PrintWriter pw){
        pw.println("public class Addition extends Count{\n");
        pw.println("\tpublic double count(int a, int b){");
        pw.println("\t if(a>b) count(b,a)");

        for(int i=0;i<=maxNumber; i++){
            int j=2*i;
            pw.println("\t\t else if(a="+i+" && b="+i+") return "+j+";");

            for(int w=i+1;w<=maxNumber; w++){
                int g=w+i;
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
