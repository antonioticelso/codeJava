public class Aula7Modulo7 {

    public static void main(String[] args) {

//        Utilizando o tipo: 'char';
        char pessoaFeminino = 'F';

        if(pessoaFeminino == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Masculino");
        }

//        String no Java sera um texto de tamanho qualquer.
        String textoQualquer = "Outra Coisa que está sendo usado.";
        System.out.println(textoQualquer);

        String nome = "Tonhão";
        String cpf = "734.780.302-68";
        String telefone = "(61) 97347-8030";
        String endereco = "Avenida Taylândia - DF";

        System.out.println("Meu nome é: " + nome + "\n CPF: " + cpf
                + "\n Telefone: " + telefone
                + "Endereço: " + endereco);

    }

}


