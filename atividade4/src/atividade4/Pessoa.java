package atividade4;

public class Pessoa {

    private int idade;
    private float altura;
    private float peso;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void IMC(float peso, float altura, String nome) {
        float IMC;
        IMC = (peso / (altura * altura));
        System.out.println("A PESSOA: " + nome + " , TEM IMC: " + IMC);
        
    }
}
