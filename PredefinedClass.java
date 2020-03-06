public class PredefinedClass {
    public static void main(String[] args) {
        
        String a = "Number", b = "Square", c = "Cube";
        System.out.printf("%s%8s%7s", a,b,c);
        int n = 0;
        do{
            double sq = Math.pow(n,2);
            double cb = Math.pow(n,3);
            System.out.printf("%n%d%10.0f%9.0f",n,sq,cb);
            n++;
    }while(n<=10);
        System.out.println("");
        
    }
}
