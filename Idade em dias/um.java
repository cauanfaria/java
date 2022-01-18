import javax.swing.JOptionPane;

public class um {
    public static void main(String[] args) {
        int anos, meses, dias, total;
        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos anos voce tem: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos meses: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos dias: "));
        meses = meses * 30;
        anos = anos * 365;
        total = anos + meses + dias;
        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + total);

    }
        
}