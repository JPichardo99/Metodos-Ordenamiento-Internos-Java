public class CocktailSort {
    public static void main(String[] args) {
        CocktailSort objeto = new CocktailSort();
        int Numeros[] = new int [15];
        objeto.genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--"); 
        objeto.printArray(Numeros); 
        objeto.m_CocktailSort(Numeros); 
        System.out.println("--Arreglo ordenado--"); 
        objeto.printArray(Numeros); 
    }
     /*-------------------------------------------------------------*/
    void m_CocktailSort(int p_Numeros[]) 
    { 
        boolean aux = true; 
        int aux_2 = 0; 
        int aux_3= p_Numeros.length; 
        while (aux == true) { 
            aux= false; 
            for (int i =aux_2; i <aux_3- 1; ++i) { 
                if (p_Numeros[i] > p_Numeros[i + 1]) { 
                    int temp = p_Numeros[i]; 
                    p_Numeros[i] = p_Numeros[i + 1]; 
                    p_Numeros[i + 1] = temp; 
                    aux= true; 
                } 
            } 
            if (aux== false) 
                break; 
            aux= false; 
            aux_3=aux_3- 1; 
            for (int i =aux_3-1; i >=aux_2; i--) { 
                if (p_Numeros[i] > p_Numeros[i + 1]) { 
                    int temp = p_Numeros[i]; 
                    p_Numeros[i] = p_Numeros[i + 1]; 
                    p_Numeros[i + 1] = temp; 
                    aux= true; 
                } 
            } 
            aux_2=aux_2+ 1; 
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