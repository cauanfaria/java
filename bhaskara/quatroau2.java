import javax.swing.JOptionPane;
public class quatroau2 {
    public static void main(String[] args){
    double a, b, c, delta, x1, x2;
    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de a: "));
    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de b: "));
    c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de c: "));
    delta = (b * b) - 4 * a * c;
    x1 = (-b + Math.sqrt(delta)) / 2 * a;
    x2 = (-b - Math.sqrt(delta)) / 2 * a;
    JOptionPane.showMessageDialog(null, String.format(
                 "x1 = %.2f\nx2 = %.2f\ndelta = %.2f", x1, x2, delta));

    }
    
}
