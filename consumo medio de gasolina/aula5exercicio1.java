import javax.swing.JOptionPane;
public class aula5exercicio1 {
    public static void main(String[] args){
        float km1, km2, l, pl;
        km1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Kilometro inicial?:"));
        km2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Kilometro final?:"));
        l = Float.parseFloat(JOptionPane.showInputDialog(null, "litros gastos?:"));
        pl = Float.parseFloat(JOptionPane.showInputDialog(null, "preço do litro?:"));
        JOptionPane.showMessageDialog(null,"Distancia percorrida:" + dp(km1, km2));
        JOptionPane.showMessageDialog(null,"Consumo medio:" + cm(km1, km2, l));
        JOptionPane.showMessageDialog(null,"valor gasto:" + vg(pl, km1, km2));
    }
    public static float dp(float km1, float km2){
        return km1 + km2;
    }
    public static float cm(float km1, float km2, float l){
        return km1 + km2/l;
    }
    public static float vg(float pl, float km1, float km2){
        return pl/km1 + km2;
    }
}
