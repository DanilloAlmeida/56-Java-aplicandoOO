package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel c){
        if (c.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos!!!!");
        }else if (c.getClassificacao() >= 2){
            System.out.println("Bem avaliado!!!");
        }else{
            System.out.println("Assista depois");
        }
    }
}
