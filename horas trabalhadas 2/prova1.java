import javax.swing.JOptionPane;
public class ex2prova{
    public static void main(String[] args) {
        int c, h;
        double r;
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a categoria: "));
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas "));
        r = 0;
        if(c==1){
            r = (12* h)*4.5; 
            JOptionPane.showMessageDialog(null, "salario sera:" + r);
            System.out.println("salario sera:" + r);
        }
        else if(c==2){
            r = (17* h)*4.5;
            JOptionPane.showMessageDialog(null, "salario sera:" + r);
            System.out.println("salario sera:" + r);
        }
        else if(c==3){
            r = (25* h)*4.5;
            JOptionPane.showMessageDialog(null, "salario sera:" + r);
            System.out.println("salario sera:" + r); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Esse codigo nao serve");
            System.out.println("Esse codigo codigo serve");
        }
      

    }
}
/* Cauan Soares Faria*/