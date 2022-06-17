public class InsertionSort {
    public static void main(String[] args) {
       InsertionSort objeto = new InsertionSort();
        int Numeros[] = new int [15];
        objeto.genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--"); 
        objeto.printArray(Numeros); 
        objeto.m_InsertionSort(Numeros); 
        System.out.println("--Arreglo ordenado--"); 
        objeto.printArray(Numeros); 
    }
     /*-------------------------------------------------------------*/
    void m_InsertionSort(int p_Numeros[]) 
    { 
       int n = p_Numeros.length; 
        for (int i = 1; i < n; ++i) { 
            int aux = p_Numeros[i]; 
            int aux_2 = i - 1; 
            while (aux_2>= 0 && p_Numeros[aux_2] > aux) { 
                p_Numeros[aux_2+ 1] = p_Numeros[aux_2]; 
                aux_2= aux_2- 1; 
            } 
            p_Numeros[aux_2+ 1] = aux; 
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