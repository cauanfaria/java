import javax.swing.JOptionPane;
public class ex5au8 {
    public static void main(String[] args) {
            char resp;
            double i, n, maior,soma,media;
            resp = 's';
            i = 0;
            soma = 0;
            maior = 0;
            while(resp == 's'){
                n = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o numero:"));
                if(i==0){
                    maior=n;
                }
                else if (n>maior){
                    maior=n;
                }
                i++;
                soma =+ n;  
                resp = JOptionPane.showInputDialog(null, "Deseja continuar?").toLowerCase().charAt(0);
            }
            media = soma/i;
            JOptionPane.showMessageDialog(null, "media: "+media);
            JOptionPane.showMessageDialog(null, "maior "+maior);
        }
    }