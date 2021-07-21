package com.example.alz_jaime;

public class RegistroMedicamentoTomado {
    public static String Registro = "";

    //Metodo para obtener el registro desde la base de datos
    public static void fullregistro(String registro){
        Registro = registro;
    }

    //Metodo para agregar mas medicamentos al registro
    public static void setRegistro(String fecha, String medicamento){
        if(!Registro.equals(""))
            Registro += "   " + fecha + ": " + medicamento;
        else
            Registro = fecha + ": " + medicamento;
    }

    //metodo para mostrar el registro
    public static String getRegistro(){
        String RegistroActualizado = Registro.replaceAll("   ","\n");
        return RegistroActualizado;
    }
}
