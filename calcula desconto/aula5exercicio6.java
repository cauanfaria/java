import javax.swing.JOptionPane;
public class aula5exercicio6 {
    public static void main(String[] args){
        double v;
        v = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor" ));
        JOptionPane.showMessageDialog(null,"Valor com desconto: " + d(v));
    }
    public static double d(double v){
        return v * 1.09;
    }
}
