
public class Principal {

public static void main(String[] args) {

    // Carro Carro1 = new Carro("Opala");
    // Carro1.exibeMsg();

    
    // Onibus Onibus1 = new Onibus();
    // Onibus1.setNome("Mercedes");
    // Onibus1.setModelo("Modelo 2024");
    // System.out.println("O modelo do ônibus é " + Onibus1.getModelo());

    // Onibus1.exibeMsg();

//     Scanner teclado = new Scanner (System.in);

//    Cachorro Cachorro1 = new Cachorro();
//    Cachorro1.setNome("Rex");
//    Cachorro1.setIdade(5);
   
//    System.out.println("O nome do cachorro é " + Cachorro1.getNome());
//    System.out.println("A idade do cachorro é " + Cachorro1.getIdade());


//     Cachorro1.setSom("Au Au");

//     Cachorro1.latir();
    
    // teclado.close();
        
    Pessoa Pessoa1 = new Pessoa (20, "Maria");
    

    Pessoa1.exibeDados();

    PessoaJuridica Empresa1 = new PessoaJuridica(16,"zyz");
    
    PessoaJuridica Empresa2 = new PessoaJuridica(12, "José", "CNPJ123456789", "Jose", "10/05/2008");
    

    Empresa1.exibeDados();
    Empresa2.exibeDados();

   



}




}
