import javax.swing.JOptionPane;
public class au6ex5 {
    public static void main(String[] args){
        double v, p;
        v = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor"));
        p = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as prestacoes"));
        if(p<=3){
            JOptionPane.showMessageDialog(null,"O valor total sera:" + (v * 1.10));
        }else{
            JOptionPane.showMessageDialog(null,"o valor total sera:" + (v*1.20));
        }
    }
}
