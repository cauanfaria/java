import javax.swing.JOptionPane;
public class au6ex3 {
    public static void main(String[] args){
        double turno, h;
        turno = Double.parseDouble(JOptionPane.showInputDialog(null,"Se seu turno for a noite digite 1, se for de manha digite 2"));
        h = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as horas trabalhadas"));
        if (turno == 2){
            JOptionPane.showMessageDialog(null,"Seu salario sera: " + h * 35.50);
        }else{
            JOptionPane.showMessageDialog(null,"Seu salario sera: " + h * 45);
        }
        
    }
}
