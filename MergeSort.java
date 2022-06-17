public class MergeSort {
    public static void main(String[] args) {
        MergeSort objeto = new MergeSort();
        int Numeros[] = new int [15];
        objeto.genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--"); 
        objeto.printArray(Numeros); 
        objeto.m_ordenar(Numeros, 0, Numeros.length - 1); 
        System.out.println("--Arreglo ordenado--"); 
        objeto.printArray(Numeros); 
    }
    /*-------------------------------------------------------------*/
    void m_mergeSort(int numeros[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int aux[] = new int[n1]; 
        int aux2[] = new int[n2]; 
        for (int i = 0; i < n1; ++i) 
            aux[i] = numeros[l + i]; 
        for (int j = 0; j < n2; ++j) 
            aux2[j] = numeros[m + 1 + j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (aux[i] <= aux2[j]) { 
                numeros[k] = aux[i]; 
                i++; 
            } 
            else { 
                numeros[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) { 
            numeros[k] = aux[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) { 
            numeros[k] = aux2[j]; 
            j++; 
            k++; 
        } 
    } 
    /*-------------------------------------------------------------------*/
    void m_ordenar(int numeros[], int l, int r) 
    { 
        if (l < r) { 
            int m = (l + r) / 2; 
            m_ordenar(numeros, l, m); 
            m_ordenar(numeros, m + 1, r); 
            m_mergeSort(numeros, l, m, r); 
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