import javax.swing.JOptionPane;

public class cinco {
    public static void main(String[] args){
        float salario, novo, imposto;
        salario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salario atual: "));
        imposto = salario - (salario * 6/100);
        novo = imposto + (salario * 5/100);
        JOptionPane.showMessageDialog(null,"O novo salario sera: " + novo);
    }
    
}
