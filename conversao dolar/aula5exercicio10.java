import javax.swing.JOptionPane;
public class aula5exercicio10 {
    public static void main(String[] args){
        double d, r;
        d = Double.parseDouble(JOptionPane.showInputDialog(null,"digite a cotação do dolar:"));
        r = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor em real:"));
        JOptionPane.showMessageDialog(null,"valor: " + conv(d, r));

    }
    public static double conv(double d, double r){
        return r * d;
    }
}
