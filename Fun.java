
/**
 * InnerFun
 */
class InnerFun {
    int a = 4, b = 5, c = 5, result, total;
    public int add() {
        result = a + b;
        System.out.println(result);
        return result;
    }
    public int result(int result) {
        System.out.println(result);
        return total = result + c;
    }
}
public class Fun {
    public static void main(String[] args) {
        InnerFun i1 = new InnerFun();
        int D = i1.result();
        // int b = i1.add();
        System.out.println(D);
    }
}