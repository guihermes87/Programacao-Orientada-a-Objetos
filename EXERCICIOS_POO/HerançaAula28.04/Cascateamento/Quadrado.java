public class Quadrado extends Desenho2D{

    protected String desc; 
    
    public Quadrado(int largura, int altura, String desc, String nomeAutor) {
        super(largura, altura, nomeAutor);
        this.desc = desc;
        this.nomeAutor = nomeAutor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
   public void ExibirDados() {
         System.out.println("Autor: " + this.nomeAutor);
         System.out.println("Largura: " + this.largura);
         System.out.println("Altura: " + this.altura);
         System.out.println("Descrição: " + this.desc);
   }

   @Override
   public String toString() {
    return "Quadrado [nomeAutor=" + nomeAutor + ", largura=" + largura + ", desc=" + desc + ", altura=" + altura
            + ", getNomeAutor()=" + getNomeAutor() + ", getDesc()=" + getDesc() + ", getClass()=" + getClass() + "]";
   }
    


}
