/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author geovane.saraujo
 */
public class ArquivoComposite extends Arquivos{
    private List<Arquivos> sistemasArqs = new ArrayList<>();
    
    public float getTamanho(){
        float tamanhoTotal =0;
    for(Arquivos arqs: sistemasArqs){
      tamanhoTotal +=  arqs.getTamanho();
    }
        return tamanhoTotal;
    }
    
    public void addArquivo(Arquivos sistemaArquivos){
        sistemasArqs.add(sistemaArquivos);
    }
    
    public void removeArquivo(Arquivos sistemaArquivos){
         sistemasArqs.remove(sistemaArquivos);
    }
}
