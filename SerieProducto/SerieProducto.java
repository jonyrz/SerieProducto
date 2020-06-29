import javax.swing.JOptionPane;

public class SerieProducto {
    
    public static int numCifras=0, cifras=0, n;
    public static double valAprox, error, valAnt, numPi=0, pi=Math.PI;
    public static String norm, tipoError;

    public static void main(String[] args) {

        numCifras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cifras significativas de Pi: "));
        tipoError=JOptionPane.showInputDialog("¿Que tipoError de error desea? \n 1. Relativo. \n2. Verdadero. ");
        norm = JOptionPane.showInputDialog("¿Quiere normalizarlo? \n1. Si. \n2. No ");
        Operaciones a  = new Operaciones();
        
        if(tipoError.equals("1")){
            valAnt = 0;
            do{
                n++;
                valAprox = a.producto(n,valAprox);
                error = a.errorRel(valAprox, valAnt, norm);           
                cifras = a.numDeCifras(cifras, valAprox, numPi, valAnt, tipoError);
                valAnt = valAprox;
            }while(cifras <= numCifras);
  
            JOptionPane.showMessageDialog(null, n);
            JOptionPane.showMessageDialog(null, valAprox);
            String p=error+"";
            if(norm.equals("1")){
                p = p + "%";
            }
            JOptionPane.showMessageDialog(null, p);
        }else{
        if(tipoError.equals("2")){
            do{
                n++;
                valAprox = a.producto(n, valAprox);
                error = a.errorVerd(numPi, valAprox, error, norm);
                cifras = a.numDeCifras(cifras, valAprox, pi, valAnt, tipoError);
            }while(cifras <= numCifras);

            JOptionPane.showMessageDialog(null, n);
            JOptionPane.showMessageDialog(null, valAprox);
            String p=error+"";
            if(norm.equals("1")){
                p = p + "%";
            }
            JOptionPane.showMessageDialog(null, p);
    }
}
    }}
