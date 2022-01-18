import javax.swing.JOptionPane;
public class aula5exercicio3 {
    public static void main(String[] args){
        double vc, p;
        vc = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:"));
        p = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite as parçelas:"));
        JOptionPane.showMessageDialog(null, " valor das parcelas sera:" + vp(vc, p));
    }
    public static double vp(double vc, double p){
        return (vc / p) * 1.05;
    }

}
