import javax.swing.JOptionPane;
public class aula5exercicio5 {
    public static void main(String[] args){
    double d, t;
    d = Double.parseDouble(JOptionPane.showInputDialog(null,"Distancia: "));
    t = Double.parseDouble(JOptionPane.showInputDialog(null,"Tempo: "));
    JOptionPane.showMessageDialog(null,"A velocidade sera: " + v(d, t));
    }
    
    public static double v(double d, double t){
    return d/t;
    }
}
