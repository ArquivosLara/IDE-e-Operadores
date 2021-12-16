public class Resultado_Logico {
    // a.	((120 - 30) = (3 ˆ 30))
    //b.	(não ((20 módulo 4)= 1) ou (9 != 9))
    //c.	((5 módulo 2 2) > 3)
    //d.	(a = A)
    public static void main(String[] args){
        float a = 5;
        float A = 5;
        System.out.println("Teste lógico A: " + ((120-30)==(Math.pow(3,30))));
        System.out.println("Teste lógico B: " + (!((20 % 4) == 1)||(9 != 9)));
        System.out.println("Teste lógico C: " + ((5 % 22) > 3));
        System.out.println("Teste lógico D: " + (a == A));
    }
}