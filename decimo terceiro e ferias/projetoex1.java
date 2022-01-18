import javax.swing.JOptionPane;

public class projetoex1 {
    public static void main(String[] args) {
        int i;
        double s, d, f, m;
        m = 0;
        for(i=1; i<=12; i++){
            s = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o salario "));
            m += s;
        }
        d = m/12;
        f = (m/12) * 1/3;
        JOptionPane.showMessageDialog(null, "decimo terceiro: " + d + " nas ferias recebera: " + f);

    }
}
/* Cauan Soares Faria*/