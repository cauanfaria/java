import javax.swing.JOptionPane;
public class ex7au8 {
    public static void main(String[] args) {
        char resp, sexo;
        double altura, mediaF,mediaM,i;
        i=0;
        mediaF=0;
        mediaM=0;
        resp='s';
        while(resp=='s'){
            sexo = JOptionPane.showInputDialog(null, "Qual o sexo?").toLowerCase().charAt(0);
            if (sexo=='m'){
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a altura: "));
                mediaM =+ altura;
            }
            if (sexo=='f'){
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a altura: "));
                mediaF =+ altura;
            }
            i++;
            resp = JOptionPane.showInputDialog(null, "Deseja continuar?").toLowerCase().charAt(0);
        }
        mediaF = mediaF/i;
        mediaM = mediaM/i;
        JOptionPane.showMessageDialog(null, "Media homens: " +mediaF);
        JOptionPane.showMessageDialog(null, "Media mulheres: "+mediaM);

    }
     
}
