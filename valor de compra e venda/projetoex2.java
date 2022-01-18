import javax.swing.JOptionPane;
public class projetoex2{
    public static void main(String[] args) {
        double vc, vv, te;
        vc = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor de compra do produto: "));
        if (vc<=100){ 
            te = 10;
            vv = vc * 1.15 + te;
            }
        else
            if(vc >= 100.01 && vc <=250.00){ 
                te = 17;
                vv = vc * 1.15 + te;
                }
            else 
                if(vc >= 250.01 && vc<= 950){ 
                    te = 20;
                    vv= vc * 1.15 + te;
                    }
                else
                    te = 25;
                    vv = vc * 1.15 + te;

        JOptionPane.showMessageDialog(null, "valor de venda sera: " + vv);
    }
}
/* Cauan Soares Faria*/