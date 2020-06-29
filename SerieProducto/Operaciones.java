import javax.swing.JOptionPane;

public class Operaciones extends SerieProducto{
    
    public double producto(int n, double valAprox){     
        double multi=1, n1=0, n2=0;
            for (int i=1; i<n; i++) {
                n1 = Math.pow(i*2,2);
                n2 = ((2*i)-1)*((2*i)+1);
                multi = multi * (n1 / n2);
            }
        
        valAprox = multi * 2;
        return valAprox;
    }
   
    public double errorRel(double valAprox, double valAnt, String norm){
        error = valAnt - valAprox;
        if(norm.equals("1")){
            error = (error / valAnt) * 100;
        }
        return error;
    }
    
    public double errorVerd(double np, double valAprox,double error, String norm){
        np = Math.PI;
        error = np - valAprox;
        if(norm.equals("1")){
            error = (error / np) * 100;
        }
        return error;
    }

    public int numDeCifras(int cifras, double valAprox, double np, double valAnt, String tipo){
        cifras = 0; 
        String Valor = valAprox+"", valorpi=null;
        if(tipo.equals("1")){
        valorpi = valAnt+"";
        }
        else{ 
            if(tipo.equals("2")){
            valorpi = np+"";
            }
        }
        for(int i=0; i<valorpi.length(); i++){
           if(valorpi.charAt(i) != Valor.charAt(i)){
                i = valorpi.length();
           }
           else{
               cifras++;
           }
        }
        return cifras;
    } 
}
