public class Pessoa extends SerHumano {

        public Pessoa(String tipo, String nome, int idade) {
            
            super(tipo, nome, idade);
        }


     @Override
     public void falar() {
         System.out.println("A maioria das pessoas falam");
     }

}
