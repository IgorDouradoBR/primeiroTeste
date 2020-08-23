import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class  MetodoSemNome{
    Set<Integer> listaMatricula= new HashSet<Integer>();

    //teste novo
    public List<Integer> matriculaUnica(List<Integer> listaOriginal){
        ListIterator<Integer> iter = listaOriginal.listIterator();
        while(iter.hasNext()){
            listaMatricula.add(iter.next());
        }
        List<Integer> listaNova= new LinkedList<Integer>();
        for(Integer adiciona: listaMatricula){
            listaNova.add(adiciona);
        }
        return listaNova;
    }

}