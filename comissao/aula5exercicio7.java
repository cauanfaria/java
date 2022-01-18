import javax.swing.JOptionPane;

public class aula5exercicio7 {
    public static void main(String[] args){
        double t, q;
        t = Double.parseDouble(JOptionPane.showInputDialog(null, "quantidade de telheiros: "));
        q = Double.parseDouble(JOptionPane.showInputDialog(null,"qtd de quadrados: "));
        JOptionPane.showMessageDialog(null,"Vendas:" + vendas(t, q));
        JOptionPane.showMessageDialog(null,"comissão" + comissao(t, q) );
    }
    public static double vendas(double t, double q){
        return (1.05*t) + (0.51*q);
    }
    public static double comissao(double t, double q){
        return ((1.05*t) + (0.51*q)) * 0.10;
    }
}
