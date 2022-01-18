import javax.swing.JOptionPane;
public class au6ex4 {
    public static void main(String[] args){
        double agua, luz, telefone, internet, salario, total;
        agua = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a o valor da conta de agua"));
        luz = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a o valor da conta de lux"));
        telefone = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a o valor da conta de telefone"));
        internet = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a o valor da conta de internet"));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a o valor do salario "));
        total = agua + luz + telefone + internet;
        if(salario < total){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
        }else{
            JOptionPane.showMessageDialog(null,"Seu salario vai ficar: " + (salario - total));
        }
    }
}
