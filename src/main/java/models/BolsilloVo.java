package models;

public class BolsilloVo {

    private int Id_BolsilloDigital;
    private String Nombre_Bolsillo;
    private int saldo;
    private boolean Estado;
    
    public BolsilloVo() {
    }

    public BolsilloVo(int id_BolsilloDigital, String nombre_Bolsillo, int saldo, boolean estado) {
        Id_BolsilloDigital = id_BolsilloDigital;
        Nombre_Bolsillo = nombre_Bolsillo;
        this.saldo = saldo;
        Estado = estado;
    }

    public int getId_BolsilloDigital() {
        return Id_BolsilloDigital;
    }

    public void setId_BolsilloDigital(int id_BolsilloDigital) {
        Id_BolsilloDigital = id_BolsilloDigital;
    }

    public String getNombre_Bolsillo() {
        return Nombre_Bolsillo;
    }

    public void setNombre_Bolsillo(String nombre_Bolsillo) {
        Nombre_Bolsillo = nombre_Bolsillo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }







    
    
}
