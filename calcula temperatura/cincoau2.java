import javax.swing.JOptionPane;
public class cincoau2 {
    public static void main(String[] args){
        double tk, tf, tc;
        tc = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em celsius: "));
        tf = 1.8 * tc + 32;
        tk = tc + 273;
        JOptionPane.showMessageDialog(null, String.format("fahrenheit = %.2f\nkelvin= %.2f", tf, tk));


    }
}
