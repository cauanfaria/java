import javax.swing.JOptionPane;
public class aula5exercicio2 {
    public static void main(String[] args){
        float l;
        l = Float.parseFloat(JOptionPane.showInputDialog(null, "lado?:"));
        JOptionPane.showMessageDialog(null, "Area é:" + area(l));
    }
    public static float area(float l){
        float a;
        a = l * l;
        return a;
    }
}
