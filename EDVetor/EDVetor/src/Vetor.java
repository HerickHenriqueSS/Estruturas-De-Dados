import java.util.Arrays;

public class Vetor {
    
	private String[] elementos;
	private int tamanho;

    public Vetor(int capaciodade){
        elementos = new String[capaciodade];
        tamanho = 0;

    }
   
    
   /* public void adiciona(String elemento) {
    	for(int i=0; i < elementos.length; i++){
    		if(elementos[i] == null) {
    			elementos[i] = elemento;
    		break;
    		}
    	}
    }*/
    
    /*public void adiciona(String elemento) {
    	if(tamanho < elementos.length) {
    		elementos[tamanho] = elemento;
    		tamanho ++;
    	}else {
    		throw new Exception("vetor esta cheio!!");
    	}
    }*/


	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("[");
		for (int i = 0; i<tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if(tamanho > 0) {
			s.append(elementos[tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
		}
    
}

