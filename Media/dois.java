import javax.swing.JOptionPane;

public class dois {
    public static void main(String[] args) {
        float n1, n2, n3, media;
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o terceiro número: "));
        media = (n1 + n2 + n3)/3;
        JOptionPane.showMessageDialog(null, "A média é: " + media);
        



    }
}
