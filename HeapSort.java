public class HeapSort {
    public static void main(String[] args) {
        HeapSort objeto = new HeapSort();
        int Numeros[] = new int [15];
        objeto.genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--"); 
        objeto.printArray(Numeros); 
        objeto.m_HeapSort(Numeros); 
        System.out.println("--Arreglo ordenado--"); 
        objeto.printArray(Numeros); 
    }
    /*-------------------------------------------------------------*/
    void m_HeapSort(int p_Numeros[]) 
    { 
        int n = p_Numeros.length; 
        for (int i = n / 2 - 1; i >= 0; i--) 
            PreHeapSort(p_Numeros, n, i); 
        for (int i=n-1; i>0; i--) 
        { 
            int temp =p_Numeros[0]; 
            p_Numeros[0] =p_Numeros[i]; 
            p_Numeros[i] = temp; 
            PreHeapSort(p_Numeros, i, 0); 
        } 
   }
    //Metodo auxiliar HeapSort
    void PreHeapSort(int Arreglo[], int p_aux, int p_aux2){
    int largest = p_aux2;
        int l = 2* p_aux2+1;
        int r = 2* p_aux2+2;
        if (l <p_aux&&Arreglo[l] >Arreglo[largest]) 
            largest = l; 
        if (r <p_aux&&Arreglo[r]>Arreglo[largest]) 
            largest = r; 
        if (largest !=p_aux2) 
        { 
            int swap=Arreglo[p_aux2]; 
            Arreglo[p_aux2]=Arreglo[largest]; 
            Arreglo[largest] = swap; 
            PreHeapSort(Arreglo,p_aux, largest); 
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