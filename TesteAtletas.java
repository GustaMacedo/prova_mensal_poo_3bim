/*Gustavo Macedo de Paulo 29/08/2023 */


public class TesteAtletas{
    public static void main(String args[]){
        System.out.println("\n\n");
        Maratonista mineiro=new Maratonista();
        mineiro.setNome("José dos Santos");
        mineiro.correr();
        System.out.println("\n\n");
        Estradista corisco=new Estradista();
        corisco.setNome("Manoela Assis");
        corisco.Pedalar();
        System.out.println("\n\n");
    }
}