import javax.swing.JOptionPane;
public class aula5exercicio9 {
    public static void main(String[] args){
        float p, a;
        p = Float.parseFloat(JOptionPane.showInputDialog(null,"digite o peso:"));
        a = Float.parseFloat(JOptionPane.showInputDialog(null,"digite a altura:"));
        JOptionPane.showMessageDialog(null,"Seu imc é: " + IMC(p, a));
    }
    public static float IMC(float p, float a){
        return p / (a*a);
    }
}
