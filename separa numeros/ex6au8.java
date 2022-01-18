import javax.swing.JOptionPane;
public class ex6au8 {
    public static void main(String[] args) {
        int totalP, totalN, menorV, i, n;
        char resp;
        resp = 's';
        i=0;
        totalN=0;
        totalP=0;
        menorV=0;
        while(resp == 's'){
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
            if(i==0){
                menorV=n;
            }
            else if (n<menorV){
                menorV=n;
            }
            if(n<0){
                totalN++;
            }
            else if(n>0){
                totalP++;
            }


            resp = JOptionPane.showInputDialog(null, "Deseja continuar?").toLowerCase().charAt(0);
        }
        JOptionPane.showMessageDialog(null, "Total positivos: " + totalP);
        JOptionPane.showMessageDialog(null, "Total negativos: " + totalN);
        JOptionPane.showMessageDialog(null, "Menor valor: " + menorV);

    }
}
