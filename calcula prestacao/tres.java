import javax.swing.JOptionPane;

public class tres {
    public static void main(String[] args){    
        float prestacao, valorprestacao, multa;
        int dias;
        valorprestacao = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da prestacao: "));
        multa = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a porcentagem da multa: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de dias: "));
        prestacao = valorprestacao+(valorprestacao*(multa/100)*dias);
        JOptionPane.showMessageDialog(null,"A prestacao ficara em um valor de:" + prestacao);
    }
}
