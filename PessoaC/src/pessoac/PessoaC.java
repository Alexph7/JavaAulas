package pessoac;
public class PessoaC {

     public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l = new Livro[3];
       
       p[0] = new Pessoa("Carlos", 28, "M");
       p[1] = new Pessoa("Warley", 29, "M");
       
       l[0] = new Livro("Javac 1", "Gustavo G .", 39, p[1]);
       l[1] = new Livro("Javac2", "A. Andrade", 123, p[0]);
       l[2] = new Livro("Javac", "Pedro Kall", 322, p[1]);
       
       l[0].abrir();
       l[0].avancarPag();
       l[0].getTitulo();
       System.out.println(l[0].detalhes());
       
       
    }

}
