public class InstanciasObjetos {

    
    public static void main(String[] args) {
     
    }

   
    public String verificarEdad(int Edad) {
        if (Edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    
    public int multiplicar(int Num1, int Num2) {
        return Num1 * Num2;
    }

   
    public String generarListaNumeros(int x) {
        StringBuilder numeros = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            numeros.append(i).append(" ");
        }
        return numeros.toString();
    }
}
