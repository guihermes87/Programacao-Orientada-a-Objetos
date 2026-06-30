
public class Cachorro extends Animal {

    public String raca;

    @Override
    public void emiteSom() {
        System.out.println("Au au");
        
    }

    @Override
    public void cuidarPatio() {
        System.out.println("Cuidando do pátio...");
    }

    @Override
    public void exibeInfo() {
        super.exibeInfo();
        System.out.println("Raça: " + this.raca);
    }





    

}
