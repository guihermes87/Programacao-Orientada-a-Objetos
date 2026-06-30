public abstract class Animal {

    protected  String especie;
    protected int idade;

    
    public abstract void emiteSom();
    
    public void exibeInfo() {
    
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade);
        
    }
    
    public void cuidarPatio() {
        System.out.println("Cuidando do pátio...");
    }

}