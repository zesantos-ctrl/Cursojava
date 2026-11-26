package memoria_arrays_listas.pensionato;

public class Rent {
    private String nome;
    private String email;

    public Rent() {
    }

    public Rent(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(", ").append(email);
        return sb.toString();
    }

}
