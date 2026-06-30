public class SerHumano extends Animal {

    protected String nome;
    protected int idade;

        public SerHumano(String tipo, String nome, int idade) {
            super(tipo);
            this.nome = nome;
            this.idade = idade;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void falar() {
            System.out.println("Nem todos falam");
        }

        @Override
        public void andar() {
            System.out.println("Nem todos andam");
        }

}
