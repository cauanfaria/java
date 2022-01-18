import javax.swing.JOptionPane;
public class ex4au8 {
    public static void main(String[] args) {
        int num, i, soma, media, qtd;
        i=1;
        qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "quantidade de valores?"));
        soma = 0;
        for(i=1; i<=qtd; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero: "));
            soma += num;
            
        }
        media = soma/i;
        JOptionPane.showMessageDialog(null, "media sera:" + media);

    }
}
