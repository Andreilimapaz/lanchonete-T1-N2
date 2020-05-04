package andrei.paz.lanchonete.modelo;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lanche {
    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String recheio;

    @Getter @Setter
    private double preco;
}
