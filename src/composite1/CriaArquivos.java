/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite1;

/**
 *
 * @author geovane.saraujo
 */
public class CriaArquivos {

    public static void main(String[] args) {
        ArquivoFolha atividades = new ArquivoFolha(10, "atividades");
        ArquivoFolha apresentacao = new ArquivoFolha(20, "apresentacao");
        ArquivoFolha fotos = new ArquivoFolha(15, "fotos");
        ArquivoFolha videos = new ArquivoFolha(10, "videos");
        ArquivoComposite arquivos1 = new ArquivoComposite();
        arquivos1.addArquivo(atividades);
        arquivos1.addArquivo(apresentacao);
        arquivos1.addArquivo(fotos);
        arquivos1.addArquivo(videos);

        ArquivoFolha projetoJava = new ArquivoFolha(20, "projetoJava");
        ArquivoFolha logs = new ArquivoFolha(10, "logs");
        ArquivoFolha html = new ArquivoFolha(10, "html");
        ArquivoComposite arquivos2 = new ArquivoComposite();
        arquivos2.addArquivo(projetoJava);
        arquivos2.addArquivo(logs);
        arquivos2.addArquivo(html);

        arquivos1.addArquivo(arquivos2);
        System.out.println(arquivos1.getTamanho());
    }
}
