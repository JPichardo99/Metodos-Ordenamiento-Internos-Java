public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort objeto = new SelectionSort();
        int Numeros[] = new int [15];
        objeto.genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--"); 
        objeto.printArray(Numeros); 
        objeto.m_SelectionSort(Numeros); 
        System.out.println("--Arreglo ordenado--"); 
        objeto.printArray(Numeros); 
    }
    /*-------------------------------------------------------------*/
    void m_SelectionSort(int p_Numeros[]) 
    { 
        int n = p_Numeros.length;
        for (int i = 0; i < n-1; i++) {
            int aux = i;
            for (int j = i+1; j < n; j++) {
                if (p_Numeros[j]<p_Numeros[aux]) {
                    aux = j;  
                }
            }
            int aux_2 = p_Numeros[aux]; 
            p_Numeros[aux] = p_Numeros[i]; 
            p_Numeros[i] = aux_2;
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