interface FunWithAbstract {
    abstract int cal(int x,int y);
}

public class Fun {
    public static void main(String[] args) {
        FunWithAbstract f1 = (int x,int y) -> x * y;
        System.out.println(f1.cal(4,2));
    }
}