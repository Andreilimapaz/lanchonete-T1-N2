package andrei.paz.lanchonete.controle;

import andrei.paz.lanchonete.modelo.Lanche;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LancheControle {
    @GetMapping("/salgado")
    public ArrayList<Lanche> getSalgado() {
        Lanche salgado1 = new Lanche();
        salgado1.setNome("Misto Quente");
        salgado1.setRecheio("Presunto e queijo");
        salgado1.setPreco(3.50);

        Lanche salgado2 = new Lanche();
        salgado2.setNome("Pastel");
        salgado2.setRecheio("Carne");
        salgado2.setPreco(2.50);

        Lanche salgado3 = new Lanche();
        salgado3.setNome("Folhado");
        salgado3.setRecheio("Frango com Cheedar");
        salgado3.setPreco(5.00);

        ArrayList<Lanche> lista1 = new ArrayList<>();

        lista1.add(salgado1);
        lista1.add(salgado2);
        lista1.add(salgado3);

        return lista1;
    }

    @GetMapping("/doce")
    public ArrayList<Lanche> getDoce() {
        Lanche doce1 = new Lanche();
        doce1.setNome("Bolo");
        doce1.setRecheio("Chocolate");
        doce1.setPreco(6.00);

        Lanche doce2 = new Lanche();
        doce2.setNome("Mousse");
        doce2.setRecheio("Morango");
        doce2.setPreco(4.75);

        Lanche doce3 = new Lanche();
        doce3.setNome("Torta");
        doce3.setRecheio("Limão");
        doce3.setPreco(10.00);

        ArrayList<Lanche> lista2 = new ArrayList<>();

        lista2.add(doce1);
        lista2.add(doce2);
        lista2.add(doce3);

        return lista2;
    }
}