public class RadixSort{
    public static void main(String[] args) {
        RadixSort objeto = new RadixSort();
        objeto.m_RadixSort();
    }
    void m_RadixSort(){
    int Numeros[] = new int [15];
        genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--");
        printArray(Numeros);
        System.out.println("");
        int x,i,j;
        for (x =Integer.SIZE-1;  x >= 0; x--) {
            int aux[] = new int[E.length];
            j= 0;
            for (i = 0;  i<Numeros.length; i++) {
                boolean mover =Numeros[i] << x > 0;
                if (x == 0 ? !mover:mover) {
                    aux[j] =E[i];
                    j++;
                }
                else{
                    Numeros[i-j] = Numeros[i];
                }
            }
            for (i =j;  i< aux.length; i++) {
                aux[i] = Numeros[i-j];
            }
            Numeros= aux;
        }
        System.out.println("--Arreglo ordenado--");
        printArray(Numeros);
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