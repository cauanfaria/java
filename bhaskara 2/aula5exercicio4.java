import javax.swing.JOptionPane;
public class aula5exercicio4 {
    public static void main(String[] args){
        double a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite c: "));
        JOptionPane.showMessageDialog(null, "Restultado x1: " + getX1(a, b, c));
        JOptionPane.showMessageDialog(null, "Restultado x2: " + getX2(a, b, c));
        
    }
    public static double getDelta(double a, double b, double c){
        return (b*b) - 4 * a * c;
    }
    public static double getX1(double a,double b,double c){
        return - b + getDelta(a, b, c) / 2 * a;
    }
    public static double getX2(double a,double b,double c){
        return - b - getDelta(a, b, c) / 2 * a;
    }

}
