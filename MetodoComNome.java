import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Iterator;

public class  MetodoComNome {
    Set<Integer> listaMatricula= new HashSet<Integer>();
//commit s
    

    public List<nomeComMatricula> matriculaUnica(List<nomeComMatricula> listaOriginal){
        ListIterator<nomeComMatricula> iter = listaOriginal.listIterator();
        while(iter.hasNext()){
            listaMatricula.add(iter.next().getMatricula());
        }
        List<nomeComMatricula> listaNova= new LinkedList<nomeComMatricula>();
        List<Integer> vetorListaMatricula = new ArrayList<Integer>();
        Iterator<Integer> iteratorInt= listaMatricula.iterator();
        while(iteratorInt.hasNext()){
            vetorListaMatricula.add(iteratorInt.next());
        }
        List<Integer> auxiliar= new LinkedList<Integer>();
        for(int i=0; i<vetorListaMatricula.size(); i++){
            for(int j=0; j<listaOriginal.size(); j++){
                if(vetorListaMatricula.get(i)==listaOriginal.get(j).getMatricula()){
                    if(!auxiliar.contains( vetorListaMatricula.get(i))){
                        listaNova.add(listaOriginal.get(j));
                        auxiliar.add(vetorListaMatricula.get(i));

                    }
                }
                
        }
    }
        return listaNova;
    }

}