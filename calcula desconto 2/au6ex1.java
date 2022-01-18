import javax.swing.JOptionPane;
public class au6ex1{
    public static void main(String[] args){
       double valor, desconto;
       valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra: "));
       desconto =  valor * 0.8;
       if(valor>=200){
        JOptionPane.showMessageDialog(null,"Seu desconto ficara:" + desconto);
       }else{
        JOptionPane.showMessageDialog(null,"voce nao ganhara desconto");
       }
    }
}