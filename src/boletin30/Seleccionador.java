package boletin30;

/**
 *
 * @author ylagorebollar
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
        super();
    }

    public Seleccionador(int id, int idade, String nome, String apelidos) {
        super(id, idade, nome, apelidos);
    }
    
    public void seleccionarXogador(){
        System.out.println("O selecciona xogadores o seleccionador");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse o seleccionador");
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxar o seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar o seleccionador");
    }

    @Override
    public void xogarPartido() {
        System.out.println("Xogar partido o seleccionador");
    }
    
    @Override
    public String toString() {
        return "Seleccionador:"+"\n" 
                +"Nome:"+getNome() 
                +", Apelido:"+getApelidos()
                +", ID:"+getId()
                +", Idade:"+getIdade();
    }
    
}
