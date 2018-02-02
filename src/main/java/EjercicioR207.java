import java.util.ArrayList;

class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        // Escribe tu código a continuación...
        String aDevolver = "";
        while(palabras.size() != 0){
            String palabraMayorLongitud = palabras.get(0);
            for (String palabra : palabras){

                if (palabra.length() >= palabraMayorLongitud.length()){
                    palabraMayorLongitud = palabra;
                }
            }
            aDevolver = aDevolver + palabraMayorLongitud;
            palabras.remove(palabraMayorLongitud);
            if (palabras.size() > 0){
                aDevolver = aDevolver + ",";
            }
        }
        return aDevolver;
    }
}