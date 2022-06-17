public class QuickSort {
    public static void main(String[] args) {
         QuickSort objeto = new QuickSort();
         objeto.m_QuickSort();
    }
     void m_QuickSort(){
     int Numeros[] = new int [15];
        genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--");
        printArray(Numeros);
        System.out.println("");
        Particion(Numeros,0,Numeros.length-1);
        System.out.println("--Arreglo Ordenado--");
        printArray(Numeros);
        System.out.println("");
    }
     void Particion(int Arreglo[], int p_aux, int p_aux_2){
      int pivote =Arreglo[p_aux];
        int i = p_aux;
        int j = p_aux_2;
        int auxIntercambio;
        while (i < j) {
            while (Arreglo[i] <= pivote && i < j) {
                i++;
            }
            while (Arreglo[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = Arreglo[i];
                Arreglo[i] = Arreglo[j];
                Arreglo[j] = auxIntercambio;
            }
        }
        Arreglo[p_aux] = Arreglo[j];
        Arreglo[j] = pivote;
        if (p_aux < j - 1) {
            Particion(Arreglo,p_aux, j - 1);
        }
        if (j + 1 <p_aux_2) {
            Particion(Arreglo, j + 1,p_aux_2);
        }
    }
      void printArray(int Arreglo[]){
        for (int i = 0; i <Arreglo.length; i++) {
            System.out.println(Arreglo[i]);
        }
    }
    void genNumeros(int Numeros[]){
        for (int i = 0; i <15; i++) {
           Numeros[i] = (int)(Math.random()*1000); 
        }
    }
}