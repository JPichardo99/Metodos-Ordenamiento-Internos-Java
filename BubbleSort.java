public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort objeto = new BubbleSort();
        int Numeros[] = new int [15];
        objeto.genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--"); 
        objeto.printArray(Numeros); 
        objeto.m_BubbleSort(Numeros); 
        System.out.println("--Arreglo ordenado--"); 
        objeto.printArray(Numeros); 
    }
     /*-------------------------------------------------------------*/
    void m_BubbleSort(int p_Numeros[]) 
    { 
        int aux = 0;
        for (int i = 0; i <p_Numeros.length; i++) {
        for (int j = 1; j < (p_Numeros.length - i); j++) {
            if (p_Numeros[j - 1] >p_Numeros[j]) {
                aux = p_Numeros[j - 1];
                p_Numeros[j - 1] = p_Numeros[j];
                p_Numeros[j] = aux;
            }
        }   
    }
   }
    /*-------------------------------------------------------------*/
     void printArray(int Arreglo[]){
        for (int i = 0; i <Arreglo.length; i++) {
            System.out.println(Arreglo[i]);
        }
    }
    void genNumeros(int Numeros[]){
        for (int i = 0; i <15; i++) {
           Numeros[i] = (int)(Math.random()*50); 
        }
    }
}