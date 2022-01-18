import javax.swing.JOptionPane;
public class ex9au8 {
    public static void main(String[] args) {
        char resp, sexo;
        int idade, i, idadeT;
        double salario, salarioM, salarioF;
        resp = 's';
        i=0;
        idadeT=0;
        salarioM=0;
        salarioF=0;
        while(resp=='s'){
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: "));
            sexo = JOptionPane.showInputDialog(null, "Qual o sexo?").toLowerCase().charAt(0);
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o salario: "));
            if(sexo=='m'){
                salarioM =+ salario; 
            }
            if(sexo=='f'){
                if(salario<600){
                    salarioF++;
                }
            }
            idadeT =+ idade;
            resp = JOptionPane.showInputDialog(null, "Deseja continuar?").toLowerCase().charAt(0);
        }
        idadeT= idadeT/i;
        salarioM= salarioM/i;
        JOptionPane.showMessageDialog(null,"Media da idade: "+ idadeT);
        JOptionPane.showMessageDialog(null, "Media salario homens: "+salarioM);
        JOptionPane.showMessageDialog(null, "Mulheres que ganham menos de 600: "+salarioF);
    }
    
}
