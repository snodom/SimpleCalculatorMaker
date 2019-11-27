import java.io.PrintWriter;

public class CalculatorMaker {
    public static void main(String[] args){

        String basicPath ="C:\\Users\\Dominik\\Desktop\\CalculatorMaker\\Calculator\\src\\";

        NoteMaker n = new NoteMaker();
        save(n,basicPath);

        NoteMaker ad = new AdditionMaker();
        save(ad,basicPath);

        NoteMaker su = new SubtractionMaker();
        save(su,basicPath);

        NoteMaker mCM= new MainClassMaker();
        save(mCM,basicPath);

    }

    private static void save(NoteMaker n, String basicPath){
    try{
        String path = basicPath+n.getFileName();
        PrintWriter pw = new PrintWriter(path);
        n.save(pw);
        pw.flush();
        pw.close();
    }catch (Exception e){
        System.out.println("Save failed" + n.getFileName());
    }
    }
}





