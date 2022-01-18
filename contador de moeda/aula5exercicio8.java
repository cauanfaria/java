import javax.swing.JOptionPane;
public class aula5exercicio8 {
    public static void main(String[] args){
        double vc, d, c;
        vc = Double.parseDouble(JOptionPane.showInputDialog(null, "Moedas de 25:"));
        d = Double.parseDouble(JOptionPane.showInputDialog(null, "Moedas de 10:"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Moedas de cinco:"));
        JOptionPane.showMessageDialog(null,"Valor em reais:" + contador(vc, d, c));
    }
    public static double contador(double vc, double d, double c){
        return (vc*0.25) + (d*0.10) + (c*0.05);
    }
}
