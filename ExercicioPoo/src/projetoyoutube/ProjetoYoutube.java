package projetoyoutube;
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula PHP");
        v[1] = new Video("Aula Java");
        v[2] = new Video("Aula HTML");
        for (int i = 0; i < 3; i++) {
          System.out.println(v[i].toString());
      }
        Gafanhoto g = new Gafanhoto("Alex", 27, "M", "1234");
        
    }

}
