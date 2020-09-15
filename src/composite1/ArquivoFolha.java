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
public class ArquivoFolha extends Arquivos{
    private float tamanho;
    private String nome;

    public ArquivoFolha(float tamanho, String nome) {
        this.tamanho = tamanho;
        this.nome = nome;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getNomeArquivo() {
        return nome;
    }

    public void setNomeArquivo(String nome) {
        this.nome = nome;
    }

}
