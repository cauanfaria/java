import javax.swing.JOptionPane;
public class tresau2 {
    public static void main(String[] args){
        float d, t, vm;
            d = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a distancia: "));
            t = Float.parseFloat(JOptionPane.showInputDialog(null, "Tempo de viagem sera: "));
            vm = d/t;
            JOptionPane.showMessageDialog(null, "A velocidade media sera:" + vm );
    }
    
}
