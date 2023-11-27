
package Model;

public class Nota {
    
    private int idNota;
    private int valorNota;
    private int fk_idUser;
    private int fk_idLivro;

    public Nota(int idNota, int valorNota, int fk_idUser, int fk_idLivro) {
        this.idNota = idNota;
        this.valorNota = valorNota;
        this.fk_idUser = fk_idUser;
        this.fk_idLivro = fk_idLivro;
    }

    public Nota(int valorNota, int fk_idUser, int fk_idLivro) {
        this.valorNota = valorNota;
        this.fk_idUser = fk_idUser;
        this.fk_idLivro = fk_idLivro;
    }

    public Nota(int valorNota, int fk_idUser) {
        this.valorNota = valorNota;
        this.fk_idUser = fk_idUser;
    }

    public Nota() {
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(int valorNota) {
        this.valorNota = valorNota;
    }

    public int getFk_idUser() {
        return fk_idUser;
    }

    public void setFk_idUser(int fk_idUser) {
        this.fk_idUser = fk_idUser;
    }

    public int getFk_idLivro() {
        return fk_idLivro;
    }

    public void setFk_idLivro(int fk_idLivro) {
        this.fk_idLivro = fk_idLivro;
    }
}
