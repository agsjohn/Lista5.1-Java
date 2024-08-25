package lista5_1;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Lista5_1 {
    public static void main(String[] args) {
        final int TAM = 10;
        int vet[] = new int [TAM];
        for(int x=0; x < TAM; x++){
            vet[x] = (int) (Math.random() * 51);
        }
        JOptionPane.showMessageDialog( null, "Vetor: "+Arrays.toString(vet));
    }    
}