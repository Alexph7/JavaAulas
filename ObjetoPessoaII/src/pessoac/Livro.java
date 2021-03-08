package pessoac;

public class Livro implements Publicacao{
  private String titulo;
  private String autor;
  private int totpaginas;
  private int paginatual;
  private boolean aberto;
  private Pessoa leitor;

  public String detalhes() {
    return "Titulo do Livro = "+titulo+" \nAutor = "+autor+" \nTotpaginas = "+totpaginas+"\nPaginatual = "+paginatual + ", \nAberto = " + aberto + ",\nLeitor = " + leitor.getNome();
  }

  public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totpaginas = totpaginas;
    this.aberto = false;
    this.paginatual = 0;
    this.leitor = leitor;
  }
     
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotpaginas() {
    return totpaginas;
  }

  public void setTotpaginas(int totpaginas) {
    this.totpaginas = totpaginas;
  }

  public int getPaginatual() {
    return paginatual;
  }

  public void setPaginatual(int paginatual) {
    this.paginatual = paginatual;
  }

  public boolean isAberto() {
    return aberto;
  }
  
  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int p) {
    this.setPaginatual(p);
    if(this.isAberto());
  }

  @Override
    public void avancarPag() {
      if(this.isAberto()){
        if(this.getPaginatual()<this.getTotpaginas()){
          this.setPaginatual(this.getPaginatual()+1);
        }else{
          System.out.println("Impossivel Folhear, Fim do Livro");
        }
      }else{
        System.out.println("Impossivel Avançar Pois o Livro Está Fechado.");
      }
    }
    
  @Override
  public void voltarPag() {
    this.setPaginatual(this.getPaginatual()-1);
  }   
}