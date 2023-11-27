
package Model;

public class Livro {
    
    private int id;
    private String nome;
    private String autor;
    private String tipo;

    public Livro(int id, String nome, String autor, String tipo) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.tipo = tipo;
    }

    public Livro(String nome, String autor, String tipo) {
        this.nome = nome;
        this.autor = autor;
        this.tipo = tipo;
    }

    public Livro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
