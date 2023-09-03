package temperaturasemanal;

import javax.swing.JOptionPane;

/**
 *
 * @author ryann
 */
public class TemperaturaSemanal {
   
        public static void main(String[] args) {

        //Iniciandos as variaveis
        double[] Temperatura = new double[7];
        double soma, media;
        int contador, dias_acima, dias_abaixo;
        soma = 0;
        
        //For para pegar a resposta da temperatura que o usuario digitou para cada dia 
       for(contador = 0 ;  contador<7; contador++){
            Temperatura[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (contador + 1) + " temperatura: "));
            soma = soma + Temperatura[contador];
        }
        
       //atribuindo valores para as variaveis
        media = soma / 7;
        dias_acima = 0;
        dias_abaixo = 0;
        
        //For para saber os dias abaios/acimas de cada dia
        for(contador = 0 ; contador<7; contador++){
            if(Temperatura[contador]> media){
                dias_acima = dias_acima + 1;
            }
            if(Temperatura[contador]< media){
                dias_abaixo = dias_abaixo + 1;
            }
        }
        
        //Apresenta a resposta para a media dos dias e a quantidade de dias abaixo/acima
        JOptionPane.showMessageDialog(null, "A média das temperaturas é " + media);
        JOptionPane.showMessageDialog(null, "A quantidade de dias acima da média é " + dias_acima);
        JOptionPane.showMessageDialog(null, "A quantidade de dias abaixo da média é " + dias_abaixo);
        
    }
}