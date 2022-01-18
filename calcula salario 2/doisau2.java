import javax.swing.JOptionPane;
public class doisau2 {
    public static void main(String[] args){
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario: "));
        salario =  salario * 1.05;
        JOptionPane.showMessageDialog(null, "Seu novo salario sera:" + salario);
    }
    
}
