import javax.swing.JOptionPane;

public class sexta {
    public static void main(String[] args){
        float base, altura, area;
        base = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a base: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura: "));
        area = (base * altura)/2;
        JOptionPane.showMessageDialog(null, "a area é: " + area);
    }
}
