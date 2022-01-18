import javax.swing.JOptionPane;
public class umau2 {
    public static void main(String[] args){
        float h, b, a, p;
        h = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura: "));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base: "));
        a = b * h;
        p = 2 * (b + h);
        JOptionPane.showMessageDialog(null, String.format("area = %.2f\nperimetro= %.2f", a, p));
    }
}
