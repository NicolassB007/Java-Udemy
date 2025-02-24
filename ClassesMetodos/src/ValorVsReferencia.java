import java.util.Date;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int a = 2;
        int b = a; // Atribuição por valor (Tipo Primitivo);

        a++;
        b--;

        System.out.println(a + " " + b);

        Date d1 = new Date();
        Date d2 = d1; // Atribuição por referência (Objeto);

        /*
        * Um método STATIC só pode acessar outro método static, regra*/
    }
}
