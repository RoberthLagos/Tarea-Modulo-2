public class Principal {

    public static void main(String[] args) {
      
        InstanciasObjetos objetos = new InstanciasObjetos();

        
        int EdadEstudiante = 20;  
        System.out.println("Edad del estudiante: " + EdadEstudiante);
        System.out.println(objetos.verificarEdad(EdadEstudiante));  
        
        int Numero1 = 5;
        int Numero2 = 3;
        System.out.println("Multiplicaci0n: " + objetos.multiplicar(Numero1, Numero2)); 

       
        int numeroMaximo = 10;  
        System.out.println("Lista de numeros del 1 al " + numeroMaximo + ": " + objetos.generarListaNumeros(numeroMaximo));  
    }
}
