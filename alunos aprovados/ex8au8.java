import javax.swing.JOptionPane;
public class ex8au8 {
    public static void main(String[] args) {
        double nota, i, media, aprovado, notatotal;
        nota=0;
        aprovado=0;
        notatotal=0;
        for(i=0;i<=9;i++){
            nota = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a nota: "));
            notatotal =+ nota;
            if(nota>6){
                aprovado++;
            }
        }
        notatotal = notatotal/i;
        JOptionPane.showMessageDialog(null, "Total de alunos aprovados: "+aprovado);
        JOptionPane.showMessageDialog(null, "Media: "+notatotal);

    }
}
