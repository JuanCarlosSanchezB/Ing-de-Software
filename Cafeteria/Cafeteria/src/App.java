import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //String entrada = "Cafe, 2, 3, 4, 5, 6, 7";
        //Entrada(entrada);
    }
    public static void Entrada(String entrada)
    {

        StringBuilder nombreArticulo = new StringBuilder();
        List<Integer> tamaños = new ArrayList<>();

        //revisar si no hay más de una coma
        ValidComas(entrada);

        //funcion para separar nombre de tamaños
        Split(entrada, nombreArticulo, tamaños);

        //revisar si el nombre son puras letras
        ValidName(nombreArticulo.toString());

        //revisar si el nombre de la bebida tiene el tamaño correcto
        nuevaBebida(nombreArticulo.toString());

        //revisar si los tamaños estan ordenados de forma ascendente
        ValidOrder(tamaños);

        //revisar si cada tamaño es valido
        for(int i = 0; i < tamaños.size(); i++)
        {
            if(!ValidSize(tamaños.get(i)))
            {
                throw new IllegalArgumentException("Tamaño inválido");
            }
        }
        //
        
        
        
        //
        System.out.println("La bebida fue ingresada correctamente");
    }
    private static void ValidComas(String input) {
        String[] partes = input.split(",");
        int cantidadComas = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ',') {
                cantidadComas++;
            }
        }
        if((partes.length-1) != cantidadComas)
        {
            throw new IllegalArgumentException("Asegurate de que cada numero esté separado SOLO por una coma");
        }
    }
    private static void Split(String input, StringBuilder nombreArticulo, List<Integer> tamaños) {
        nombreArticulo.setLength(0);
        String[] partes = input.split(",");
        nombreArticulo.append(partes[0].trim());
        if(partes.length>6) throw new IllegalArgumentException("Solo se pueden poner máximo 5 tamaños por bebida");
        for (int i = 1; i<partes.length; i++) {
            try {
                int numero = Integer.parseInt(partes[i].trim());
                tamaños.add(numero);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("No se pudo convertir a número: " + partes[i]);
            }
        }
    }
    private static boolean ValidName(String nombreArticulo) {
        for(int i = 0; i < nombreArticulo.length(); i++)
        {
            if(!Character.isLetter(nombreArticulo.charAt(i)))
            {
                throw new IllegalArgumentException("El nombre de la bebida no es valido");
            }
        }
        return true;
    }
    
    private static boolean nuevaBebida(String bebida) 
    { 
        if (bebida.length() > 2 && bebida.length() < 15) 
            return true; 
        else 
        { 
            throw new IllegalArgumentException("El nombre de la bebida no es valido");
        } 
    } 

    private static boolean ValidSize(int size) { 
        if (size < 2 || size > 48) { 
            return false; 
        } else { 
            return true; 
        } 
    } 

    private static void ValidOrder(List<Integer> tamaños) { 
        for (int i = 0; i < tamaños.size() - 1; i++) { 
            if (tamaños.get(i) > tamaños.get(i + 1)) { 
                throw new IllegalArgumentException("Los tamaños no están ordenados de forma ascendente"); 
            } 
        } 
    }


}
