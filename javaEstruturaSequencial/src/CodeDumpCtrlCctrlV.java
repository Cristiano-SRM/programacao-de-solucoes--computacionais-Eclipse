/* DUMP DE CODIGOS PARA CTRL C CTRL V FACIL.
SCANNER TECLADO:
import java.util.Scanner;
		Scanner input=new Scanner(System.in);

PAINEIS:
import javax.swing.JOptionPane;

METODO PARA NORMALIZAR STRINGS
    private static String normalizarString(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        String withoutAccents = normalized.replaceAll("[^\\p{ASCII}]", "");
        return withoutAccents.toLowerCase();










*/
