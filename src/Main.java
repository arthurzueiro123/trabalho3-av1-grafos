import grafo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grafo1 grafo1 = new Grafo1();
        List primeiro = grafo1.buildGraph();

        Grafo2 grafo2 = new Grafo2();
        List segundo = grafo2.buildGraph();

        Grafo3 grafo3 = new Grafo3();
        List terceiro = grafo3.buildGraph();

        Grafo4 grafo4 = new Grafo4();
        List quarto = grafo4.buildGraph();

        ArrayList<List> grafos = new ArrayList<>();
        grafos.add(primeiro);
        grafos.add(segundo);
        grafos.add(terceiro);
        grafos.add(quarto);

        int grauImpar =0;
//        int a =2;
//        int b = 3;
//        if(a%2 == 0 ){
//            System.out.println("foi");
//        }
//        if(b%2 !=0){
//            System.out.println("foi tbm");
//        }

        for(int i = 0; i<grafos.size();i++){
            grauImpar =0;

            for (int j = 0; j < grafos.get(i).size(); j++) {
                No aux = (No) grafos.get(i).get(j);
                //System.out.println(aux.getArestas().size());
                if((aux.getArestas().size()%2) == 1){
                    grauImpar++;
                }
            }
            System.out.print("grafo "+(i+1)+" ");
            if(grauImpar ==0){
                System.out.println("é euleriano");
            }else if(grauImpar == 2){
                System.out.println("é semi euleriano");
            }else if(grauImpar > 2){
                System.out.println("é não euleriano");
            }
        }
    }
}
