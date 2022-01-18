import javax.swing.JOptionPane;

public class quatro{
    public static void main(String[] args){
        float salario, novos;
        salario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salario atual: "));
        novos = salario + (salario * 25/100);
        JOptionPane.showMessageDialog(null,"seu novo salario é:" + novos);
    }
}
