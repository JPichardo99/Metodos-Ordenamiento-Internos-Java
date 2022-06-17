public class ShellSort{
    public static void main(String[] args) {
        ShellSort objeto = new ShellSort();
        objeto.m_ShellSort();
    }
        void m_ShellSort(){
        int Numeros[] = new int [15];
        genNumeros(Numeros);
        System.out.println("--Arreglo sin ordenar--");
        printArray(Numeros);
        System.out.println("");
        System.out.println("--Arreglo Ordenado--");
        int i, j, aux;
		boolean aux_2;
		i = Numeros.length;
		while(i > 0){
			i=i/ 2;
			aux_2= true;
			while(aux_2){
				aux_2 = false;
				j = 0;
				while ((j+i) <=Numeros.length-1){
					if (Numeros[j] >Numeros[j+i]){
						aux =Numeros[j];
						Numeros[j] = Numeros[j+i];
						Numeros[j+i] = aux;
						aux_2= true;
					}
					j = j+1;
				}
			}
		}
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